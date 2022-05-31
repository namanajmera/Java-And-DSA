package com.mathematical;

import java.util.Scanner;

public class AddTwoFractions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int den1 = sc.nextInt();
        int num2 = sc.nextInt();
        int den2 = sc.nextInt();
        addFraction(num1,den1,num2,den2);
    }

    private static void addFraction(int num1, int den1, int num2, int den2) {
        int lcm = LCMOfTwoNumber.lcm(den1,den2);
        if (den1 != lcm){
            num1 = num1* lcm;
        }
    }
}
