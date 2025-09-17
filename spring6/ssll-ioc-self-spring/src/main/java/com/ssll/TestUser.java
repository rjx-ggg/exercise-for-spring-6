package com.ssll;

import com.ssll.bean.AnnotationApplicationContext;
import com.ssll.bean.ApplicationContext;
import com.ssll.dao.UserDao;
import com.ssll.service.UserService;

/**
 * ClassName: TestUser
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/17 23:01
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationApplicationContext("com.ssll");
        UserDao userDao = (UserDao)applicationContext.getBean(UserDao.class);
        userDao.addUser();
        UserService userService = (UserService)applicationContext.getBean(UserService.class);
        userService.addUser();
    }
}
