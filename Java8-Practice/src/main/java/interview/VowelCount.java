package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class VowelCount {

    private static int countVowels(String word) {
        return (int) word.toLowerCase().chars()
                .filter(value -> "aeiou".indexOf(value) != -1).count();
    }

    public static void main(String[] args) {
        //  Q9) Given a string, find the words with the maximum number of vowels.

        String sentence = "The quick brown fox jumps right over the little lazy dog";
        String s = "e ui o o u i oe e ie a o";
        String[] words = sentence.split(" ");
//        Maximum Number of Vowels: 2
//        output Words: quick, over, little  ( because each word has maximum of 2 vowels)

        System.out.println("-------------------------------------------------------");
        String str = Arrays.stream(words).map(e -> e.replaceAll("[^aeiouAEIOU]", "")).max(Comparator.comparing(String::length)).get();

        Arrays.stream(words)
                .filter(e -> e.replaceAll("[^aeiouAEIOU]", "").length() == str.length())
                .forEach(System.out::println);

        String string1 = "kesh#av";//-->"kesh1av"-->va1hsek
        // output  --> "vahs#ek"
        int i = string1.replaceAll("^[A-Za-z]", "1").indexOf(1);
        List<String> collect = Arrays.stream(string1.split("")).sorted(Collections.reverseOrder()).collect(Collectors.toList());

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> collect1 = list.stream().collect(Collectors.partitioningBy(a -> a % 2 == 0));

        collect1.get(true).stream().forEach(System.out::println);

        System.out.println(collect1);


        collect1.entrySet().stream().forEach(System.out::println);
        System.out.println("---------------------------------------------------");

        list.stream().collect(Collectors.groupingBy(A -> A % 2 == 0)).entrySet().forEach(System.out::println);

        String input = "Swa$pn&il";//--- swapnil
        List<Character> collect2 = input.chars().peek(System.out::println).filter(Character::isLetter).mapToObj(s1 -> (char) s1).collect(Collectors.toList());
        Collections.reverse(collect2);//--linpaws
        StringBuffer sb = new StringBuffer();
        int idx = 0;
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                sb.append(collect2.get(idx));
                idx++;
            }
            else
                sb.append(c);

        }

    }


}
