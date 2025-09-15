package com.ssll.spring6.res.controller;

import com.ssll.spring6.res.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Controller;

@Controller("myUserController")
public class UserController {

    @Resource(name = "myUserService")
    private UserService userService;

    public void out() {
        userService.out();
        System.out.println("111Controller层执行结束。");
    }

}