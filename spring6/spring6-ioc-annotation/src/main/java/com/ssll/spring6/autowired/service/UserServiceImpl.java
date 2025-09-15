package com.ssll.spring6.autowired.service;

import com.ssll.spring6.autowired.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

//    @Autowired
//    private UserDao userDao;

//    @Autowired
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

//    @Autowired
//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

//    public UserServiceImpl(@Autowired UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Autowired
    @Qualifier("userDaoRedisImpl")
    private UserDao userDao;

//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

//    public UserServiceImpl(UserDao userDao,String cc) {
//        this.userDao = userDao;
//    }

    @Override
    public void out() {
        userDao.print();
        System.out.println("Service层执行结束");
    }
}