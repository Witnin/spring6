package com.wsy.system.controller;

import com.wsy.system.entity.Dept;
import com.wsy.system.entity.Emp;
import com.wsy.user.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author within
 * @date 2023-02-07 17:48
 */
public class TestDept {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean-system-ref.xml");
        //2、根据类型获取bean，只能有一个（单实例对象）
        Dept dept = context.getBean("deptP",Dept.class);
        dept.info3();

    }
}
