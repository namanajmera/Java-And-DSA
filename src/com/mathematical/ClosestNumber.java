package com.mathematical;

import java.util.Scanner;

import static java.lang.Math.abs;

public class ClosestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = closestNumber(n, m);
        System.out.println(result);
    }

    private static int closestNumber(int n, int m) {
        int q,n1,n2;
        q = n/m;
        n1 = m * q;
        if ((n*m) > 0) {
            n2 = m * (q + 1);
        }else{
            n2 = m * (q-1);
        }
        if (abs(n-n1) < abs(n-n2)){
            return n1;
        }
        return n2;
    }
}
