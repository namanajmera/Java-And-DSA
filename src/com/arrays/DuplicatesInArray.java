package com.arrays;

import com.commonFunctions.ArrayFunctions;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicatesInArray {
    public static void main(String[] args) {
        int[] arr = ArrayFunctions.createArray();
        ArrayList<Integer> arrayList = duplicatesInArray(arr,arr.length);
        System.out.println("arrayList =>" + arrayList);
    }

    private static ArrayList<Integer> duplicatesInArray(int[] arr, int length) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (length == 1 && arr[0] == 1){
            result.add(0);
            return result;
        }
        Arrays.sort(arr);
        int j = 0;
        for(int i = 1; i < arr.length; i++){
            if (arr[i] == arr[i-1]){
                if (result.size() == 0){
                    result.add(arr[i]);
                    j++;
                }else if (result.get(j-1) != arr[i]){
                    j++;
                    result.add(arr[i]);
                }
            }
        }
        if (result.size() == 0){
            result.add(-1);
        }
        return result;
    }
}
