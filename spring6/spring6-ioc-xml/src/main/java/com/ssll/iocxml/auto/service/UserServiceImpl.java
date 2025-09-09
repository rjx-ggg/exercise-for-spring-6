package com.ssll.iocxml.auto.service;

import com.ssll.iocxml.auto.dao.UserDao;

/**
 * ClassName: UserServiceImpl
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/10 7:30
 */
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUser() {
        System.out.println("service save user...");
        userDao.addUser();
    }
}
