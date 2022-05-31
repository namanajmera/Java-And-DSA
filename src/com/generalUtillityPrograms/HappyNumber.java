package com.generalUtillityPrograms;

import java.util.Scanner;

public class HappyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int num = scanner.nextInt();
        boolean happyNumber = isHappyNumber(num);
        if (happyNumber) {
            System.out.print("Happy number");
        } else {
            System.out.print("Not a Happy Number");
        }
    }

    private static boolean isHappyNumber(int num) {
        int temp = num;
        int rem,rev = 0;
        while (num > 0){
            rem = num%10;
            rev += rem*rem;
            num /=10;
            if (num <= 0){
                if (rev == 1){
                    return true;
                }
                num = rev;
                rev = 0;
            }
        }
        return false;
    }
}
