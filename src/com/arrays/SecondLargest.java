package com.arrays;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int result = secondLargest(array,size);
        System.out.println("result ==> " + result);
    }

    private static int secondLargest(int[] array, int size) {
        if (size == 1){
            return -1;
        }
        int max =-1,sMax =-1;
        if (array[0] > array[1]){
            max = array[0];
            sMax = array[1];
        }else if (array[0] < array[1]){
            max = array[1];
            sMax = array[0];
        }
        for (int i = 2; i<size; i++){
            if (array[i] > max){
                sMax = max;
                max = array[i];
            }else if (array[i] > sMax && array[i] < max){
                sMax = array[i];
            }
        }
        return sMax;
    }
}
