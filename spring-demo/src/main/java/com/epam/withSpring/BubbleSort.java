package com.epam.withSpring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BubbleSort implements SortAlgorithm {


    @Override
    public int sort(int number) {
        return 2;
    }
}
