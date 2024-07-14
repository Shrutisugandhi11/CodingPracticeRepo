package com.epam.traditional;

import com.epam.withSpring.SortAlgorithm;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class RadixSort implements SearchAlgorithm {


    @Override
    public int sort(int number) {
        return 4;
    }
}
