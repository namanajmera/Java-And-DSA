package com.mathematical;

import java.util.Scanner;

public class JumpingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextInt();
        long result = jumpingNums(x);
        System.out.println("result==> "+result);
    }

    private static long jumpingNums(long x) {
        for (long i = x; i<=x;i--){
            long temp = i;
            while (temp>0){
                long digit1 = temp % 10;
                temp /= 10;
                long digit2 = temp % 10;
                if (Math.abs(digit1 - digit2)!= 1){
                    break;
                }
                if (temp < 10){
                    return i;
                }
            }
        }
        return 0;
    }
}
