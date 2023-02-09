package com.wsy.auto.controller;

import com.wsy.auto.service.UserService;
import com.wsy.auto.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author within
 * @date 2023-02-09 11:01
 */
public class UserController {


    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void addUserController(){
        System.out.println("--UserController--");
//        原生写法
//        UserService userService = new UserServiceImpl();
//        userService.addUserService();

        userService.addUserService();
    }
}
