package com.generalUtillityPrograms;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int num = sc.nextInt();
        boolean isPalindrome = isPalindromeNumber(num);
        if(isPalindrome){
            System.out.print("Number is Palindrome");
        }else{
            System.out.println("Number is not a palindrome.");
        }
    }

    private static boolean isPalindromeNumber(int num) {
        int temp = num;
        int rev = 0,rem;
        while (num > 0){
            rem = num %10;
            rev = (rev*10)+rem;
            num = num/10;
        }
        return temp == rev;
    }
}
