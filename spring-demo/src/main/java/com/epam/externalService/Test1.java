package com.epam.externalService;

import com.epam.cdi.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:system.properties")
public class Test1 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Test.class, args);
        SomeService someService = applicationContext.getBean(SomeService.class);
        System.out.println(someService.getUrl());
    }
}
