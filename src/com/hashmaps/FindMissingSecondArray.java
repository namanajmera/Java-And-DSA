package com.hashmaps;

import com.commonFunctions.ArrayFunctions;

import java.util.ArrayList;
import java.util.HashSet;

public class FindMissingSecondArray {
    public static void main(String[] args) {
        int arr1[] = ArrayFunctions.createArray();
        int arr2[] = ArrayFunctions.createArray();
        ArrayList<Integer> result = findMissing(arr1,arr2);
        System.out.println(result);
    }

    private static ArrayList<Integer> findMissing(int[] arr1, int[] arr2) {
        HashSet<Integer> hashset = new HashSet<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int j : arr2) {
            hashset.add(j);
        }
        for (int i: arr1){
            if (!hashset.contains(i)){
                arrayList.add(i);
            }
        }
        return arrayList;
    }
}
