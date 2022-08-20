package com.searching;

import com.commonFunctions.ArrayFunctions;

import java.util.Scanner;

public class FloorInASortedArray {
    public static void main(String[] args) {
        int arr[] = ArrayFunctions.createArray();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = findFloor(arr, x);
        System.out.println(ans);
    }

    private static int findFloor(int[] arr, int x) {
        int ans = -1, start = 0, end = arr.length - 1;
        if (x > arr[end]){
            return end;
        }
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                end = mid - 1;
                ans = end;
            } else if (arr[mid] < x) {
                start = mid + 1;
                ans = start;
            }
        }
        return ans;
    }
}
