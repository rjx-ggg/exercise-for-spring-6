package com.ssll.spring6.res.dao;

import org.springframework.stereotype.Repository;

@Repository("myUserDaoRedis")
public class UserDaoRedisImpl implements UserDao {

    @Override
    public void print() {
        System.out.println("Redis Dao层执行结束");
    }
}