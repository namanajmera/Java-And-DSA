package com.searching;

import com.commonFunctions.ArrayFunctions;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = ArrayFunctions.createArray();
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int index = binarySearch(arr,value);
        System.out.println("Index=> " + index);
    }

    private static int binarySearch(int[] arr, int value) {
        int start = 0;
        int end = arr.length -1;
        while (start <= end) {
            int mid = (start + end) /2;
            if (arr[mid] == value) {
                return mid;
            }else if(arr[mid] > value){
                end = mid -1;
            }else if(arr[mid] < value){
                start = mid +1;
            }
        }
        return -1;
    }
}
