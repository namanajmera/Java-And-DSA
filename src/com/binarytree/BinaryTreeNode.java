package com.binarytree;

public class BinaryTreeNode<T> {
    public BinaryTreeNode left,right;
    public T data;

    public BinaryTreeNode(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
