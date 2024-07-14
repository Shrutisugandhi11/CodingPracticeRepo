package com.epam;

import com.epam.entity.Person;
import com.epam.jdbc.PersonJdbcRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;


//@SpringBootApplication
public class SpringJdbcApplication implements CommandLineRunner {
    Logger logger = LoggerFactory.getLogger(this.getClass());
//    @Autowired
    PersonJdbcRepo personJdbcRepo;

    public static void main(String[] args) {
       // SpringApplication.run(SpringJdbcApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        logger.info("Users are: -> {}", personJdbcRepo.findAll());
//        logger.info("User with id: -> {}", personJdbcRepo.findById(1));
//        logger.info("Users with name: -> {}", personJdbcRepo.findByName("lavish"));
//        logger.info("Users with id deleted: -> {}", personJdbcRepo.deleteById(3));
//        logger.info("Inserting user : -> {}", personJdbcRepo.insert(new Person(4,"didi","mumbai",new Date())));
    }
}
