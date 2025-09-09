package com.ssll.iocxml.auto;

import com.ssll.iocxml.auto.controller.UserController;
import com.ssll.iocxml.factorybean.UserBean;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestUser
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/10 7:42
 */
public class TestUser {
    @Test
    public void test_auto(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-auto.xml");
        // 名称获取Bean
        UserController controller = (UserController) context.getBean("userController");
        controller.addUser();
    }

}
