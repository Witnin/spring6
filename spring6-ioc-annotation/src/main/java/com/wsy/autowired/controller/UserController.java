package com.wsy.autowired.controller;

import com.wsy.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author within
 * @date 2023-02-09 16:49
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void addController(){
        System.out.println("--controller--");
        userService.addUserService();
    }
}
