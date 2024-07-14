package com.epam.jdbc;

import com.epam.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

//@Repository
public class PersonJdbcRepo {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Person> findAll() {
        return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));
    }

    public Person findById(int id) {
        return jdbcTemplate.queryForObject("select * from person where id=?", new Object[]{id}, new BeanPropertyRowMapper<Person>(Person.class));
    }

    public Person findByName(String name) {
        return jdbcTemplate.queryForObject("select * from person where name=?", new Object[]{name}, new BeanPropertyRowMapper<Person>(Person.class));
    }

    public int deleteById(int id) {
        return jdbcTemplate.update("delete from person where id=?", new Object[]{id});
    }

    public int insert(Person person) {
        return jdbcTemplate.update("insert into person(id,name,location,birth_date) VALUES (?,?,?,?)",
                new Object[]{person.getId(), person.getName()
                        , person.getLocation(), person.getBirthdate()});
    }

}

