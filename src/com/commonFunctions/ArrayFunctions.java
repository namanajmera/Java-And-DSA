package com.commonFunctions;

import java.util.Scanner;

public class ArrayFunctions {
    public static int[] createArray(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void printArray(long[] arr){
        for (long j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
}
