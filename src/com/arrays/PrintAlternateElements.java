package com.arrays;

import java.util.Scanner;

public class PrintAlternateElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        alternateElement(array,size);
    }

    private static void alternateElement(int[] array, int size) {
        for (int i= 0 ;i< size; i+=2){
            System.out.print(array[i]+" ");
        }
    }
}
