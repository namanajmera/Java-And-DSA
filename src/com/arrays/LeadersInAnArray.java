package com.arrays;

import com.commonFunctions.ArrayFunctions;

import java.util.ArrayList;
import java.util.Arrays;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int[] arr = ArrayFunctions.createArray();
        ArrayList<Integer> list = leaders(arr,arr.length);
        System.out.println(Arrays.deepToString(list.toArray()));
    }
    public static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        int max_from_right = arr[n-1];
        list.add(max_from_right);
        for (int i = n-2;i>=0;i--){
            if (max_from_right < arr[i]){
                max_from_right = arr[i];
                list.add(arr[i]);
            }
        }
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        for (int i = list.size()-1;i>=0;i--){
            list1.add(list.get(i));
        }
        return list1;
    }
}
