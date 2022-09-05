package com.binarysearchtree;

import com.binarytree.BinaryTreeNode;
import com.binarytree.CreateBinaryTree;

public class MinimumElementBST {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = CreateBinaryTree.createBinaryTree();
        int minimum = minValue(root);
        System.out.println("Minimum element in BST ==> " + minimum);
    }

    private static int minValue(BinaryTreeNode<Integer> root) {
        if (root == null){
            return -1;
        }
        int minValue = root.data;
        while (root.left!=null){
            minValue = (int) root.left.data;
            root = root.left;
        }
        return minValue;
    }
}
