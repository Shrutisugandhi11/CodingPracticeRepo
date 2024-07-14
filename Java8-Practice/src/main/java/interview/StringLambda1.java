package interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StringLambda1 {
    public static void main(String[] args) {
//        3) Find the 2nd highest length in the sentence.
//        4) FInd the length of the 2nd longest word.
        String s1 = "The quick brown fox jumps over the lazy dog, find the first non repeated character";

        List<String> collect = Arrays.stream(s1.split(" ")).sorted(Comparator.comparing(String::length).reversed()).skip(1).limit(1).toList();
        System.out.println(collect);


//        5) List of cities
//
//        "Mumbai"
//        "Munnar"
//        "chennai"
//        "Hyderabad"
//
//        Calcullate the lenght of each city where the city name starts with 'm' or 'M' and create a list.
//
//
//        Can you  write a program to create another list that contains the cities start with "m"?

        String[] str1 = {"Mumbaii", "Munnar", "chennai", "Hyderabad"};
        Map<Integer, List<String>> m = Arrays.stream(str1).filter(w -> w.toLowerCase().startsWith("m")).collect(Collectors.groupingBy(String::length));

        System.out.println(m);

//        6)  I have to arrays
//        int arr1[] = {21,6,8,9,10,5};
//        int arr2[] = {10,21,5,8,6,9};
//
//        write a program to check whether both arrays are equal or not.

        int arr1[] = {21, 6, 8, 9, 10, 5};
        int arr2[] = {10, 21, 5, 8, 6, 9};
        int reduce1 = Arrays.stream(arr1).reduce(0, Integer::sum);
        int reduce2 = Arrays.stream(arr2).reduce(0, Integer::sum);
        boolean b = Arrays.equals(arr1, arr2);
        System.out.println(reduce1 == reduce2);

//        7)  Given a string, find the words with the maximum number of vowels.
//        "The quick brown fox jumps right over the little lazy dog."
//        Maximum Number of Vowels: 2
//        output Words: quick, over, little  ( because each word has maximum of 2 vowels)

        String str2 = "The quick brown fox jumps right over the little lazy dog.";

        int vowelCount = Arrays.stream(str2.split(" "))
                .map(w -> w.replaceAll("[^aeiouAEIOU]", "").length())
                .peek(System.out::println)
                .max(Integer::compareTo).get();

        List<String> stringList = Arrays.stream(str2.split(" "))
                .filter(w -> w.replaceAll("[^aeiouAEIOU]", "").length() == vowelCount)
                .toList();
        System.out.println(stringList);
//        10) A List<String> contains alpha, numeric and alpha numeric values as strings. Write a program to create a List<Integer>s from the original List.
//
//        input :  List <String> ls =  ["as", "123", "32", "2as"]
//        output : List<Integer> iList = [123,32]

        List<String> ls=List.of("as", "123","123", "32", "2as","32","bc1","xyz");
        List<String> collect1 = ls.stream().filter(stringList1 -> stringList1.matches("[0-9]*")).collect(Collectors.toList());
        System.out.println(collect1);
       // 11) How to remove duplicates from an arrayList?
        Set<String> collect2 = new LinkedHashSet<>(ls);
        System.out.println(collect2);
    }
}

