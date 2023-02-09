package com.wsy.auto.controller;

import com.wsy.factorybean.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author within
 * @date 2023-02-09 13:58
 */
class UserControllerTest {
    @Test
    public void testAutoByType(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean-autoByType.xml");
        UserController userController = ac.getBean("userController",UserController.class);
        userController.addUserController();

    }

    @Test
    public void testAutoByName(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean-autoByName.xml");
        UserController userController = ac.getBean("userController",UserController.class);
        userController.addUserController();

    }
}