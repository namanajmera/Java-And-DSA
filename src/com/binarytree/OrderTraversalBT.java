package com.binarytree;

import java.util.ArrayList;

public class OrderTraversalBT {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = CreateBinaryTree.createBinaryTree();
        System.out.print("InOrder Traversal ==> ");
//        inOrderTraversal(root);
        ArrayList<Integer> inroderList = inorderRecursive(root);
        System.out.println(inorderArrayList);
        System.out.println();
        System.out.print("PreOrder Traversal ==> ");
//        preOrderTraversal(root);
        ArrayList<Integer> preroderList = preorderRecursive(root);
        System.out.println(preroderList);
        System.out.println();
        System.out.print("PostOrder Traversal ==> ");
//        postOrderTraversal(root);
        ArrayList<Integer> postroderList = postorderRecursive(root);
        System.out.println(postroderList);
    }
    public static void postOrderTraversal(BinaryTreeNode<Integer> root) {
        if (root == null)
            return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.data+" ");
    }

    static ArrayList<Integer> postorderArrayList = new ArrayList<Integer>();
    public static ArrayList<Integer> postorderRecursive(BinaryTreeNode<Integer> root){
        if (root == null){
            return null;
        }else{
            postorderRecursive(root.left);
            postorderRecursive(root.right);
            postorderArrayList.add(root.data);
        }
        return postorderArrayList;
    }

    public static void preOrderTraversal(BinaryTreeNode<Integer> root) {
        if (root == null)
            return;
        System.out.print(root.data+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    static ArrayList<Integer> preorderArrayList = new ArrayList<Integer>();
    public static ArrayList<Integer> preorderRecursive(BinaryTreeNode<Integer> root){
        if (root == null){
            return null;
        }else{
            preorderArrayList.add(root.data);
            preorderRecursive(root.left);
            preorderRecursive(root.right);
        }
        return preorderArrayList;
    }

    public static void inOrderTraversal(BinaryTreeNode<Integer> root) {
        if (root == null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
    }

    static ArrayList<Integer> inorderArrayList = new ArrayList<Integer>();
    public static ArrayList<Integer> inorderRecursive(BinaryTreeNode<Integer> root){
        if (root == null){
            return null;
        }else{
            inorderRecursive(root.left);
            inorderArrayList.add(root.data);
            inorderRecursive(root.right);
        }
        return inorderArrayList;
    }
}
