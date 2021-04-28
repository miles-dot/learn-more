package com.wxlspace.bean;

import org.springframework.beans.factory.DisposableBean;

public class GDisposableBean implements DisposableBean {

    @Override
    public void destroy() throws Exception {
        System.out.println("### 我是GDisposableBean ###");
    }
}
