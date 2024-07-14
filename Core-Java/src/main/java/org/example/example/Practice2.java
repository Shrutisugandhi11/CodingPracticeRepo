package org.example.example;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice2 {
    public static void main(String[] args) {
        List<Integer> list1=List.of(1,2,3,4,5);
        List<Integer> list2=List.of(6,7,8,9,10);
        List<int[]> pairs= list1.stream().flatMap(i1->list2.stream().filter(j->(i1+j)%3==0).map(i2->new int[]{i1,i2})).collect(Collectors.toList());
        pairs.stream().forEach((pair)-> System.out.println(pair[0]+".."+pair[1]));
        int number=100;
        IntStream.range(2,number).filter(n->n%2==0).forEach(System.out::println);
       int sum= list1.stream().reduce(Integer::sum).get();
        System.out.println(sum);
       Double avg= list1.stream().collect(Collectors.averagingInt(value ->value ));
        System.out.println(avg);
        list2.stream().map(num->String.valueOf(num)).filter((a->a.startsWith("1"))).forEach(System.out::println);
        int max=list2.stream().reduce(Integer::max).get();
       Long count = list2.stream().count();
        System.out.println(max+".."+count);
    }
}
