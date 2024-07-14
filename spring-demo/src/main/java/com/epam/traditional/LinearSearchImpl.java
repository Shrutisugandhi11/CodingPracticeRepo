package com.epam.traditional;

import com.epam.withSpring.SortAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class LinearSearchImpl {
    @Autowired
    @Qualifier
    private SearchAlgorithm searchAlgorithm;


    public int binarySearch() {
        System.out.println(searchAlgorithm);
         return searchAlgorithm.sort(1) + 1;
    }


}
