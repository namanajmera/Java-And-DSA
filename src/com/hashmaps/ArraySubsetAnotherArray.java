package com.hashmaps;

import com.commonFunctions.ArrayFunctions;

import java.util.HashSet;

public class ArraySubsetAnotherArray {
    public static void main(String[] args) {
        long arr1[] = ArrayFunctions.createArray1();
        long arr2[] = ArrayFunctions.createArray1();
        boolean isSubSet = isSubset(arr1, arr2);
        if (isSubSet)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    private static boolean isSubset(long[] arr1, long[] arr2) {
        HashSet<Long> hashSet1 = new HashSet<>();
        HashSet<Long> hashSet2 = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hashSet1.add(arr1[i]);
        }
        for (int j=0;j< arr2.length;j++){
            hashSet2.add(arr2[j]);
        }
        boolean isSubSet = true;
        for (Long item:hashSet2){
            if (!hashSet1.contains(item)){
                isSubSet = false;
                break;
            }
        }

        return isSubSet;
    }
}

//    ArrayList<Long> ans=new ArrayList<>();
//       for(int i=0;i<n;i++)
//        ans.add(a1[i]);
//        for(int i=0;i<m;i++)
//        {
//        if(ans.contains(a2[i]))
//        ans.remove(a2[i]);
//        else
//        return "No";
//        }
//        return "Yes";