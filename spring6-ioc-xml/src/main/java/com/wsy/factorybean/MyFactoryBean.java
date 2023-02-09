package com.wsy.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author within
 * @date 2023-02-09 10:37
 */
public class MyFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
