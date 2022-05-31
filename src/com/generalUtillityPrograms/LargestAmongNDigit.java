package com.generalUtillityPrograms;

import java.util.Scanner;

public class LargestAmongNDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n number:- ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter "+size+" number:- ");
        for (int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int max = maxNumber(arr);
        System.out.println("Maximum number is:- "+ max);
    }

    private static int maxNumber(int[] arr) {
        int max = arr[0];
        for (int i=1;i<arr.length;i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
