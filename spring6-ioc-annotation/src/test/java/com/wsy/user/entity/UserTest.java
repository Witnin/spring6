package com.wsy.user.entity;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author within
 * @date 2023-02-09 16:37
 */
class UserTest {
    @Test
    public void testAutoByName(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        User user = ac.getBean("user",User.class);
        System.out.println(user);

    }
}