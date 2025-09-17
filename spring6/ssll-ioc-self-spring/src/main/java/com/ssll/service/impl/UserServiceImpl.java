package com.ssll.service.impl;

import com.ssll.annotation.Bean;
import com.ssll.annotation.Di;
import com.ssll.dao.UserDao;
import com.ssll.service.UserService;

/**
 * ClassName: UserServiceImpl
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/17 13:15
 */

@Bean
public class UserServiceImpl implements UserService {

    @Di
    private UserDao userDao;

    @Override
    public void addUser() {
        System.out.println("userService add user");
        userDao.addUser();
    }


}
