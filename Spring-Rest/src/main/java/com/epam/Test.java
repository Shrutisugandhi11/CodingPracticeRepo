package com.epam;

final class Student {
    final private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


}

public class Test {
    public static void main(String[] args) {
       String str1="shruti";
       String str2="shr";
        System.out.println(str1.hashCode()==str2.hashCode());
       str2= str2.concat("uti");
        System.out.println(str1.hashCode() == str2.hashCode());
    }
}
