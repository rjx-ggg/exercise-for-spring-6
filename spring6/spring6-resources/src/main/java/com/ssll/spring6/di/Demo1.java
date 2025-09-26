package com.ssll.spring6.di;

import com.ssll.spring6.resouceloaderaware.TestBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class Demo1 {

    public static void main(String[] args) {
        /*
         * 通过搜索文件系统路径下的xml文件创建ApplicationContext，
         * 但通过指定classpath:前缀强制搜索类加载路径
         * classpath:bean.xml
         * */
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("classpath:bean*.xml");
        System.out.println(ctx);
        User bean = ctx.getBean(User.class);
        TestBean bean1 = ctx.getBean(TestBean.class);
        System.out.println(bean);
        System.out.println(bean1);
        Resource resource = ctx.getResource("ssll.txt");
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
    }
}