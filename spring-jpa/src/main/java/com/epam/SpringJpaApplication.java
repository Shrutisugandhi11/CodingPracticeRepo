package com.epam;

import com.epam.entity.Person;
import com.epam.jpa.PersonJpaRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    PersonJpaRepo personJpaRepo;

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        logger.info("User with id: -> {}", personJpaRepo.findById(1));
        logger.info("User with id: -> {}", personJpaRepo.findAll());
        logger.info("User with id: -> {}", personJpaRepo.update(new Person(3,"divya", "mumbai", new Date())));
        logger.info("Inserting user : -> {}", personJpaRepo.insert(new Person("didi", "mumbai", new Date())));
    }
}
