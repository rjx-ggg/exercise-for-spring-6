package com.ssll.iocxml.auto.controller;

import com.ssll.iocxml.auto.service.UserService;

/**
 * ClassName: UserController
 * Description:
 *
 * @Author 染染熊
 * @Version 1.0
 * @Create 2025/9/10 7:29
 */
public class UserController {

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUser(){
        System.out.println("controller add user...");
        userService.addUser();
    }

}
