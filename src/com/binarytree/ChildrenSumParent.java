package com.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class ChildrenSumParent {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = CreateBinaryTree.createBinaryTree();
        int isSum = isSumProperty(root);
        System.out.println(isSum);
    }

    private static int isSumProperty(BinaryTreeNode<Integer> root) {
        if (root == null)
            return 0;
        Queue<BinaryTreeNode<Integer>> binaryTreeNodeQueue = new LinkedList<>();
        binaryTreeNodeQueue.add(root);
        while (!binaryTreeNodeQueue.isEmpty()) {
            int left = 0, right = 0, rootData = 0;
            BinaryTreeNode<Integer> currentNode = binaryTreeNodeQueue.remove();
            rootData = currentNode.data;
            if (currentNode.left != null) {
                binaryTreeNodeQueue.add(currentNode.left);
                left = (int) currentNode.left.data;
            }
            if (currentNode.right != null) {
                binaryTreeNodeQueue.add(currentNode.right);
                right = (int) currentNode.right.data;
            }
            if (currentNode.right != null && currentNode.left!=null) {
                int sum = left + right;
                if (sum != rootData) {
                    return 0;
                }
            }
        }
        return 1;
// Try with this approach
//        {
//            int sum=0;
//            if(root==null)
//            {
//                return 1;
//            }
//
//            if(root.right==null  && root.left==null)
//            {
//                return 1;
//            }
//
//            if(root.left!=null)
//            {
//                sum+=root.left.data;
//            }
//            if(root.right!=null)
//            {
//                sum+=root.right.data;
//            }
//
//            if(root.data!=sum)
//            {
//                return 0;
//            }
//
//            return isSumProperty(root.left) & isSumProperty(root.right);
//        }
    }
}
