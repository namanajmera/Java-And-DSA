package com.sorting;

import com.commonFunctions.ArrayFunctions;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = ArrayFunctions.createArray();
        insertionSort(arr);
        ArrayFunctions.printArray(arr);
    }

    private static void insertionSort(int[] arr) {
        for (int i = 0; i<arr.length; i++) {
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}
