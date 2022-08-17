package com.string;

import java.util.Scanner;

public class UpperCaseConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";
        String[] str1 = str.split(" ");
        for (int i=0;i< str1.length;i++){
//            System.out.print(str1[i] + " ---> ");
            str1[i] = upperCaseConversion(str1[i]);
            ans += str1[i] +" ";
        }
        System.out.println(ans);
    }

    private static String upperCaseConversion(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1);
    }
}
