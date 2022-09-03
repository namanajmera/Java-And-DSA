package com.binarytree;

public class MirrorTree {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = CreateBinaryTree.createBinaryTree();
        root = mirrorTree(root);
        OrderTraversalBT.inOrderTraversal(root);
    }

    private static BinaryTreeNode<Integer> mirrorTree(BinaryTreeNode<Integer> root) {
        if (root == null)
            return null;
        BinaryTreeNode<Integer> tempNode = root.right;
        root.right = mirrorTree(root.left);
        root.left = mirrorTree(tempNode);
        return root;
    }
}
