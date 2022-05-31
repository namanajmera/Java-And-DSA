package com.mathematical;

import java.util.Scanner;

public class SeriesAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A1:- ");
        int A1 = sc.nextInt();
        System.out.print("Enter A2:- ");
        int A2 = sc.nextInt();
        System.out.print("Enter N:- ");
        int N = sc.nextInt();
        int result = nthTermOfAP(A1, A2, N);
        System.out.println("result ==> " + result);
    }

    private static int nthTermOfAP(int a1, int a2, int n) {
        int d = a2 - a1;
        if (n == 1){
            return a1;
        }
        if (n == 2){
            return a2;
        }
        int result = a2;
        for (int i = 3; i <= n; i++) {
            result += d;
        }
        return result;
    }
}
