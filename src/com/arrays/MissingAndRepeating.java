package com.arrays;

import com.commonFunctions.ArrayFunctions;

import java.util.Arrays;

public class MissingAndRepeating {
    public static void main(String[] args) {
        int[] arr = ArrayFunctions.createArray();
        int[] result = findTwoElement(arr, arr.length);
        ArrayFunctions.printArray(result);
    }

    private static int[] findTwoElement(int[] arr, int n) {
        int[] result = new int[2];
        Arrays.sort(arr);
        int count = 1;
        if (arr[0] != 1) {
            result[1] = 1;
        }
        if (arr[0] == count){
            count++;
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                result[0] = arr[i];
            }
            if (arr[i] == count ) {
                count++;
            }
        }
        result[1] = count;
        return result;
    }
}
