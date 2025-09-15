package com.ssll.spring6.bean;

import com.ssll.spring6.config.Spring6Config;
import com.ssll.spring6.res.controller.MyUserController;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserAnnotationTest {

    private Logger logger = LoggerFactory.getLogger(UserAnnotationTest.class);

    @Test
    public void testAnnotation(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Spring6Config.class);
        MyUserController userController = context.getBean(MyUserController.class);
        userController.out();
        logger.info("执行成功");
    }


}