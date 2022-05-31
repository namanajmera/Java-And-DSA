package com.recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int num = sc.nextInt();
        System.out.println(factorial(num));
    }

    private static int factorial(int num) {
        if (num == 0 || num == 1){
            return 1;
        }
        return num * factorial(num-1);
    }
}
