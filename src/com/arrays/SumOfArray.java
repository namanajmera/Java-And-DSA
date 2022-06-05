package com.arrays;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = ArrayFunctions.arrayCreate();
//        ArrayCreation.printArray(arr);
        int size = arr.length;
        System.out.print("Sum of array ==> "+ sumOfArray(arr,size));
    }

    private static int sumOfArray(int[] arr, int size) {
        if (size == 1){
            return arr[0];
        }
        int sum = 0;
        for(int value : arr){
            sum += value;
        }
        return sum;
    }
}
