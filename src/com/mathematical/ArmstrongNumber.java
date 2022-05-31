package com.mathematical;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int num = sc.nextInt();
        String armstrong= isArmstrong(num);
        System.out.print("armstrong ==> " + armstrong);
    }

    private static String isArmstrong(int num) {
        int temp = num;
        int digit = 0,rem,sum = 0;
        while (temp > 0){
            rem = temp % 10;
            digit++;
            temp/= 10;
        }
        temp = num;
        while (temp > 0){
            rem = temp % 10;
            int rev = 1;
            for (int i = 0 ;i <digit;i++){
                rev*=rem;
            }
            sum+=rev;
            temp/= 10;
        }
        if(sum == num){
            return "Yes";
        }
        return "No";
    }
}
