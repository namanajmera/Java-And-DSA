package com.generalUtillityPrograms;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int num = sc.nextInt();
        boolean perfectNumber = isPerfectNumber(num);
        if (perfectNumber) {
            System.out.print("Perfect Number");
        } else {
            System.out.print("Not Perfect Number");
        }
    }

    private static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i<num;i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }
}
