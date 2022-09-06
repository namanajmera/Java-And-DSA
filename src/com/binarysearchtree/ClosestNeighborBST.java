package com.binarysearchtree;

import com.binarytree.BinaryTreeNode;
import com.binarytree.CreateBinaryTree;

import java.util.Scanner;

public class ClosestNeighborBST {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = CreateBinaryTree.createBinaryTree();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findMaxForN(root, n);
        System.out.println(ans);
    }

    static int ans = -1, min_diff = Integer.MAX_VALUE;

    private static void findMaxForN(BinaryTreeNode<Integer> root, int n) {
        if (root == null) {
            return;
        }
        if (root.data == n) {
            ans = root.data;
            return;
        }
        if (min_diff > Math.abs(root.data - n)){
            min_diff = Math.abs(root.data - n);
            ans = root.data;
        }
        if (root.data > n) {
            findMaxForN(root.left, n);
        } else {
            findMaxForN(root.right, n);
        }
    }
}
