package com.epam;

import com.epam.withSpring.BinarySearchImpl;
import com.epam.withSpring.SpringDemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringDemoApplication.class)
public class BinarySearchTest {
    @Autowired
    BinarySearchImpl binarySearch;


    @Test
    public void testSort(){
        assertEquals(5,binarySearch.binarySearch());
    }
}
