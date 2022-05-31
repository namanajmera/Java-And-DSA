package com.generalUtillityPrograms;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int num = sc.nextInt();
        pascalTriangle(num);
    }

    private static void pascalTriangle(int num) {
        for (int i= 0; i<num;i++){
            for (int j= 0; j<=num-i;j++){
                System.out.print(" ");
            }
            for (int j=0;j<=i;j++){
                int c = factorial(i-j);
                System.out.print(" "+ factorial(i)/(c*factorial(j)));
            }
            System.out.println();
        }
    }

    private static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n - 1);
    }
}
