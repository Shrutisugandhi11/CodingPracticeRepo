package com.epam.cdi;

import com.epam.traditional.MergeSort;
import com.epam.traditional.SearchAlgorithm;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class LinearSearchImplCdi {
    @Inject
    private MergeSortCdi searchAlgorithm;


    public int binarySearch() {
        System.out.println(searchAlgorithm);
        return searchAlgorithm.sort(1) + 1;
    }


}
