package com.binarysearchtree;

import com.binarytree.BinaryTreeNode;
import com.binarytree.CreateBinaryTree;

import java.util.Scanner;

public class BSTSearch {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> binaryTreeNode = CreateBinaryTree.createBinaryTree();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an element to Find in BST ==> ");
        int x = sc.nextInt();
        boolean isElementExist = search(binaryTreeNode,x);
        if (isElementExist)
            System.out.println("Element is Exist.");
        else
            System.out.println("Element is not Exist.");
    }

    private static boolean search(BinaryTreeNode<Integer> binaryTreeNode, int x) {
        if (binaryTreeNode == null)
            return false;
        if (binaryTreeNode.data == x)
            return true;
        if (binaryTreeNode.data > x)
            return search(binaryTreeNode.left,x);
        else
            return search(binaryTreeNode.right,x);
    }
}
