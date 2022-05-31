package com.generalUtillityPrograms;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find the factorial:- ");
        int num = sc.nextInt();
        long result = fact(num);
        System.out.print("The factorial of "+ num + " is "+result);
    }

    private static long fact(int num) {
        if (num == -1 || num == 0 || num == 1){
            return 1;
        }else{
            long temp = 1;
            for (int i=1;i<=num;i++){
                temp *=i;
            }
            return temp;
        }
    }
}
