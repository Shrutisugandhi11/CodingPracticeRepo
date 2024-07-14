package com.epam.withXml;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MergeSort {


    public int sort(int number) {
        return 2;
    }
}
