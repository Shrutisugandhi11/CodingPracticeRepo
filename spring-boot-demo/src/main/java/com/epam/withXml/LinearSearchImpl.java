package com.epam.withXml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class LinearSearchImpl {
    @Autowired
    @Qualifier
    private MergeSort searchAlgorithm;


    public int binarySearch() {
        System.out.println(searchAlgorithm);
        return searchAlgorithm.sort(1) + 1;
    }


}
