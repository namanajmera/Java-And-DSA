package com.sorting;

import com.commonFunctions.ArrayFunctions;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = ArrayFunctions.createArray();
        bubbleSort(arr, arr.length);
        ArrayFunctions.printArray(arr);
    }

    private static void bubbleSort(int[] arr, int length) {
        int counter = 1;
        boolean swapped;
        while (counter < length) {
            swapped = false;
            for (int i = 0; i < length - counter; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                    swapped = true;
                }
            }
            counter++;
            if (!swapped){
                break;
            }
        }
    }

    private static void swap(int[] arr, int i, int i1) {
        int temp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = temp;
    }
}
