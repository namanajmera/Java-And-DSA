package com.arrays;

import com.commonFunctions.ArrayFunctions;

public class RemoveDuplicateElementFromSortedArray {
    public static void main(String[] args) {
        int[] arr = ArrayFunctions.createArray();
        int neArraySize = removeDuplicates(arr,arr.length);
        for (int i = 0; i < neArraySize; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int removeDuplicates(int[] arr,int n) {
        if (n == 0 || n == 1){
            return n;
        }
        int newSize = 0;
        int[] temp = new int[n];
        for (int i = 0; i < n-1; i++){
            if (arr[i] != arr[i + 1]){
                temp[newSize++] = arr[i];
            }
        }
        temp[newSize++] = arr[n-1];
        for (int i = 0; i < newSize; i++){
            arr[i] = temp[i];
        }
        return newSize;
    }
}
