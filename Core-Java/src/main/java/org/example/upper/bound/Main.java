package org.example.upper.bound;

import org.example.basic.Account;
import org.example.basic.Gold;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main( String[] args )
    {

        ArrayList<? extends A> list=new ArrayList<C>();
        A a=new B();
        a.m1(list);
        A a1 =new C();
//        a.m1();

        System.out.println( "Hello World!" );
    }

}
