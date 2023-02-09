package com.wsy.user.controller;

import com.wsy.user.entity.User;
import com.wsy.user.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author within
 * @date 2023-02-06 16:46
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //2、根据类型获取bean，只能有一个（单实例对象）
        UserService user = context.getBean(UserService.class);
        user.run();
        System.out.println("根据类型获取Bean:"+user);
    }
}
