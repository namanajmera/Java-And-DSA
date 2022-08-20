package com.searching;

import com.commonFunctions.ArrayFunctions;

public class FacingTheSun {
    public static void main(String[] args) {
        int arr[] = ArrayFunctions.createArray();
        int ans = countBuildings(arr);
        System.out.println(ans);
    }

    private static int countBuildings(int[] arr) {
        int count = 1,max = arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i] > max){
                count++;
                max = arr[i];
            }
        }
        return count;
    }
}
