package com.generalUtillityPrograms;

import java.util.Scanner;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int num = scanner.nextInt();
        boolean automorphic = isAutomorphicNumber(num);
        if (automorphic) {
            System.out.print("Automorphic number");
        } else {
            System.out.print("Not a Automorphic Number");
        }
    }

    private static boolean isAutomorphicNumber(int num) {
        int temp = num;
        int numSq = num * num;
        System.out.println("numSq " + numSq);
        while(temp > 0){
            if (temp % 10 != numSq%10){
                return false;
            }
            temp /=10;
            numSq /=10;
        }
        return true;
    }
}
