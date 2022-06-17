package com.arrays;

import com.commonFunctions.ArrayFunctions;

import java.util.Scanner;

public class MinimumDistanceBetweenTwoNumbers {
    public static void main(String[] args) {
        int[] arr = ArrayFunctions.createArray();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int minDistance = minimumDistance(arr,arr.length,x,y);
        System.out.print("minDistance ==> " + minDistance);
    }

//    Failed in some TestCases.
//    private static int minimumDistance(int[] arr, int n, int x, int y) {
//        int min = 0,i=0;
//        boolean firstFound = false,secondFound = false;
//        for (; i < n; i++){
//            if (!firstFound){
//                if (arr[i] == x){
//                    firstFound = true;
//                }
//            }else {
//                min++;
//                if (arr[i] == x){
//                    min = 0;
//                }
//                if (arr[i] == y){
//                    secondFound = true;
//                    break;
//                }
//            }
//        }
//        if (!secondFound){
//            min = Integer.MAX_VALUE;
//        }
//        firstFound = false;
//        int smin = 0;
//        for (int j=n-1;j>=0;j--){
//            if (!firstFound){
//                if (arr[j] == x){
//                    firstFound = true;
//                }
//            }else {
//                smin++;
//                if (arr[j] == x){
//                    smin = 0;
//                }
//                if (arr[j] == y){
//                    secondFound = true;
//                    break;
//                }
//            }
//        }
//        if (secondFound && firstFound) {
//            if (min > smin && smin!=0){
//                return smin;
//            }
//            return min;
//        }
//        return -1;
//    }

    private static int minimumDistance(int[] arr, int n, int x, int y){
        int i=0,p=-1, min_dist=Integer.MAX_VALUE;

        for(i=0 ; i<n ; i++)
        {
            if(arr[i] ==x || arr[i] == y)
            {
                //we will check if p is not equal to -1 and
                //If the element at current index matches with
                //the element at index p , If yes then update
                //the minimum distance if needed
                if(p != -1 && arr[i] != arr[p])
                    min_dist = Math.min(min_dist,i-p);

                //update the previous index
                p=i;
            }
        }
        //If distance is equal to int max
        if(min_dist==Integer.MAX_VALUE)
            return -1;
        return min_dist;
    }
}
