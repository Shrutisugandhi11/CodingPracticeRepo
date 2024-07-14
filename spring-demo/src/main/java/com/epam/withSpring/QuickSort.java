package com.epam.withSpring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class QuickSort implements SortAlgorithm {


    @Override
    public int sort(int number) {
        return 4;
    }
}
