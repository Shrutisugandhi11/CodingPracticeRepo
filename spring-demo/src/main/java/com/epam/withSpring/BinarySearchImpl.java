package com.epam.withSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class BinarySearchImpl {
    @Autowired
    @Qualifier
    private SortAlgorithm bubbleSort;


    public int binarySearch() {
        System.out.println(bubbleSort);
        return bubbleSort.sort(1) + 1;
    }
    @PostConstruct
    void m2() {
        System.out.println("m2-post");
    }

    @PostConstruct
    void m1() {
        System.out.println("m1-post");
    }




    @PreDestroy
    public void m3() {
        System.out.println("m3-pre");
    }
    @PreDestroy
    public void m4() {
        System.out.println("m4-pre");
    }

}
