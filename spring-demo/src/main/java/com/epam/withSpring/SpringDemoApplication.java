package com.epam.withSpring;

import com.epam.traditional.LinearSearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.annotation.PostConstruct;

@SpringBootApplication(scanBasePackages= "com.epam")
public class SpringDemoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringDemoApplication.class, args);
        BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
        BinarySearchImpl binarySearch2 = applicationContext.getBean(BinarySearchImpl.class);

        System.out.println(binarySearch.binarySearch());
        System.out.println(binarySearch2.binarySearch());
        LinearSearchImpl linearSearch = applicationContext.getBean(LinearSearchImpl.class);
        System.out.println(linearSearch.binarySearch());


    }

}