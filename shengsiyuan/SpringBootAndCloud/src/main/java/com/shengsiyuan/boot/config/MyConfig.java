package com.shengsiyuan.boot.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
    public MyConfigBean myConfigBean(){
        return new MyConfigBean();
    }

}
