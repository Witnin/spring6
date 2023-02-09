package com.wsy.auto.service;

import com.wsy.auto.dao.UserDao;
import com.wsy.auto.dao.UserDaoImpl;

/**
 * @author within
 * @date 2023-02-09 11:09
 */
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void addUserService() {
        System.out.println("--addUserService--");
//        UserDao userDao = new UserDaoImpl();
//        userDao.addUserDao();

        userDao.addUserDao();
    }
}
