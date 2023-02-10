package com.wsy.autowired.service.impl;

import com.wsy.autowired.dao.UserDao;
import com.wsy.autowired.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author within
 * @date 2023-02-09 16:50
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public void addUserService() {
        System.out.println("(--addUserService--)");
        userDao.addUserDao();
    }
}
