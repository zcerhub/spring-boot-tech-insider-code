package com.secbro2.configuration;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class WithoutAnnotationConfiguration {

    public WithoutAnnotationConfiguration() {
        System.err.println("WithoutAnnotationConfiguration对象被创建");
    }

    @Value("${admin.name}")
    private String name;

    @Value("${admin.age}")
    private String age;


}
