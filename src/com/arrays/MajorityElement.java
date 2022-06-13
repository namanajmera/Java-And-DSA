package com.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = ArrayFunctions.createArray();
        Arrays.sort(arr);
        int result = majorityElement(arr,arr.length);
        System.out.println("result ==> " +result);
        int resultUsingHashMap = majorityElementUsingHashMap(arr,arr.length);
        System.out.println("resultUsingHashMap ==> " + resultUsingHashMap);
    }

    private static int majorityElementUsingHashMap(int[] arr, int length) {
        if (length == 1){
            return arr[0];
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < length; i++){
            if (map.containsKey(arr[i])){
                int count = map.get(arr[i]) + 1;
                if (count > length/2){
                    return arr[i];
                }else{
                    map.put(arr[i], count);
                }
            }else{
                map.put(arr[i], 1);
            }
        }
        return -1;
    }

    private static int majorityElement(int[] arr,int n) {
        if(n == 1){
            return arr[0];
        }
        int maximum = -1,count = 1,i = 1;
        for (;i<arr.length;i++) {
            if (arr[i] == arr[i-1]){
                count++;
            }else if (arr[i] != arr[i-1]){
                count = 1;
            }
            if (count > n/2){
                maximum = arr[i];
                break;
            }
        }
        return maximum;
    }
}
