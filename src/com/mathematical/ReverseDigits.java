package com.mathematical;

import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = reverseDigits(num);
        System.out.println("result ==> "+ result);
    }

    private static int reverseDigits(int num) {
        int rev = 0,rem;
        while (num > 0){
            rem = num % 10;
            rev = (rev * 10)+ rem;
            num /=10;
        }
        return rev;
    }
}
