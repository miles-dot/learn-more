package com.wxlspace.bean;

import org.springframework.beans.factory.BeanNameAware;

public class ABeanNameAware implements BeanNameAware {

    @Override
    public void setBeanName(String name) {
        System.out.println("### 我是ABeanNameAware ### [" + name + "]");
    }
}
