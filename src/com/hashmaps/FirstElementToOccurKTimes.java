package com.hashmaps;

import com.commonFunctions.ArrayFunctions;

import java.util.HashMap;
import java.util.Scanner;

public class FirstElementToOccurKTimes {
    public static void main(String[] args) {
        int arr[] = ArrayFunctions.createArray();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the occur times ==> ");
        int K = sc.nextInt();
        int ans = firstElementKTime(arr,K);
        System.out.println(ans);
    }

    private static int firstElementKTime(int[] arr, int k) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            if (hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }else{
                hashMap.put(arr[i],1);
            }
            if (hashMap.get(arr[i]) == k){
                return arr[i];
            }
        }
        return -1;
    }
}
