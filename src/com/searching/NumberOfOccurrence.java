package com.searching;

import com.commonFunctions.ArrayFunctions;

import java.util.Scanner;

public class NumberOfOccurrence {
    public static void main(String[] args) {
        int arr[] = ArrayFunctions.createArray();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = count(arr, x);
        System.out.println(ans);
    }

    private static int count(int[] arr, int x) {
        int count = 0, tempIndex;
        int findIndex = binarySearch(arr, x);
        if (findIndex != -1) {
            if (arr.length == 1){
                return ++count;
            }
            tempIndex = findIndex;
            count++;
            if ((tempIndex == 0 && arr[tempIndex + 1] != x) || tempIndex == arr.length - 1) {
                return count;
            }
            while (tempIndex - 1 != -1 && arr[tempIndex - 1] == x) {
                count++;
                tempIndex--;
                if (tempIndex == 0 || tempIndex + 1 == arr.length) {
                    break;
                }
            }
            tempIndex = findIndex;
            while (tempIndex + 1 != arr.length && arr[tempIndex + 1] == x) {
                count++;
                tempIndex++;
                if (tempIndex == 0 || tempIndex + 1 == arr.length) {
                    break;
                }
            }
        }
        return count;
    }

    private static int binarySearch(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                end = mid - 1;
            } else if (arr[mid] < value) {
                start = mid + 1;
            }
        }
        return -1;
    }
}
