package com.arrays;

import com.commonFunctions.ArrayFunctions;

import java.util.ArrayList;

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] arr = ArrayFunctions.createArray();
        ArrayList<Integer> result = maximumSubArray(arr);
        System.out.println("result ==> "+ result);
    }

    private static ArrayList<Integer> maximumSubArray(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        long currSum=0,maxSum=0;
        int start=0,end=0,s=0;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if (currSum > maxSum){
                maxSum=currSum;
                start = s;
                end = i;
            }
            if (arr[i] == 0 && currSum == maxSum){
                end++;
            }
            if (arr[i] < 0){
                s= i+1;
                currSum = 0;
            }
        }
        for (int i=start; i<=end; i++){
            if (arr[i]<0){
                result.add(-1);
            }else{
                result.add(arr[i]);
            }
        }
        return result;
    }
}
