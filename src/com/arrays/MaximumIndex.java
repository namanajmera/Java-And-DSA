package com.arrays;

import com.commonFunctions.ArrayFunctions;

public class MaximumIndex {
    public static void main(String[] args) {
        int[] array = ArrayFunctions.createArray();
        int lengthOfArray = array.length;
        int maxIndex = maximumIndex(array, lengthOfArray);
        System.out.println("Maximum index:- " + maxIndex);
    }

    private static int maximumIndex(int[] array, int lengthOfArray) {
        int maxDiff = -1, i, j;
        int[] RMax = new int[lengthOfArray];
        int[] LMin = new int[lengthOfArray];

        LMin[0] = array[0];
        for (i = 1; i < lengthOfArray; i++) {
            LMin[i] = Math.min(array[i], LMin[i - 1]);
        }
        RMax[lengthOfArray - 1] = array[lengthOfArray - 1];
        for (j = lengthOfArray - 2; j >= 0; j--) {
            RMax[j] = Math.max(array[j], RMax[j + 1]);
        }
        i = 0;
        j = 0;
        while (i < lengthOfArray && j < lengthOfArray) {
            if (LMin[i] < RMax[j]) {
                maxDiff = Math.max(maxDiff, j - i);
                j++;
            } else {
                i++;
            }
        }
        return maxDiff;
    }
}
