package com.binarysearchtree;

import com.binarytree.BinaryTreeNode;
import com.binarytree.CreateBinaryTree;
import com.binarytree.OrderTraversalBT;

import java.util.ArrayList;
import java.util.Scanner;

public class CountBSTNodesLieGivenRange {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = CreateBinaryTree.createBinaryTree();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Lowest value==>" );
        int l = sc.nextInt();
        System.out.print("Enter the Highest value==>" );
        int h = sc.nextInt();
        int countNodes = getCountOfNode(root,l,h);
        System.out.println(countNodes);
    }

    private static int getCountOfNode(BinaryTreeNode<Integer> root, int l, int h) {
        if (root == null)
            return 0;
        ArrayList<Integer> inOrderList = OrderTraversalBT.inorderRecursive(root);
        int count = 0;
        for (Integer val:inOrderList){
            if (val >=l && val<h)
                count++;
        }
        return count;
    }
    static int ans = 0;
    private static void getCountOfNode1(BinaryTreeNode<Integer> root, int l, int h) {
        if (root == null)
            return;
        getCountOfNode1(root.left,l,h);
        if (root.data >=l && root.data <=h)
            ans++;
        getCountOfNode1(root.right,l,h);
    }
}
