package com.wsy.user.controller;

import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author within
 * @date 2023-02-03 11:08
 */
class UserControllerTest {

    private final Logger logger = LoggerFactory.getLogger(UserControllerTest.class);

    @Test
    public void testUserObject() {
        //加载spring配置文件bean.xml，对象创建
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

        //获取对象的创建
        UserController user = (UserController) context.getBean("user");
        System.out.println(user);

        //使用对象调用方法进行测试
        user.add();

        logger.debug("---执行成功---");
    }

    //不用new,可以反射创建对象，对xml文件进行解析操作，获取xml文件bean标签属性值id,class,使用反射根据类全路径创建对象
    //创建对象放到 Map<String, BeanDefinition> beanDefinitionMap
    //key:唯一标识，value:类的定义（描述信息）
    @Test
    public void testUserReflex() throws Exception{
      Class<?> clazz = Class.forName("com.wsy.user.controller.UserController");
        UserController user = (UserController)clazz.getDeclaredConstructor().newInstance();
        System.out.println(user);
        //使用对象调用方法进行测试
        user.add();
    }

}