package com.wsy.system.entity;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author within
 * @date 2023-02-08 15:09
 */
class UserTest {

    @Test
    public void testBeanScope(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean-scope.xml");
        User user1 = ac.getBean(User.class);
        User user2 = ac.getBean(User.class);
        System.out.println(user1==user2);
    }

    @Test
    public void testLife(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean-life.xml");

        User bean = ac.getBean("user",User.class);

        System.out.println("6、生命周期：通过IOC容器获取bean并使用");
        System.out.println(bean);
        ac.close();

    }
}