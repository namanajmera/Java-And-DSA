package com.generalUtillityPrograms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int num = sc.nextInt();
        fibonacci(num);
    }

    private static void fibonacci(int num) {
        int a = 0;
        int b = 1;
        int res;
//        System.out.print(a+" "+b+" ");
        while (true){
            res = a+b;
            System.out.print(res+" ");
            a = b;
            b = res;
            if (res>num){
                break;
            }
        }
    }
}
