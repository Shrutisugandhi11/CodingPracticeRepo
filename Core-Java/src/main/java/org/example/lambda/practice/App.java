package org.example.lambda.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

interface Conditinal<T> {


    boolean test(Person person);
}

public class App {
    public static void main(String[] args) {


        List<Person> list = Arrays.asList(
                new Person("shruti", "sugandhi", 22),
                new Person("nandini", "sharma", 25),
                new Person("vithal", "saraf", 40),
                new Person("keshav", "gupta", 30),
                new Person("lambish", "lamb", 23),
                new Person("amrita", "rao", 50),
                new Person("amrita", "rao", 50)
        );

//1.Sort list on the basis of last name
        Collections.sort(list, (c1, c2) -> (c1.getLastName().compareTo(c2.getLastName())));
        System.out.println(list);
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
//2.create a method that prints all the element of list
        print(list, p -> true);

//3.write a method to print surname starting with 's'
        System.out.println("-------------------------------------------------");
        System.out.println("-------------------------------------------------");
        print(list, (person) -> person.getLastName().startsWith("s"));
    }

    public static void print(List<Person> list, Conditinal conditional) {
        for (Person person : list)
            if (conditional.test(person)) {
                System.out.println(person);
            }

        list.stream().map(person -> person.getAge()).collect(Collectors.toList()).forEach(System.out::println);
        list.stream().limit(3).forEach(System.out::println);
        //   list.stream().flatMap().collect(Collectors.toList()).forEach(System.out::println);
        //find duplicate
        List<String> stringList = list.stream().map(person -> person.getFirstName()).collect(Collectors.toList());
        stringList.stream().filter(string -> Collections.frequency(stringList, string) > 1).distinct().forEach(System.out::println);
        //find unique
        stringList.stream().filter(s -> Collections.frequency(stringList, s) == 1).forEach(System.out::println);

        //find duplicate with groupby
        System.out.println("------------------------groupby-------------------------");
        Map<String, Long> map = list.stream().map(person -> person.getFirstName()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.entrySet().stream().filter(longEntry -> longEntry.getValue() > 1).map(s -> s.getKey()).forEach(System.out::println);

        //find person in desc order or age
        list.stream().map(Person::getAge).sorted(Comparator.reverseOrder()).forEach(System.out::println);
        String string = "lamb";
        list.stream().filter(x -> x.getFirstName().equals(string) || x.getLastName().equals(string)).forEach(System.out::println);
        System.out.println("------------------------top 3 oldest-------------------------");
        //top 3 oldest people
        list.stream().sorted((p1, p2) -> p2.getAge() - p1.getAge()).limit(3).forEach(System.out::println);

        System.out.println("------------------------age less then 3rd highest-------------------------");
        list.stream().sorted((p1, p2) -> p2.getAge().compareTo(p1.getAge())).skip(3).limit(1).forEach(System.out::println);

        System.out.println("------------------------statistics------------------------");
        IntSummaryStatistics stream = list.stream().mapToInt(Person::getAge).summaryStatistics();
        System.out.println("getMax: " + stream.getMax() + " getAverage: " + stream.getAverage() + " getCount: " + stream.getCount());
        System.out.println("getMin: " + stream.getMin() + " getSum: " + stream.getSum());

        //grouping by
        System.out.println("------------------------group by------------------------");
        list.stream().collect(Collectors.groupingBy(Person::getAge)).entrySet().stream().forEach(System.out::println);
        System.out.println("------------------------group by using set------------------------");
        list.stream().collect(Collectors.groupingBy(Person::getFirstName, Collectors.toSet())).entrySet().forEach(System.out::println);


        System.out.println("================================================================================================================================end======================================================");
        List<String> ls1 =  Arrays.asList( "Mumbai", "Munnar",      "chennai",


                "Hyderabad");
         ls1.stream().filter(str -> str.toLowerCase().startsWith("m")).map(String::length).forEach(System.out::println);

    }

}