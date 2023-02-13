package com.wsy.calculator.proxy;

import com.wsy.calculator.service.Calculator;
import com.wsy.calculator.service.impl.CalculatorLogImpl;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author within
 * @date 2023-02-13 16:31
 */
class ProxyFactoryTest {
    @Test
    public void testDynamicProxy(){
        ProxyFactory factory = new ProxyFactory(new CalculatorLogImpl());
        Calculator proxy = (Calculator) factory.getProxy();
        proxy.div(99,3);
        proxy.add(1,1);
    }

}