package com.string;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("str ==> " + str);
        int result = palindromeString(str);
        System.out.println("result ==> " + result);
    }

    private static int palindromeString(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt((str.length() - 1) - i)) {
                return 0;
            }
        }
        return 1;
    }
}
