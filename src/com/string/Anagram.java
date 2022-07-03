package com.string;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println("str1 ==> " + str1);
        System.out.println("str2 ==> " + str2);
        boolean result = isAnagram(str1, str2);
        System.out.println("result ==> "+ result);
//        boolean result2 = isAnagramUsingSort(str1,str2);
    }

    //Using Sort
    private static boolean isAnagramUsingSort(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
//        Arrays.sort(str1);

        return true;
    }

    //Using Hash Map
    private static boolean isAnagram(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < str1.length(); i++) {
            if (map.containsKey(str1.charAt(i))) {
                map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
            } else {
                map.put(str1.charAt(i), 1);
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            if (map.containsKey(str2.charAt(i))) {
                map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
            } else {
                return false;
            }
        }
        for (int url : map.values()) {
            if (url != 0) {
                return false;
            }
        }
        return true;
    }
}
