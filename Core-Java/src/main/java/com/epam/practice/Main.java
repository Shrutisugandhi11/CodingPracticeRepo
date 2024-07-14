package com.epam.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
       // 1) Remove duplicates from string and return in same order".

        String str1 = "dabfcadef"; //-> dabfce
        str1.chars().distinct().mapToObj(c->(char)c).forEach(System.out::println);
       // 2)  Given a sentence find the word that has the highest length. The solution is:

        String str2 = "I am interested123455 to grow in my organization";
        Arrays.stream(str2.split(" ")).max(Comparator.comparing(String::length)).stream().forEach(System.out::println);

        //3) Given a sentence find the word that has the 2nd (Nth) highest length.
        String str3 = "I am interested123455 to grow in my organization";
        Arrays.stream(str3.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).limit(1).forEach(System.out::println);

    }
}
