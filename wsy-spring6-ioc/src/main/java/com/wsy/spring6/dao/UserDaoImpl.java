package com.wsy.spring6.dao;

import com.wsy.spring6.core.annotation.Bean;

/**
 * @author within
 * @date 2023-02-10 18:02
 */
@Bean
public class UserDaoImpl implements UserDao{
    @Override
    public void print() {
        System.out.println("Dao层执行结束");
    }
}
