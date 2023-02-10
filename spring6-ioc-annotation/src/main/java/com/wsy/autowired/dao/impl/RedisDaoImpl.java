package com.wsy.autowired.dao.impl;

import com.wsy.autowired.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author within
 * @date 2023-02-09 16:51
 */
@Repository
public class RedisDaoImpl implements UserDao {
    @Override
    public void addUserDao() {
        System.out.println("--addRedisDao--");
    }
}
