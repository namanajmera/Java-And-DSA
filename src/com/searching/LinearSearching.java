package com.searching;

import com.commonFunctions.ArrayFunctions;

import java.util.Scanner;

public class LinearSearching {
    public static void main(String[] args) {
        int[] arr = ArrayFunctions.createArray();
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int index = linearSearch(arr,value);
        System.out.println("Index=> " + index);
    }

    private static int linearSearch(int[] arr, int value) {
        for (int i=0;i<arr.length;i++){
            if (arr[i] == value){
                return i+1;
            }
        }
        return -1;
    }
}
