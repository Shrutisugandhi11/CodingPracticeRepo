package sort;

public class BubbleSort {
    public static void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static int[] bubbleSort(int[] arr) {
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                    flag=true;
                }

            }
            if(!flag){
                break;
            }

        }
    return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,9,3,8,5,6,7,4,2,0};
        int brr[]=    bubbleSort(arr);
        String str="";
        for (int i:brr) {
            str=str+i+",";
        }
        System.out.println(str);
    }
}
