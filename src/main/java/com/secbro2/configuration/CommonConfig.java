package com.secbro2.configuration;

import com.secbro2.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = true)
public class CommonConfig {


    @Bean
    public User user1(){
        user2();
        return new User(1,"root");
    }
    @Bean
    public User user2(){
        System.out.println("user2被调用");
        return new User(2,"admin");
    }

}

