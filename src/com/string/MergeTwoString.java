package com.string;

import java.util.Scanner;

public class MergeTwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println("Str1 ==> "+str1);
        System.out.println("Str2 ==> "+str2);

        String ans = mergeTwoStringAlternative(str1,str2);
        System.out.println("ans==> " + ans);
    }

    private static String mergeTwoStringAlternative(String str1, String str2) {
        StringBuilder ans = new StringBuilder();
        int i = 0;
        while (str1.length()>i && str2.length()>i){
            ans.append(str1.charAt(i));
            ans.append(str2.charAt(i));
            i++;
        }
        while (str1.length()>i){
            ans.append(str1.charAt(i));
            i++;
        }
        while (str2.length()>i){
            ans.append(str2.charAt(i));
            i++;
        }
        return ans.toString();
    }
}
