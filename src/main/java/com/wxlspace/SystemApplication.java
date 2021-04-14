package com.wxlspace;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SystemApplication {

    private static final Logger logger = LoggerFactory.getLogger(SystemApplication.class);

    /**
     * 程序启动类
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(SystemApplication.class, args);
        logger.info("Application started successfully");
    }
}
