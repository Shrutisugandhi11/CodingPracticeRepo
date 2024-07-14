package com.epam.traditional;

import com.epam.withSpring.SortAlgorithm;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Scope("prototype")
public class MergeSort implements SearchAlgorithm {


    @Override
    public int sort(int number) {
        return 2;
    }
}
