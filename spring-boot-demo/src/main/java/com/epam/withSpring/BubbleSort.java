package com.epam.withSpring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSort implements SortAlgorithm {


    @Override
    public int sort(int number) {
        return 2;
    }
}
