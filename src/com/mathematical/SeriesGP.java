package com.mathematical;

import java.util.Scanner;

public class SeriesGP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first term:- ");
        int a = sc.nextInt();
        System.out.print("Enter the common ratio:- ");
        int r = sc.nextInt();
        System.out.print("Enter the position nth value:- ");
        int n = sc.nextInt();
        int nthTerm = Nth_Term(a, r, n);
        System.out.println("nthTerm ==> "+nthTerm);
    }

    private static int Nth_Term(int a, int r, int n) {
        if (n == 1) {
            return a;
        }
        int result = a;
        for (int i = 2; i <= n; i++) {
            result *= r;
        }
        return result;
    }
}
