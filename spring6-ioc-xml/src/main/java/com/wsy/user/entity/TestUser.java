package com.wsy.user.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author within
 * @date 2023-02-06 16:21
 */
public class TestUser {
    public static void main(String[] args) {
        //加载spring配置文件bean.xml，对象创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //1、根据ID获取bean
        User user1 = (User) context.getBean("user");
        System.out.println("一、根据ID获取bean:"+user1);

        //2、根据类型获取bean，只能有一个（单实例对象）
        User user2 = context.getBean(User.class);
        System.out.println("二、根据类型获取Bean:"+user2);

        //2、根据ID和类型获取bean
        User user3 = context.getBean("user",User.class);
        System.out.println("三、根据ID和类型获取Bean:"+user3);
    }
}
