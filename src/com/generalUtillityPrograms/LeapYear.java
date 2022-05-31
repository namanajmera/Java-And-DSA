package com.generalUtillityPrograms;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check leap year:- ");
        int year = sc.nextInt();
        boolean leapYear = isLeapYear(year);
        if (leapYear) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a Leap year");
        }
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 ==0){
            if (year %100 != 0 || year % 400 == 0){
                return true;
            }
            return false;
        }
        return false;
    }
}
