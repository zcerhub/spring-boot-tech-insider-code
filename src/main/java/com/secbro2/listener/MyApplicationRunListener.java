package com.secbro2.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class MyApplicationRunListener implements SpringApplicationRunListener {

    public MyApplicationRunListener(SpringApplication application,String[] args) {
        System.err.println("MyApplicationRunListener constructed function");
    }

    @Override
    public void starting() {
        System.err.println("starting...");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        System.err.println("environmentPrepared...");
    }


}
