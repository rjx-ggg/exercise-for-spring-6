package com.ssll.spring6.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * ClassName: TestUser
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/15 13:33
 */
public class TestUser {
    public static void main(String[] args) {
        // 1.加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        // 2.获取对象
        User user = context.getBean(User.class);
        System.out.println(user);
    }
}
