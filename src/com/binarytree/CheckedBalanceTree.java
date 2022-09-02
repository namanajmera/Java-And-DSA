package com.binarytree;

public class CheckedBalanceTree {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = CreateBinaryTree.createBinaryTree();
        int isBalancedTree = isBalancedTree(root);
        System.out.println("isBalancedTree ==> "+ isBalancedTree);
        if (isBalancedTree > 1){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }

    private static int isBalancedTree(BinaryTreeNode<Integer> root) {
        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null)
            return 1;
        int leftHeight = HeightOfBinaryTree.heightBinaryTree(root.left);
        int rightHeight = HeightOfBinaryTree.heightBinaryTree(root.right);
        int difference = leftHeight - rightHeight;
        return Math.abs(difference);
    }

    boolean isBalanced(BinaryTreeNode<Integer> root)
    {
        // Your code here
        if (root == null)
            return true;
        int leftHeight = HeightOfBinaryTree.heightBinaryTree(root.left);
        int rightHeight = HeightOfBinaryTree.heightBinaryTree(root.right);
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
}
