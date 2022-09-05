package com.binarysearchtree;

import com.binarytree.BinaryTreeNode;
import com.binarytree.CreateBinaryTree;
import com.binarytree.OrderTraversalBT;

import java.util.Scanner;

public class DeleteNodeInBST {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> binaryTreeNode = CreateBinaryTree.createBinaryTree();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to delete ==> ");
        int X = sc.nextInt();
        binaryTreeNode = deleteNode(binaryTreeNode, X);
        OrderTraversalBT.inOrderTraversal(binaryTreeNode);
    }

    private static BinaryTreeNode<Integer> deleteNode(BinaryTreeNode<Integer> binaryTreeNode, int x) {
        if (binaryTreeNode == null)
            return null;
        if (binaryTreeNode.data > x)
            binaryTreeNode.left = deleteNode(binaryTreeNode.left, x);
        else if (binaryTreeNode.data < x)
            binaryTreeNode.right = deleteNode(binaryTreeNode.right, x);
        else {
            if (binaryTreeNode.left == null)
                return binaryTreeNode.right;
            else if (binaryTreeNode.right == null)
                return binaryTreeNode.left;
            binaryTreeNode.data = minValue(binaryTreeNode.right);
            binaryTreeNode.right = deleteNode(binaryTreeNode.right, binaryTreeNode.data);
        }
        return binaryTreeNode;
    }

    private static Integer minValue(BinaryTreeNode root) {
        int minValue = (int) root.data;
        while (root.left != null) {
            minValue = (int) root.left.data;
            root = root.left;
        }
        return minValue;
    }
}
