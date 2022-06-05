package com.arrays;

import java.util.Scanner;

public class MInMaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        Pair minMax = getMinMax(array,size);
        System.out.println("Min value of array is:- "+ minMax.min);
        System.out.println("Max value of array is:- "+ minMax.max);
    }

    private static Pair getMinMax(int[] array, int size) {
        Pair minMax = new Pair();
        if (size == 1){
            minMax.min = array[0];
            minMax.max = array[0];
        }
        if (array[0] > array[1]){
            minMax.min = array[1];
            minMax.max = array[0];
        }else{
            minMax.min = array[0];
            minMax.max = array[1];
        }

        for (int i = 2;i<size;i++){
            if (array[i] > minMax.max){
                minMax.max = array[i];
            }else if (array[i] < minMax.min){
                minMax.min = array[i];
            }
        }
        return minMax;
    }
}

class Pair {
    int min;
    int max;
}
