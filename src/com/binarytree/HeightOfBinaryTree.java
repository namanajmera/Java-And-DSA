package com.binarytree;

public class HeightOfBinaryTree {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> binaryTreeNode = CreateBinaryTree.createBinaryTree();
        int height = heightBinaryTree(binaryTreeNode);
        System.out.println("Height of Binary tree ==> " + height);
    }

    private static int heightBinaryTree(BinaryTreeNode<Integer> binaryTreeNode) {
        if (binaryTreeNode == null){
            return 0;
        }
        int leftHeight = heightBinaryTree(binaryTreeNode.left);
        int rightHeight = heightBinaryTree(binaryTreeNode.right);
        return Math.max(leftHeight,rightHeight) + 1;
    }
}
