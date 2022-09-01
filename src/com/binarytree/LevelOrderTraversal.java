package com.binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = CreateBinaryTree.createBinaryTree();
        ArrayList<Integer> arrayList = levelOrderTraversal(root);
        for(int list : arrayList){
            System.out.print(list+" ");
        }
    }

    private static ArrayList<Integer> levelOrderTraversal(BinaryTreeNode<Integer> root) {
        Queue<BinaryTreeNode<Integer>> binaryTreeNodeQueue = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        binaryTreeNodeQueue.add(root);
        while (!binaryTreeNodeQueue.isEmpty()){
            BinaryTreeNode<Integer> currentNode = binaryTreeNodeQueue.remove();
            arrayList.add(currentNode.data);
            if (currentNode.left != null)
                binaryTreeNodeQueue.add(currentNode.left);
            if (currentNode.right != null)
                binaryTreeNodeQueue.add(currentNode.right);
        }
        return arrayList;
    }
}
