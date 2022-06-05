package com.arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr = ArrayFunctions.arrayCreate();
        int size = arr.length;
        System.out.print("Before reverse => ");
        ArrayFunctions.printArray(arr);
        reverseArray(arr,size);
        System.out.print("After reverse => ");
        ArrayFunctions.printArray(arr);
    }

    private static void reverseArray(int[] arr, int size) {
        int j=size-1;
        for (int i = 0; i < size; i++){
             if (i == j || i > j){
                 break;
             }
             swap(arr,i,j);
             j--;
         }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
