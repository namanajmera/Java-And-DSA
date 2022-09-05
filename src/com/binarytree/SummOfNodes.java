package com.binarytree;

public class SummOfNodes {
    private static int totalSumOfNodes(BinaryTreeNode<Integer> root) {
        if (root == null)
            return 0;
        return root.data+totalSumOfNodes(root.left) + totalSumOfNodes(root.right);
    }
}
