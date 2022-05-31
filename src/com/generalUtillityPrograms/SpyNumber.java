package com.generalUtillityPrograms;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int num = scanner.nextInt();
        boolean isSpy = spyNumber(num);
        if (isSpy) {
            System.out.print("SpyNumber");
        } else {
            System.out.print("Not a SpyNumber");
        }
    }

    private static boolean spyNumber(int num) {
        int rev,rem,sum = 0,product = 1;
        while (num > 0){
            rem=num%10;
            sum += rem;
            product *=rem;
            num /= 10;
        }
        System.out.println(sum);
        System.out.println(product);
        return sum == product;
    }
}
