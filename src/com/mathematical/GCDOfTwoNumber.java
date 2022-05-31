package com.mathematical;

import java.util.Scanner;

public class GCDOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int result = gcd(a,b);
        System.out.println("result==> "+result);
    }

    private static int gcd(int a, int b) {
        if (a == 0){
            return b;
        }
        if (b == 0){
            return a;
        }
        while(a != b){
            if(a > b){
                a = a-b;
            }else {
                b = b - a;
            }
        }
        return a;
    }

}
