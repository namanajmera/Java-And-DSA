package com.sorting;

import com.commonFunctions.ArrayFunctions;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = ArrayFunctions.createArray();
        selectionSort(arr,arr.length);
        ArrayFunctions.printArray(arr);
    }

    private static void selectionSort(int[] arr,int n) {
        for (int i=0;i<n-1;i++){
            int minIndex = i;
            int min = arr[i];
            for (int j= i+1;j<n;j++){
                if (min > arr[j]){
                    minIndex = j;
                    min = arr[j];
                }
            }
            swap(arr,i,minIndex);
        }
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
