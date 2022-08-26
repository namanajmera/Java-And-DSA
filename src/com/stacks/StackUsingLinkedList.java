package com.stacks;

import com.linkedList.Node;

public class StackUsingLinkedList<T> {
    Node<T> head;
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

    public void push(T element){
        Node<T> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public T pop(){
        if (size == 0){
            return null;
        }
        T value = head.data;
        head = head.next;
        size--;
        return value;
    }

    public T top(){
        if (head == null){
            return null;
        }
        return head.data;
    }
}
