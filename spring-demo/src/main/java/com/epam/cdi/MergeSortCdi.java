package com.epam.cdi;


import com.epam.traditional.SearchAlgorithm;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.inject.Named;

@Named
public class MergeSortCdi {


    public int sort(int number) {
        return 2;
    }
}
