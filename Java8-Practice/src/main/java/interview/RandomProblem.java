package interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class RandomProblem {
    public static void main(String[] args) {
        int[] intArray = {15, 10, 16, 20, 8, 9, 7, 50};

        for (int i=0;i<intArray.length;i++){
            int next=-1;
                    for (int j = i+1; j < intArray.length ; j++) {
                if(intArray[i]<intArray[j]){
                    next=intArray[j];
                break;
            }


        } System.out.println(intArray[i]+"-"+next);}
    }
    public static void NGEII(){
        int[] intArray = {15, 10, 16, 20, 8, 9, 7, 50};
        int []NGE=new int[intArray.length];
        Stack<Integer>stack=new Stack<>();
        stack.add(0);
        for(int i=1;i<intArray.length;i++){
            if(intArray[stack.peek()]>=intArray[i]){
                stack.add(i);
            }
            else {
                NGE[stack.peek()]=intArray[i];
                stack.pop();
            }

        }
    }
}
