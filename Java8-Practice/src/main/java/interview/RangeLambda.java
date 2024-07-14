package interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RangeLambda {
    public static void main(String[] args) {
//        Q12) Given an array of integers (2,34,54,23,33,20,59,11,19,37 ) group
//        the numbers by the range they belong to.
//        The put put should be {0=[2], 50=[54,59], 20=[23,20], 10=[11,19], 30=[34,33,37]}

        List<Integer> list = List.of(2, 34, 54, 23, 33, 20, 59, 11, 19, 37, 215, 300);
        list.stream().map(num -> (num / 10) * 10).forEach(System.out::println);
        Map<Integer, List<Integer>> collect = list.stream().collect(Collectors.groupingBy(num -> (num / 10) * 10));
        System.out.println(collect);


//    Q13) Given a List of Strings  ["as", "123", "32", "2as"],
//    create another Integer list that contains only integers.
//    The output shoul be: List<Integer> iList = [123,32]
        String[] string = new String[]{"as", "123", "32", "2as"};
        List<Integer> list1 = Arrays.stream(string).filter(s -> s.matches("[0-9]+")).map(i -> Integer.parseInt(i)).collect(Collectors.toList());
        list1.forEach(System.out::println);

//        Q14) Given an array of integers arr = {5,6,7,8,5,5,8,8,7)
//        find the sum of the unique elements.
//         The output should be in this case is: 26.

        int[] arr12 = new int[]{5, 6, 7, 8, 5, 5, 8, 8, 7};
        long ans = Arrays.stream(arr12).distinct().sum();
        System.out.println(ans);
        // Arrays.stream(arr12).collect(Collectors.toMap(Function.identity(),o -> o,(o, o2) -> o));


        // Q15 ) Given a numeric array , re arrange the elements to form a smallest possible value.
//        input is: int arr[] = {1, 34, 3, 98, 9, 76, 45, 4};
//        output is: 133444576998

        int arr1[] = {1, 34, 3, 98, 9, 76, 45, 4};

        // Arrays.sort(arr1);
        //   Arrays.stream(arr1).forEach(System.out::println);
        System.out.println(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        String collect1 = Arrays.stream(arr1).mapToObj(String::valueOf).sorted((o1, o2) -> (o1 + o2).compareTo(o2 + o1)).collect(Collectors.joining());
        System.out.println(collect1);
        System.out.println("collect");
        Arrays.stream(arr1).mapToObj(i -> i + "").sorted().forEach(System.out::print);


        //Q16) Given a numeric array , re arrange the elements to form a highest possible value.
        // output is: 998764543431

        int arr[] = {1, 34, 3, 98, 9, 76, 45, 4};
        System.out.println("----------------------------------------------------------");
        String string1 = Arrays.stream(arr).mapToObj(String::valueOf).sorted((o1, o2) -> (o2 + o1).compareTo(o1 + o2)).collect(Collectors.joining());
        //  System.out.println(string1);

        BiFunction<String, String, Integer> fun = (o1, o2) -> (o2 + o1).compareTo(o1 + o2);
        String s1 = String.valueOf(arr[1]);
        String s2 = String.valueOf(arr[2]);
        System.out.println(fun.apply(s1, s2) + "--" + s1 + "--" + s2 + "--s1+s2--" + s1 + s2 + "--s2+s1--" + s2 + s1);
        // Q17)  Given a String = The quick brown fox jumps over the lazy dog find the first non repeated character. (Google interview)

        String string3 = "he quick brown fox jumps over the lazy dog";
        LinkedHashMap<String, Long> linkedHashMap = Arrays.stream(string3.split("")).collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
        System.out.println(linkedHashMap);
        String s = linkedHashMap.entrySet().stream().filter(longEntry -> longEntry.getValue() == 1).map(Map.Entry::getKey).findFirst().get();
        System.out.println(s);

        System.out.println("=============================");
        String res = Arrays.stream(string3.split("")).filter(c -> string3.indexOf(c) == string3.lastIndexOf(c)).findFirst().get();
        System.out.println(res);


//        1) Find the longest word in a sentence?
//
//        Input: I am interested to grow in my organization
//        output is: organization

        String Input1 = "I am interested to grow in my organization";

        String output = Arrays.stream(Input1.split(" ")).sorted(Comparator.comparing(String::length).reversed()).findFirst().get();
        Optional<String> collect2 = Arrays.stream(Input1.split(" ")).collect(Collectors.maxBy(Comparator.comparingInt(String::length)));
        System.out.println(output);
        System.out.println(collect2.get());
    }

}

