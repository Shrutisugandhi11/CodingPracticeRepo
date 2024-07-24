package arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LargestElement {
    public static void main(String[] args) {
        Integer[] arr = {0, 0, 2, 0, 5, 0, 7, 0, 4, 8, 1, 6, 8};
        //Arrays.stream(arr).sorted().skip(arr.length-3).forEach(System.out::println);
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] == 0 && arr[j] != 0) {
                arr[i] = arr[j];
                arr[j] = 0;
            }
            if (arr[i] != 0)
                i++;
            if (arr[j] == 0)
                j--;
        }
        Arrays.stream(arr).forEach(System.out::println);
        Integer[] brr = {2, 4, 5, 67, 7, 58};
        List<Integer> collect1 = Arrays.stream(brr).sorted(Comparator.comparing(Integer::intValue).reversed()).limit(3).collect(Collectors.toList());
        System.out.println("Three largest element:" + collect1);
        Map<Boolean, List<Integer>> collect = Arrays.stream(brr).collect(Collectors.partitioningBy(ele -> ele % 2 == 0));
        System.out.println(collect);
        int max1 = brr[0], max2 = brr[0];
        int itr = 0;
        while (itr < brr.length) {
            if (brr[itr] > max1) {
                max2 = max1;
                max1 = brr[itr];
            }
            if (brr[itr] > max2 && brr[itr] != max1)
                max2 = brr[itr];
            itr++;
        }
        System.out.println(max2);


        //min max using two pointer
        int inputArr[] = {1, 2, 3, 4, 5, 6, 7};
        int outputBrr[] = new int[inputArr.length];
        int low = 0, high = inputArr.length - 1, index = 0;
        boolean b = true;
        while (low <= high) {
            if (b) {
                outputBrr[index] = inputArr[high];
                high--;
            } else {
                outputBrr[index] = inputArr[low];
                low++;
            }
            index++;
            b = !b;
        }
        Arrays.stream(outputBrr).forEach(System.out::println);
    }
}
