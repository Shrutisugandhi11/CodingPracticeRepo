package org.example.basic;

public class Account <T>{
    String username;
    Float balance;

    public  void getAccountType(T t){
        System.out.println("Your account type is:" + t.getClass().getName());
    }
}
