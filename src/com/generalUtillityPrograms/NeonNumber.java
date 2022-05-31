package com.generalUtillityPrograms;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int num = scanner.nextInt();
        boolean neonNumber = isNeonNumber(num);
        if (neonNumber) {
            System.out.println("Neon Number");
        } else {
            System.out.println("Not a Neon Number");
        }
    }

    private static boolean isNeonNumber(int num) {
        int neonNumber = num*num;
        int sum=0,rem;
        while (neonNumber > 0){
            rem = neonNumber%10;
            sum+=rem;
            neonNumber /=10;
        }
        return sum == num;
    }
}
