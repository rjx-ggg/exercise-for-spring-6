package com.ssll.dao.impl;

import com.ssll.annotation.Bean;
import com.ssll.dao.UserDao;

/**
 * ClassName: UserDaoImpl
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/17 13:16
 */

@Bean
public class UserDaoImpl implements UserDao {

    @Override
    public void addUser() {
        System.out.println("userDao add user");
    }
}
