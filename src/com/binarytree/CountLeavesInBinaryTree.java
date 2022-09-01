package com.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class CountLeavesInBinaryTree {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = CreateBinaryTree.createBinaryTree();
        int leaves = countLeaves(root);
        System.out.println("Number of Leaves ==> " + leaves);
    }

    private static int countLeaves(BinaryTreeNode<Integer> root) {
        if (root == null)
            return 0;
        int leavesCount = 0;
        Queue<BinaryTreeNode<Integer>> binaryTreeNodeQueue = new LinkedList<>();
        binaryTreeNodeQueue.add(root);
        while (!binaryTreeNodeQueue.isEmpty()){
            BinaryTreeNode<Integer> currentNode = binaryTreeNodeQueue.remove();
            if (currentNode.left != null)
                binaryTreeNodeQueue.add(currentNode.left);
            if (currentNode.right != null)
                binaryTreeNodeQueue.add(currentNode.right);
            if (currentNode.left == null && currentNode.right == null)
                leavesCount++;
        }
        return leavesCount;
    }
}
