package com.ssll.iocxml;

import com.ssll.iocxml.bean.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestUser
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/3 7:12
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 名称获取Bean
        User user = (User) context.getBean("user");
        System.out.println(user);
        User user1 = (User) context.getBean("user1");
        System.out.println(user1);
        // 类型获取Bean
        User bean = context.getBean(User.class);
        System.out.println(bean);
        // 根据名称和类型获取Bean
        User user2 = context.getBean("user", User.class);
        System.out.println(user1);
    }


    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserDao userDao = context.getBean(UserDao.class);
        System.out.println(userDao);
        userDao.run();
    }
}
