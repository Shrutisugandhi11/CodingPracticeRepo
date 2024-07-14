package search;

public class BinarySearch {
    public static int BSearch(int[] a,int begin,int end,int element){
        if(end>=begin){
        int mid=(end+begin)/2;
        if(a[mid]==element)
            return mid;
        else if (a[mid]>element) {
           return BSearch(a,begin,mid,element);
        }
      
            return BSearch(a,mid+1,end,element);


    }  return -1;}

    public static void main(String[] args) {
       int arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91}; int target = 23;
        System.out.println(BSearch(arr,0, arr.length-1, target));
    }
}
