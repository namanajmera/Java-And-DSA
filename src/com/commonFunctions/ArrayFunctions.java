package com.commonFunctions;

import java.util.Scanner;

public class ArrayFunctions {

    static Scanner sc = new Scanner(System.in);
    public static int[] createArray(){
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static int[][] create2DArray(){
        System.out.print("Enter n value ==> ");
        int n = sc.nextInt();
        System.out.print("Enter m value ==> ");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }

    public static void print2DArray(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
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
