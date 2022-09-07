package com.hashmaps;

import com.commonFunctions.ArrayFunctions;

import java.util.Arrays;

public class NutsAndBoltsProblem {
    public static void main(String[] args) {
        char[] nuts = ArrayFunctions.createCharArray();
        char[] bolts = ArrayFunctions.createCharArray();
        matchPairs(nuts,bolts);
        System.out.println(nuts);
        System.out.println(bolts);
    }

    private static void matchPairs(char[] nuts, char[] bolts) {
        Arrays.sort(nuts);
        Arrays.sort(bolts);
    }
}
