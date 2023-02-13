package com.wsy.spring6.dao;

import com.wsy.spring6.core.AnnotationApplicationContext;
import com.wsy.spring6.service.UserService;
import org.junit.jupiter.api.Test;
import com.wsy.spring6.core.ApplicationContext;

/**
 * @author within
 * @date 2023-02-13 10:11
 */
class UserDaoTest {
    @Test
    public void testIoc() {
        ApplicationContext applicationContext = new AnnotationApplicationContext("com.wsy.spring6");
        UserService userService = (UserService)applicationContext.getBean(UserService.class);
        userService.out();
        System.out.println("run success");
    }
}