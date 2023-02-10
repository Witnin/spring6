package com.wsy.autowired.controller;

import com.wsy.config.Spring6Config;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author within
 * @date 2023-02-09 17:00
 */
class UserControllerTest {

    private final Logger logger = LoggerFactory.getLogger(UserControllerTest.class);

    @Test
    public void testAutowired(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        UserController userController = ac.getBean("userController",UserController.class);
        userController.addController();

    }

    @Test
    public void testAllAnnotation(){
        ApplicationContext context = new AnnotationConfigApplicationContext(Spring6Config.class);
        UserController userController = context.getBean("userController", UserController.class);
        userController.addController();
        logger.info("执行成功");
    }
}