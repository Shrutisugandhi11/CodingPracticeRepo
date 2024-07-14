package org.example;

public class Pattern {
    public static void printPattern1(int n){
        for(int i=n-1;i> 0;i--){
            for(int j=1;j<=i;j++){

                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void printPattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){

                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void printPattern3(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){

                System.out.print(j);
            }

            System.out.println();
        }
    }
    public static void printPattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){

                System.out.print(i);
            }

            System.out.println();
        }
    }
    public static void printPattern5(int n){
        for(int i=n;i>0;i--){
            for(int j=i;j>0;j--){

                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void printPattern6(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i +1;j++){

                System.out.print(j);
            }

            System.out.println();
        }
    }
    public static void printPattern7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){

                System.out.print(" ");
            }
            for(int j=0;j< 2*i +1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void printPattern8(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            int i1 = 2*n - 2 * i - 1;
            for(int j = 0; j< i1;j++){
                System.out.print("*");
            }



            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPattern1(5);
        printPattern2(5);
        printPattern3(5);
        printPattern4(5);
        printPattern5(5);
        printPattern6(5);
        printPattern7(5);
        printPattern8(5);
    }
}
