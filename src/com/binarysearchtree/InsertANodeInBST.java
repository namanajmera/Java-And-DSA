package com.binarysearchtree;

import com.binarytree.BinaryTreeNode;
import com.binarytree.CreateBinaryTree;
import com.binarytree.OrderTraversalBT;

import java.util.Scanner;

public class InsertANodeInBST {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> binaryTreeNode = CreateBinaryTree.createBinaryTree();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter to add value ==> ");
        int k = sc.nextInt();
        binaryTreeNode = insertNode(binaryTreeNode, k);
        OrderTraversalBT.inOrderTraversal(binaryTreeNode);
    }

    private static BinaryTreeNode<Integer> insertNode(BinaryTreeNode<Integer> binaryTreeNode, int k) {
        if (binaryTreeNode == null) {
            return new BinaryTreeNode<>(k);
        }

        if (binaryTreeNode.data > k)
            binaryTreeNode.left = insertNode(binaryTreeNode.left, k);
        else if(binaryTreeNode.data < k)
            binaryTreeNode.right = insertNode(binaryTreeNode.right, k);
        return binaryTreeNode;
    }
}
