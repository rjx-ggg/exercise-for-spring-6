package com.ssll.iocxml;

import com.ssll.iocxml.factorybean.UserBean;
import com.ssll.iocxml.life.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: LifeTest
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/6 21:30
 */
public class LifeTest {

    @Test
    public void testbeanLife(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-life.xml");
        // 名称获取Bean
        User user = (User) context.getBean("user");
        System.out.println(user.getName());
        context.close();
    }

    @Test
    public void testFactoryBean(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-factoryBean.xml");
        // 名称获取Bean
        UserBean user = (UserBean) context.getBean("user");
    }

}
