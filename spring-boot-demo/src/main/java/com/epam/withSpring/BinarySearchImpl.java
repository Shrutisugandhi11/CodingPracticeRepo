package com.epam.withSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class BinarySearchImpl {
    @Autowired
     private SortAlgorithm bubbleSort;


    public int binarySearch() {
        System.out.println(bubbleSort);
        return bubbleSort.sort(1) + 1;
    }

}
