package org.example.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practice {
     public static void   main(String[] args) {
     List<String> list=new ArrayList<>(List.of(new String[]{"abc","abc", "def", "ghi", "jkl"}));
     list.stream().map(l->l.split(" ")).flatMap(Arrays::stream).distinct().forEach(System.out::println);
     List<Integer> numbers=Arrays.asList(1,1,1,2,2,2,3,4,5,6,7,8,9,10);
    numbers.stream().map(num->(num*num)).forEach(System.out::println);
    numbers.stream().filter(num->num%2==0).sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("---------------------------------------------------------");
    int in=numbers.stream().max(Comparator.comparing(i->i)).get();
        System.out.println(in);


       int reduce= numbers.stream().reduce(0,(integer, integer2) -> integer+integer2);
        System.out.println(reduce);

        Set<Integer> set=new HashSet<>();
        numbers.stream().filter(s-> !set.add(s)).distinct().forEach(System.out::println);

        list.stream().collect(Collectors.groupingBy(s -> s,Collectors.counting()))
                .entrySet().forEach(System.out::println);

        int [] arr=new int[]{1,2,3,4,5,6,7,8,9};
       int max= Arrays.stream(arr).max().getAsInt();
        System.out.println(".........Max..........."+max);

    }
}
