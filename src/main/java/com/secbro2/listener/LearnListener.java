package com.secbro2.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class LearnListener implements ApplicationListener<ContextRefreshedEvent> {


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.err.println("监听器获取容器中初始化bean数量："+event.getApplicationContext().getBeanDefinitionCount());
    }


}
