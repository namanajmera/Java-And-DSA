package com.binarytree;

import java.util.Scanner;

public class CreateBinaryTree {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        BinaryTreeNode<Integer> rootNode = createBinaryTree();

    }

    private static BinaryTreeNode<Integer> createBinaryTree() {
        System.out.print("Enter data:- ");
        int data = sc.nextInt();
        if (data == -1)
            return null;
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(data);
        System.out.println("Enter left node data of "+data);
        root.left = createBinaryTree();
        System.out.println("Enter right node data of "+data);
        root.right = createBinaryTree();
        return root;
    }
}
