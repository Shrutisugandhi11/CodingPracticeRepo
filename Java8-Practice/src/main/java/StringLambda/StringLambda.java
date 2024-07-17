package StringLambda;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringLambda {


    public static void main(String[] args) {
        String s = "I am interested123455 to grow in my organization";
        String[] s1 = s.split(" ");
        String s2 = Arrays.stream(s1).max(Comparator.comparing(String::length)).get();
        System.out.println(s2.length());

     List<String> stringList=Arrays.stream(s1).sorted(Comparator.comparing(String::length).reversed()).skip(2)
                .limit(1).toList();
     stringList.forEach((t)-> System.out.println(t.length()));



        //Q6) Given a sentence, find the number of occurrence of each word.



        String input = "the quick brown fox jumps right over the little lazy dog little";
        Map<String, Long> collect = Arrays.stream(input.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> collect2 = Arrays.stream(input.split(" ")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        Map<String, Integer> collect3 = Arrays.stream(input.split(" ")).collect(Collectors.toMap((w) -> w, String::length,(integer, integer2) -> integer));
        System.out.println(collect);
        System.out.println(collect2);
        System.out.println(collect3);







            String sentence = "Find the word with the maximum number of vowels in this sentence";


        }

    }


