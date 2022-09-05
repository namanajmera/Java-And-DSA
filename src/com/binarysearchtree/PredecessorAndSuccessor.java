package com.binarysearchtree;

import com.binarytree.BinaryTreeNode;
import com.binarytree.CreateBinaryTree;

import java.util.Scanner;

public class PredecessorAndSuccessor {
    public static void main(String[] args) {
        BinaryTreeNode<Integer> root = CreateBinaryTree.createBinaryTree();
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        preAndSucc(root,key);
        System.out.println(s.pre +" "+ s.succ);
    }

    static PreAndSucc s = new PreAndSucc();

    private static void preAndSucc(BinaryTreeNode<Integer> root, int key) {
        if (root == null)
            return;
        if (root.data == key){
            if (root.left !=null){
                BinaryTreeNode<Integer> temp = root.left;
                while (temp.left !=null){
                    temp = temp.left;
                }
                s.pre = temp.data;
            }
            if (root.right !=null){
                BinaryTreeNode<Integer> temp = root.right;
                while (temp.right !=null){
                    temp = temp.right;
                }
                s.succ = temp.data;
            }
        }
        if (root.data > key){
            s.succ = root.data;
            preAndSucc(root.left,key);
        }
        else {
            s.pre = root.data;
            preAndSucc(root.right,key);
        }
    }
}

class PreAndSucc{
    int pre;
    int succ;

    PreAndSucc(){
        pre = -1;
        succ = -1;
    }
}
