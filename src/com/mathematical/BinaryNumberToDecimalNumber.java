package com.mathematical;

import java.util.Scanner;

public class BinaryNumberToDecimalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String b = sc.next();
        int result = binary_to_decimal(b);
        System.out.println("result ==> "+ result);
    }

    private static int binary_to_decimal(String b) {
        int d = 0;
        for (int  i= 0; i<b.length(); i++) {
            int c = Character.getNumericValue(b.charAt(i));
            d += c * (Math.pow(2,(b.length()-(i+1))));
        }
        return d;
    }
}
