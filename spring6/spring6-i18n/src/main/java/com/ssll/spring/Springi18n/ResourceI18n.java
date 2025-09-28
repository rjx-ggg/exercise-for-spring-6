package com.ssll.spring.Springi18n;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * ClassName: ResourceI18n
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/26 13:36
 */
public class ResourceI18n {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Object[] objects = new Object[]{"染染熊", "2025-9-26"};
        String message = context.getMessage("www.ssll.com", objects, Locale.CHINA);
        String message1 = context.getMessage("www.ssll.com", objects, new Locale("en", "BG"));
        System.out.println(message);
        System.out.println(message1);


    }
}
