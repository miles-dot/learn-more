package com.wxlspace.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("### 我是DBeanPostProcessor-Before ### [" + beanName + "]");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("### 我是DBeanPostProcessor-After ### [" + beanName + "]");
        return bean;
    }
}
