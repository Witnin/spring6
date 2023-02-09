package com.wsy.factorybean;


import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author within
 * @date 2023-02-09 10:41
 */
class UserTest {
    @Test
    public void testBeanScope(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean-factoryBean.xml");
        com.wsy.factorybean.User user = ac.getBean(User.class);
        System.out.println(user);
    }
}