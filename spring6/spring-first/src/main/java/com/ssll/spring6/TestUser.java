package com.ssll.spring6;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationTargetException;

/**
 * ClassName: TestUser
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/8/27 22:50
 */
public class TestUser {

    @Test
    public void testUser(){
        //1.加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //2.获取对象
        User user = (User) context.getBean("user");
        System.out.println(user);
        //3.调用方法
        user.add();
    }

    /**
     * 反射创建对象
     */
    @Test
    public void reflection2() throws Exception {

        Class<?> clazz = Class.forName("com.ssll.spring6.User");
//        Class<?> clazz = User.class;
        User user = (User) clazz.getDeclaredConstructor().newInstance();
        user.add();

        // Bean存放的位置：DefaultListableBeanFactory类 的 beanDefinitionMap 字段

    }
}
