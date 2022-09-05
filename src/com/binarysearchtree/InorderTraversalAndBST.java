package com.binarysearchtree;

import com.commonFunctions.ArrayFunctions;

public class InorderTraversalAndBST {
    public static void main(String[] args) {
        int arr[] = ArrayFunctions.createArray();
        int isBST = isRepresentingBST(arr);
        System.out.println(isBST);
    }

    private static int isRepresentingBST(int[] arr) {
        int isBST = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] >= arr[i]) {
                isBST = 0;
                break;
            }
        }
        return isBST;
    }
}
