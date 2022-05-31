package com.generalUtillityPrograms;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find Event or Odd:- ");
        int num = sc.nextInt();
        evenOdd(num);
    }

    private static void evenOdd(int num) {
        if (num == -1 || num == 0){
            System.out.println("Please enter Positive Number.");
        }else if (num%2 == 0){
            System.out.println("Number is Even.");
        }else{
            System.out.println("Number is Odd.");
        }
    }
}
