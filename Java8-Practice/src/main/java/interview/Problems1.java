package interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Problems1 {
    public static void main(String[] args) {

        //winner loser char based on count
        String charString = "aabbccdeff";
        Map<String, Long> collect = Arrays.stream(charString.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Long min = collect.values().stream().min(Long::compareTo).get();
        Long max= collect.values().stream().max(Long::compareTo).get();

        List<Map.Entry<String, Long>> collect1 = collect.entrySet().stream().filter(longEntry -> longEntry.getValue().equals(min)).toList();
        List<Map.Entry<String, Long>> collect2 = collect.entrySet().stream().filter(longEntry -> longEntry.getValue().equals(max)).toList();

        System.out.println(collect1.size()==1?"none":collect1.get(0)+" min");
        System.out.println(collect2.size()==1?"none":collect2.get(0)+" max");

    }
}
