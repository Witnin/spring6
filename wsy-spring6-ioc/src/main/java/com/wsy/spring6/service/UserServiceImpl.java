package com.wsy.spring6.service;

import com.wsy.spring6.core.annotation.Bean;
import com.wsy.spring6.core.annotation.Di;
import com.wsy.spring6.dao.UserDao;

/**
 * @author within
 * @date 2023-02-10 18:03
 */
@Bean
public class UserServiceImpl implements UserService{

    @Di
    private UserDao userDao;

    @Override
    public void out() {
        userDao.print();
        System.out.println("Service层执行结束");
    }
}
