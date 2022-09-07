package com.commonFunctions;

import java.util.Scanner;

public class ArrayFunctions {

    static Scanner sc = new Scanner(System.in);
    public static int[] createArray(){
        System.out.print("Enter the size ==> ");
        int size = sc.nextInt();
        System.out.print("Enter array of "+size+" element ==> ");
        int[] arr = new int[size];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static char[] createCharArray(){
        System.out.print("Enter the character without spaces==> ");
        char[] arr = sc.next().toCharArray();
        return arr;
    }

    public static void printCharArray(char[] arr){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static long[] createArray1(){
        System.out.print("Enter the size ==> ");
        int size = sc.nextInt();
        System.out.print("Enter array of "+size+" element ==> ");
        long[] arr = new long[size];
        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextLong();
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
