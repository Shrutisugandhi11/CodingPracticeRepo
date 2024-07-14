package sort;

public class QuickSort {
    public static void swap(int[] arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static int partition(int[]arr,int l,int h){
        int pivot=l,i=l,j=h-1;
        while(i<j) {
            while (arr[pivot] >arr[i]) {
                i++;
            }
            while (arr[pivot] < arr[j]) {
                j--;
            }
            swap(arr,i,j);
        }
        swap(arr,pivot,j);
        return j;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,0};
    int brr[]=    quickSort(arr,0,arr.length);
    String str="";
        for (int i:brr) {
            str=str+i+",";
        }
        System.out.println(str);

    }

    private static int[] quickSort(int[] arr, int l, int h) {
        if(l<h){
            int pivot=partition(arr, l, h);
            quickSort(arr, l, pivot-1);
            quickSort(arr, pivot+1, h);

        }
        return arr;
    }
}
