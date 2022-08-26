package com.stacks;

import com.linkedList.Node;

public class StackUsingLinkedList {
    Node<Integer> head;
    int size;

    StackUsingLinkedList(){
        head = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void push(int element){
        Node<Integer> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public int pop(){
        if (size == 0){
            return -1;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }
}
