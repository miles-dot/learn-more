package com.wxlspace.bean;

import org.springframework.beans.factory.InitializingBean;

public class EInitializingBean implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("### 我是EInitializingBean ###");
    }
}
