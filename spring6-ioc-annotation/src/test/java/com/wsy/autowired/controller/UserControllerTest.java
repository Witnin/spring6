package com.wsy.autowired.controller;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author within
 * @date 2023-02-09 17:00
 */
class UserControllerTest {
    @Test
    public void testAutowired(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        UserController userController = ac.getBean("userController",UserController.class);
        userController.addController();

    }
}