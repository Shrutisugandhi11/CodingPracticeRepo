package sort;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={1,9,3,8,5,6,7,4,2,0};
        int brr[]=    insertionSort(arr);
        String str="";
        for (int i:brr) {
            str=str+i+",";
        }
        System.out.println(str);
    }

    private static int[] insertionSort(int[] arr) {
        for(int i=1;i< arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[i]){
                  //  findPosition(arr,)
                }
            }
        }
    return arr;
    }
}
