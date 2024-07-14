package org.example.upper.bound;

import java.util.ArrayList;

public class A{


    public void m1(ArrayList<?extends A> al){

        System.out.println("upper bound called"+al+al.getClass().getName());
    }
}
