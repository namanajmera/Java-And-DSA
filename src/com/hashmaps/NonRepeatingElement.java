package com.hashmaps;

import com.commonFunctions.ArrayFunctions;

import java.util.ArrayList;
import java.util.HashMap;

public class NonRepeatingElement {
    public static void main(String[] args) {
        int arr[] = ArrayFunctions.createArray();
        int ans = firstNonRep(arr,arr.length);
        System.out.println(ans);
    }

    private static int firstNonRepeating(int[] arr, int n) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++){
            if (hashMap.containsKey(arr[i])){
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
                if (arrayList.size() != 0){
                    if (arrayList.contains(arr[i])){
                        arrayList.remove(arrayList.indexOf(arr[i]));
                    }
                }
            }else{
                hashMap.put(arr[i],1);
                arrayList.add(arr[i]);
            }
        }
//        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
//            if (entry.getValue() > 1){
//                if (arrayList.size() != 0){
//                    arrayList.remove(arrayList.indexOf(entry.getKey()));
//                }
//            }
//        }
        if (arrayList.size() == 0){
            return 0;
        }
        return arrayList.get(0);
    }

    private static int firstNonRep(int[] arr,int n){
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++)
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        for(int i=0;i<n;i++)
            if(mp.get(arr[i])==1)
                return arr[i];
        return 0;
    }
}
