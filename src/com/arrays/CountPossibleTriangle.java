package com.arrays;

import java.util.Arrays;

public class CountPossibleTriangle {
    public static void main(String[] args) {
        int[] arr = ArrayFunctions.createArray();
        int countn3 = countTrianglesn3(arr);
        int countn2 = countTrianglesn2(arr);
        System.out.print("Count ==> "+ countn3);
        System.out.print("Count ==> "+ countn2);
    }

    private static int countTrianglesn2(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int  k = i+2;
            for (int j = i+1; j < arr.length;j++){
                while (k<arr.length && arr[i] + arr[j] > arr[k]){
                    k++;
                }
                if (k > j){
                    count+=k - j - 1;
                }
            }
        }
        return count;
    }

    private static int countTrianglesn3(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++){
                    if (arr[i] + arr[j] > arr[k]){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
