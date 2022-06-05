package com.arrays;

import java.util.Scanner;

public class OperatingAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i<array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter number to perform an operations:- ");
        System.out.println("1. Search an element:- ");
        System.out.println("2. Insert an element:- ");
        System.out.println("3. Delete an element:- ");
        int task = sc.nextInt();
        switch (task) {
            case 1:
                search(array);
                break;
            case 2:
                insert(array);
                break;
            case 3:
                delete(array);
                break;

        }
    }

    private static void delete(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an element to delete number:- ");
        int val = sc.nextInt();
        int  i = 0;
        for(; i<array.length; i++){
            if (array[i] == val){
                break;
            }
        }
        for(; i<array.length-1; i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = 0;
        for (int k : array) {
            System.out.print(k + " ");
        }
    }

    private static void insert(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an element to enter at last position:- ");
        int val = sc.nextInt();
        int[] temp = new int[array.length+1];
        int  i =0;
        for (; i<array.length; i++) {
            temp[i] = array[i];
        }
        temp[i] = val;
        for (int k : temp) {
            System.out.print(k + " ");
        }
    }

    private static void search(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an element:- ");
        int search = sc.nextInt();
        for (int i=0;i<array.length;i++) {
            if (array[i] == search){
                System.out.println("Find at:- "+ (i+1) + " position.");
                break;
            }
        }
    }
}
