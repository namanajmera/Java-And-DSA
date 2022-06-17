package com.arrays;

import com.commonFunctions.ArrayFunctions;

import java.util.Scanner;

public class CountOfSmallerElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = ArrayFunctions.createArray();
        int x = scanner.nextInt();
        int count = countOfElement(arr,x);
        System.out.println("count ==> "+ count);
    }

    private static int countOfElement(int[] arr, int x) {
        int i = 0;
        for (; i < arr.length; i++) {
            if (arr[i] > x){
                break;
            }
        }
        return i;
    }
}
