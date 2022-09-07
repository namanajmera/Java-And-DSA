package com.hashmaps;

import com.commonFunctions.ArrayFunctions;

import java.util.HashMap;

public class CheckTwoArraysEqualOrNot {
    public static void main(String[] args) {
        long arr1[] = ArrayFunctions.createArray1();
        long arr2[] = ArrayFunctions.createArray1();
        boolean isEqualOrNot = check(arr1,arr2, arr1.length);
        System.out.println(isEqualOrNot);
    }

    private static boolean check(long[] arr1, long[] arr2, int n) {
        HashMap<Long,Long> hashMap1 = new HashMap<>();
        HashMap<Long,Long> hashMap2 = new HashMap<>();
        for (int i = 0; i < n; i++){
            if (hashMap1.containsKey(arr1[i])){
                hashMap1.put(arr1[i],hashMap1.get(arr1[i])+1);
            }else{
                hashMap1.put(arr1[i],1L);
            }
        }
        for (int i = 0; i < n; i++){
            if (hashMap2.containsKey(arr2[i])){
                hashMap2.put(arr2[i],hashMap2.get(arr2[i])+1);
            }else{
                hashMap2.put(arr2[i],1L);
            }
        }
        return hashMap1.equals(hashMap2);
    }
}
