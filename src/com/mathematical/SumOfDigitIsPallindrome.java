package com.mathematical;

import java.util.Scanner;

public class SumOfDigitIsPallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = isDigitSumPalindrome(num);
        System.out.println("result ==>" + result);
    }

    private static int isDigitSumPalindrome(int num) {
        int temp = num;
        int rem,sum = 0;
        while (temp > 0) {
            rem = temp % 10;
            sum+=rem;
            temp /= 10;
        }
        temp = sum;
        int rev = 0;
        while(temp > 0){
            rem = temp %10;
            rev = (rev * 10) + rem;
            temp /= 10;
        }
        if (rev == sum){
            return 1;
        }
        return 0;
    }
}
