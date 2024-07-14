package com.epam.cdi;

import com.epam.traditional.LinearSearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.logging.Logger;

@SpringBootApplication
public class Test {
    public static void main(String[] args) {

        ApplicationContext applicationContext= SpringApplication.run(Test.class,args);
        LinearSearchImplCdi linearSearch=applicationContext.getBean(LinearSearchImplCdi.class);

        System.out.println(linearSearch.binarySearch());
        System.out.println(linearSearch);
    }
}
