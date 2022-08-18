package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class SortTheStringDesc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = reverseSort(str);
        System.out.println("ans=> "+ ans);
    }

    private static String reverseSort(String str) {
        StringBuilder ans = new StringBuilder();
        char[] ch = new char[str.length()];
        for (int i=0;i<str.length();i++){
            ch[i] = str.charAt(i);
        }
        Arrays.sort(ch);
        for (int i=str.length()-1;i>=0;i--){
            ans.append(ch[i]);
        }
        return ans.toString();
    }
}
