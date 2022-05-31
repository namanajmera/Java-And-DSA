package com.generalUtillityPrograms;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int num = sc.nextInt();
        boolean strongNumber = isStrongNumber(num);
        if (strongNumber) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not Strong Number");
        }
    }

    private static boolean isStrongNumber(int num) {
        int rem, fact, temp = num, sum = 0;
        while (temp > 0) {
            rem = temp % 10;
            fact = factorial(rem);
            sum += fact;
            temp /= 10;
        }
        return sum == num;
    }

    private static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
