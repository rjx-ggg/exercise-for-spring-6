package com.ssll.bean;

import com.ssll.annotation.Bean;
import com.ssll.annotation.Di;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName: AnnotationApplicationContext
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/17 13:25
 */
public class AnnotationApplicationContext implements ApplicationContext {

    // 创建存放Bean对象的Map集合
    private Map<Class, Object> beanFactory = new HashMap<>();
    private static String rootPath;

    // 返回对应类的对象
    @Override
    public Object getBean(Class clazz) {
        return beanFactory.get(clazz);
    }


    // 设置包的扫描规则
    public AnnotationApplicationContext(String basePackage) {

        try {
            // 完善路径，将.转换为\\
            String packagePath = basePackage.replaceAll("\\.", "\\\\");
            // 获取绝对路径
            Enumeration<URL> urls = Thread.currentThread().getContextClassLoader().getResources(packagePath);
            while (urls.hasMoreElements()) {
                URL url = urls.nextElement();
                String filePath = URLDecoder.decode(url.getFile(), "UTF-8");
                System.out.println(filePath);
                rootPath = filePath.substring(0, filePath.length() - packagePath.length());
                // 扫描包下的所有类，并实例化和放入到beanFactory集合中
                loadBean(new File(filePath));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 属性注入
        loadDi();

    }

    /**
     * 加载依赖注入
     */
    private void loadDi() {
        for (Map.Entry<Class, Object> entry : beanFactory.entrySet()) {
            Class<?> key = entry.getKey();
            Object value = entry.getValue();
            Class<?> aClass = value.getClass();
            // 获取所有属性
            Field[] declaredFields = aClass.getDeclaredFields();
            for (Field declaredField : declaredFields) {
                // 判断属性是否有注解
                if (declaredField.isAnnotationPresent(Di.class)) {
                    // 获取对应实例
                    Object bean = beanFactory.get(declaredField.getType());
                    // 设置属性可访问
                    declaredField.setAccessible(true);
                    try {
                        // 给属性赋值
                        declaredField.set(value, bean);
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        }
    }

    /**
     * 递归加载bean
     * @param fileParent
     */
    private  void loadBean(File fileParent) {
        // 判断是否为文件夹
        if (fileParent.isDirectory()) {
            // 获取文件夹下的所有文件
            File[] childrenFiles = fileParent.listFiles();
            if(childrenFiles == null || childrenFiles.length == 0){
                return;
            }
            // 遍历文件夹下的所有文件
            for (File child : childrenFiles) {
                if (child.isDirectory()) {
                    //如果是个文件夹就继续调用该方法,使用了递归
                    loadBean(child);
                } else {
                    //通过文件路径转变成全类名,第一步把绝对路径部分去掉
                    String pathWithClass = child.getAbsolutePath().substring(rootPath.length() - 1);
                    //选中class文件
                    if (pathWithClass.contains(".class")) {
                        //    com.ssll.dao.UserDao
                        //去掉.class后缀，并且把 \ 替换成 .
                        String fullName = pathWithClass.replaceAll("\\\\", ".").replace(".class", "");
                        try {
                            Class<?> aClass = Class.forName(fullName);
                            //把非接口的类实例化放在map中
                            if(!aClass.isInterface()){
                                Bean annotation = aClass.getAnnotation(Bean.class);
                                if(annotation != null){
                                    Object instance = aClass.newInstance();
                                    //判断一下有没有接口
                                    if(aClass.getInterfaces().length > 0) {
                                        //如果有接口把接口的class当成key，实例对象当成value
                                        System.out.println("正在加载【"+ aClass.getInterfaces()[0] +"】,实例对象是：" + instance.getClass().getName());
                                        beanFactory.put(aClass.getInterfaces()[0], instance);
                                    }else{
                                        //如果没有接口把自己的class当成key，实例对象当成value
                                        System.out.println("正在加载【"+ aClass.getName() +"】,实例对象是：" + instance.getClass().getName());
                                        beanFactory.put(aClass, instance);
                                    }
                                }
                            }
                        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }


}
