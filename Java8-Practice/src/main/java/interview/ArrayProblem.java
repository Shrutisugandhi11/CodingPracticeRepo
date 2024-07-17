package interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayProblem {
    public static Integer[] mergeArrays() {
//        9) I have two sorted arrays. Need to merge those.
//        {1,2,3,4,5}-->{1,2,3,4,5,6}
//        {2,3,4,6}
        int[] arr = {1, 2, 3, 4, 5};
        int[] brr = {6, 7, 8, 9};
        // int [] res=new int[5];
        Set<Integer> integerSet = new HashSet<>();
        for (int i : arr) {
            integerSet.add(i);
        }
        for (int i : brr) {
            integerSet.add(i);
        }
        return integerSet.toArray(new Integer[0]);
    }

    public static void main(String[] args) {

        System.out.println(mergeArrays());
//        11) How to remove duplicates from an arrayList?
        List<Integer> list = List.of(1, 2, 2, 2, 2, 3, 4, 5, 6, 6);
        List<Integer> res = new ArrayList<>();
        List<Integer> list1 = list.stream().distinct().toList();
        System.out.println(list1);
        for (int i = 0; i < list.size() - 1; i++) {

            if (! res.contains(list.get(i)))
                res.add(list.get(i));
        }
        System.out.println(res);
    }
}
