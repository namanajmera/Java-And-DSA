package com.binarysearchtree;

import com.binarytree.BinaryTreeNode;
import com.binarytree.CreateBinaryTree;
import com.binarytree.OrderTraversalBT;

public class AddAllGreaterValuesEveryNodeBST {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = CreateBinaryTree.createBinaryTree();
        modify(root);
        OrderTraversalBT.inOrderTraversal(root);
    }

    static int sum = 0;

    private static void modify(BinaryTreeNode<Integer> root) {
        if (root == null)
            return;
        modify(root.right);
        sum += root.data;
        root.data = sum;
        modify(root.left);
    }

}
