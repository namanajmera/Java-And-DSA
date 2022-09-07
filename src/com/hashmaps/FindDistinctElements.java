package com.hashmaps;

import com.commonFunctions.ArrayFunctions;

import java.util.HashSet;
import java.util.LinkedList;

public class FindDistinctElements {
    public static void main(String[] args) {
        int[][] arr = ArrayFunctions.create2DArray();
        ArrayFunctions.print2DArray(arr);
        System.out.println("Count Distinct Element ==> " + distinct(arr));
    }

    private static int distinct(int[][] arr) {
        LinkedList<Integer> remove = new LinkedList<>();
        HashSet<Integer> hashSet = new HashSet<>();
        // Add First Row
        for (int i = 0; i < arr.length; i++) {
            hashSet.add(arr[0][i]);
        }

        // After 2nd Row
        for (int i = 1; i < arr.length; i++) {
            HashSet<Integer> temp = new HashSet<>();
            for (int j = 0; j < arr[i].length; j++) {
                temp.add(arr[i][j]);
            }
            for (Integer item : hashSet){
                if (!temp.contains(item)){
                    remove.add(item);
                }
            }
            temp.clear();
            hashSet.removeAll(remove);
            if (hashSet.size() == 0){
                break;
            }
        }
        return hashSet.size();
    }
}
