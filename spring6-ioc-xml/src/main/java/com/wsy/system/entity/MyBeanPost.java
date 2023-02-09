package com.wsy.system.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author within
 * @date 2023-02-08 17:39
 */
public class MyBeanPost implements BeanPostProcessor {

    public void init(){
        System.out.println(" init...");
    }

    public void destroy(){
        System.out.println(" destroy...");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("3、bean后置处理器，初始化之前" + beanName + " = " + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("5、bean后置处理器，初始化之后" + beanName + " = " + bean);
        return bean;
    }
}
