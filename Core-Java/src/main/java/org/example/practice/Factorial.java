package org.example.practice;

import java.util.Scanner;

public class Factorial {

    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return fact(n-1)*n;
    }

    public static void main(String[] args) {
        System.out.println("Enter number:");
        int n=new Scanner(System.in).nextInt();
        System.out.println(fact(n));
    }
}
