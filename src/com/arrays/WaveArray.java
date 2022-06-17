package com.arrays;

import com.commonFunctions.ArrayFunctions;

/*Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array(In Place).
        In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....

        If there are multiple solutions, find the lexicographically smallest one.*/
public class WaveArray {
    public static void main(String[] args) {
        int[] arr = ArrayFunctions.createArray();
        convertToWave(arr,arr.length);
        ArrayFunctions.printArray(arr);
    }

    private static void convertToWave(int[] arr, int length) {
        for (int i = 1; i<length; i+=2){
            swap(arr,i,i-1);
        }
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
