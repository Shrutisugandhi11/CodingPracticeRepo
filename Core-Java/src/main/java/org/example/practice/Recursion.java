package org.example.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Recursion {
    public static void printName(String name,int n){
        if(n==0){
            return;
        }
        System.out.println(name);
         printName(name,--n);
    }
    public static int printSum(int n){
        if(n==0){
            return 0;
        }
       return n+printSum(--n);
    }
    public static void swap(int [] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static boolean palindrome(String str,int a,int b){
        if(a==b) return true;
        if (str.charAt(a)!=str.charAt(b)) return false;
        return palindrome(str,a+1,b-1);

    }

    public static void reverse(int []arr,int i,int n){

        if(i>n){
            return;
        }
        swap(arr,i,n);
        reverse(arr,i+1,n-1);
            }
    public static int fibonacii(int n){
    if(n==0){
        return 0;
    }
      if (n==1 || n==2) return 1;
      return fibonacii(n-2)+fibonacii(n-1);
    }
    public static int power(int digit,int pow){
        if(pow==1){
            return digit;
        }

        return digit* power(digit,pow-1);
    }
    public static  int stair(int stair){
        if(stair==1) return 1;
        if (stair==2) return 2;
        return stair(stair-1)+stair(stair-2);
    }
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println(power(2,10));
//        System.out.println(stair(4));
//        System.out.println("name");
//       // String name=scanner.nextLine();
//        System.out.println("Loop:");
//        int n=scanner.nextInt();
//       // printName(name,n);
//        System.out.println(printSum(n));
//        int [] arr ={1,2,3,4,5};
//        Arrays.stream(arr).forEach(System.out::println);
//        reverse(arr,0, arr.length-1);
//        Arrays.stream(arr).forEach(System.out::println);
//        System.out.println(palindrome("madam",0,4));
//        System.out.println(palindrome("mdam",0,3));
//        System.out.println(fibonacii(9));


        for(int i=0;i<5;i++){
            for (i=0;i<5;i++){
                for (i=0;i<5;i++){
                    System.out.println(i);
                }
            }
        }


    }
}
