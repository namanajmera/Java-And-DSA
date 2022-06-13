package com.arrays;

public class KadensAlgorithmMaxSumSumArray {
    public static void main(String[] args) {
        int[] arr = ArrayFunctions.createArray();
        int maxSum = maxSumSubArray(arr);
        System.out.println("Max Sub Sum Array ==> " + maxSum);
    }

    private static int maxSumSubArray(int[] arr) {
        int currSum =0,maxSum =0;
        for(int i = 0; i < arr.length; i++){
            currSum += arr[i];
            if (currSum > maxSum){
                maxSum = currSum;
            }
            if (currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
}
