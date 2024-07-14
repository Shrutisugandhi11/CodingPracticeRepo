package sort;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        int brr[] = selectionSort(arr);
        String str="";
        for (int i:brr) {
            str=str+i+",";
        }
        System.out.println(str);

    }

    private static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex =i;
            for (int no = i; no < arr.length; no++) {
                if (arr[i] > arr[no]) {
                    minIndex=no;
                }}
            swap(arr,i,minIndex);
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int minIndex) {
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }




}