package com.mathematical;

import java.util.Scanner;

public class PrintTheKthDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        long result = kthDigit(a,b,k);
        System.out.println("result ==> " + result);
    }

    private static long kthDigit(int a, int b, int k) {
        int rem = 0;
        int num = (int) Math.pow(a,b);
        System.out.println(num);
        while (num > 0){
            rem = num % 10;
            num /=10;
            k -=1;
            if (k == 0){
                return rem;
            }
        }
        return 0;
    }
}
