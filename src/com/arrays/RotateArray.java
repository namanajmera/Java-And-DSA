package com.arrays;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = ArrayFunctions.arrayCreate();
        int d = sc.nextInt();
        rotateArray(array, d);
    }

    private static void rotateArray(int[] array, int d) {
        int j = d;
        int i = 0;
        int[] newArray = new int[array.length];
        for (; j < array.length; j++) {
            newArray[i++] = array[j];
        }
        int  k = 0;
        for (; i < array.length; i++) {
            newArray[i] = array[k];
            k++;
            if (k == d){
                break;
            }
        }
        ArrayFunctions.printArray(newArray);
    }
}
