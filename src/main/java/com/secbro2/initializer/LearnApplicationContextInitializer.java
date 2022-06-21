package com.secbro2.initializer;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.annotation.Order;

@Order(123)
public class LearnApplicationContextInitializer implements ApplicationContextInitializer {


    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.err.println("容器初始化bean的数量："+applicationContext.getBeanDefinitionCount());
    }


}
