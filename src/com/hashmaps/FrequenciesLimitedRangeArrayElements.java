package com.hashmaps;

import com.commonFunctions.ArrayFunctions;

import java.util.HashMap;
import java.util.Scanner;

public class FrequenciesLimitedRangeArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter limit==> ");
        int p = sc.nextInt();
        System.out.println("Please enter the array form 1 to "+p);
        int arr[] = ArrayFunctions.createArray();
        frequencyCount(arr, arr.length);
        ArrayFunctions.printArray(arr);
    }

    private static void frequencyCount(int[] arr, int n) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++){
            if (hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }else{
                hashMap.put(arr[i],1);
            }
        }
        for (int i=0;i<n;i++){
            arr[i] = 0;
            if (hashMap.containsKey(i+1)){
                arr[i] = hashMap.get(i+1);
            }
        }
    }
}
