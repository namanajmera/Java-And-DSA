package com.arrays;

import com.commonFunctions.ArrayFunctions;

public class ProductArrayPuzzle {
    public static void main(String[] args) {
        int[] arr = ArrayFunctions.createArray();
//        int[] newArray = bruteForceProductArray(arr, arr.length);
//        int[] newArray = productArray(arr,arr.length);
        long[] newArray = productArrayEfficient(arr, arr.length);
        ArrayFunctions.printArray(newArray);
    }

    private static long[] productArrayEfficient(int[] arr, int length) {
        long[] product = new long[length];
        long[] left = new long[length];
        long[] right = new long[length];

        left[0] = 1;
        right[length - 1] = 1;

        for (int i = 1; i < length; i++) {
            left[i] = arr[i - 1] * left[i - 1];
        }

        for (int j = length - 2; j >= 0; j--) {
            right[j] = arr[j + 1] * right[j + 1];
        }

        for (int i = 0; i < length; i++) {
            product[i] = left[i] * right[i];
        }

        return product;
    }

    //    O(n) but break when there is zero
    private static int[] productArray(int[] arr, int length) {
        int[] newArr = new int[length];
        int product = 1;
        for (int i = 0; i < length; i++) {
            product *= arr[i];
        }
        for (int i = 0; i < length; i++) {
            newArr[i] = product / arr[i];
        }
        return newArr;
    }

    // O(n*2)
    private static int[] bruteForceProductArray(int[] arr, int length) {
        int[] newArr = new int[length];
        int product = 1;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i != j) {
                    product *= arr[j];
                }
            }
            newArr[i] = product;
            product = 1;
        }
        return newArr;
    }


}
