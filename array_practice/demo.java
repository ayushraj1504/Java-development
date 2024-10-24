package MyJava_udemy.Array_practice;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int A[] = new int[5];
        int B[] = {4,8,6,7,9};
        int C[];
        C = new int[7];
        int[] D = new int[6];
        B[2] = 18;

//        for each loop
        for(int x : B){
            System.out.println(x++);   //this will not increment the value
        }
        System.out.println("Natural array");
        for(int x : B){
            System.out.println(x);
        }
        for(int i=0; i<B.length; i++){
            System.out.println(B[i]++);     //this will increment the value
        }
        System.out.println("Incremented array");
        for(int x : B){
            System.out.println(x);
        }




        System.out.println("User input array");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];                   //another way-  int arr[] = new int[5]
        System.out.println("Enter array element");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        for(int x : arr){
            System.out.println(x);
        }
    }
}
