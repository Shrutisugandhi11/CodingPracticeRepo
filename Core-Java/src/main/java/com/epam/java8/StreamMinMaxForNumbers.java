package com.epam.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMinMaxForNumbers {
    public static void main(String[] args) {

        // list of integer numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,1, 2, 3, 4, 5);
        // get minimum number from list of integers
      Integer minoutput1=  numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();
       Integer minoutput2= numbers.stream().reduce(Integer::min).get();
        System.out.println("minOutput1:"+ minoutput1+"--------"+"minOutput2:"+minoutput2);
        // get maximum number from list of integers
        Integer maxoutput1=  numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
        Integer maxoutput2= numbers.stream().reduce(Integer::max).get();
        System.out.println("maxOutput1:"+ maxoutput1+"--------"+"maxOutput2:"+maxoutput2);

        // list of characters
        List<Character> chars = Arrays.asList(
                'a', 'b', 'c',
                'd', 'e', 'f',
                'g', 'h', 'i'
        );
        // get minimum char from list of characters


        Character minoutput3=  chars.stream().min(Comparator.comparing(Character::charValue)).get();
              System.out.println("minOutput3:"+ minoutput3);
        Set<Integer>set=new HashSet<>();
        numbers.stream().filter(s->set.add(s));


    }}
