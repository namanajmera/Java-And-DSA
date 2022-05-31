package com.generalUtillityPrograms;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:- ");
        int a= sc.nextInt();
        System.out.print("Enter b:- ");
        int b = sc.nextInt();
        System.out.println("Original two number are a="+a+" b="+b);
        swapUsingThirdVariable(a,b);
        swapWithoutUsingThirdVariable(a,b);
    }

    private static void swapWithoutUsingThirdVariable(int a, int b) {
        a = a+b;
        b= a-b;
        a = a-b;
        System.out.println("After Swap without using third variable to Number are a="+a + " b="+b);
    }

    private static void swapUsingThirdVariable(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap using third Variable to Number are a="+a + " b="+b);
    }
}
