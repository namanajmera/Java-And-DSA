package com.arrays;

import com.commonFunctions.ArrayFunctions;

public class MaxSumPathInTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = ArrayFunctions.createArray();
        int m = arr1.length;
        int[] arr2 = ArrayFunctions.createArray();
        int n = arr2.length;
        int result = maxSumPath(arr1, m, arr2, n);
        System.out.println("result => " + result);
    }

    private static int maxSumPath(int[] arr1, int m, int[] arr2, int n) {
        int sum1 = 0, sum2 = 0, result = 0, i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                sum1 += arr1[i++];
            } else if (arr1[i] > arr2[j]) {
                sum2 += arr2[j++];
            } else {
                result += Math.max(sum1, sum2) + arr1[i];
                sum1 = 0;
                sum2 = 0;
                i++;
                j++;
            }
        }
        while (i < m) {
            sum1 += arr1[i++];
        }
        while (j < n) {
            sum2 += arr2[j++];
        }
        result += Math.max(sum1, sum2);
        return result;
    }
}
