package com.epam;

import com.epam.service.ServiceClass1;
import com.epam.service.ServiceClass2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {
    @Autowired
    ServiceClass1 serviceClass1;
    @Autowired
    ServiceClass2 serviceClass2;

    public static void main(String[] args) {
        SpringApplication.run(SpringAopApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(serviceClass1.getSevice());
        System.out.println(serviceClass2.getSevice());

    }
}
