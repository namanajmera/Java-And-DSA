package com.string;

import java.util.Scanner;

public class SaveIronman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        boolean isPalindromeSave = saveIronman(str1);
        if (isPalindromeSave){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

    private static boolean saveIronman(String str1) {
        StringBuilder s1= new StringBuilder();
        StringBuilder s2= new StringBuilder();
        for (int i=0;i<str1.length();i++){
            if ((str1.charAt(i) >= 65 && str1.charAt(i) <= 90) || (str1.charAt(i) >= 97 && str1.charAt(i) <= 122)){
                s1.append(str1.toLowerCase().charAt(i));
            }
        }
        for (int i = s1.length()-1; i>=0;i--){
            s2.append(s1.charAt(i));
        }
        return s1.toString().equals(s2.toString());
    }

    public static boolean saveIronman1 (String s) {
        //Complete the function
        int i = 0, j = s.length()-1, I = 0, J = 0, diff = 0;
        boolean li = false, lj = false;

        while(i<=j){
            I = (int)s.charAt(i);
            J = (int)s.charAt(j);
            li = lim(I); lj = lim(J);
            if(li && lj){
                diff = Math.abs(I-J);
                if(diff==0 || diff==32){
                    i++; j--;
                }else return false;
            }else if(li || lj){
                if(li) j--;
                else i++;
            }else{
                i++; j--;
            }
        }

        return true;
    }

    static boolean lim(int a){
        return ((a>=65 && a<=90) || (a>=97 && a<=122) || (a>=48 && a<=57));
    }
}
