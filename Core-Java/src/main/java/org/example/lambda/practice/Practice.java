package org.example.lambda.practice;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice {

    public static void main(String[] args) {
//1.find duplicates
        List<Integer> list = Arrays.asList(10, 20, 30, 10, 40, 50, 50, 60);
        List<Integer> list1 = list.stream().filter(integer -> Collections.frequency(list, integer) > 1).distinct().collect(Collectors.toList());
        System.out.println(list1);

//2.multiply using F.I.
        BiFunction<Integer, Integer, Integer> function = (integer1, integer2) -> integer1 * integer2;

        System.out.println(function.apply(2, 4));
        list.stream().forEach(System.out::print);

//3.limit and skip
        System.out.println("----------------------limit-------------");
        list.stream().limit(3).forEach(System.out::print);
        System.out.println("----------------------skip--------------");
        list.stream().skip(3).forEach(System.out::print);

 //4.frequency of word in a string
        String string="welcome to code decode and code decode welcome you";
        List<String> stringList=Arrays.asList(string.split(" "));
     stringList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((s, aLong) -> System.out.println(s+"="+aLong));

//4.predicate to check if no is prime or not
        Predicate<Integer>predicate1=n->n>1;
        Predicate<Integer> predicate= i->IntStream.range(2,i).noneMatch(n->i%n==0);



    }
}
