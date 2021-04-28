package com.wxlspace.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

public class BBeanFactoryAware implements BeanFactoryAware {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("### 我是BBeanFactoryAware ### [" + beanFactory + "]");
    }
}
