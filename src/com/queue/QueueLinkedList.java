package com.queue;

import com.linkedList.Node;

public class QueueLinkedList<T> {
    public Node<T> front;
    public Node<T> rear;
    int size;

    public QueueLinkedList(){
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(T data){
        Node<T> temp = new Node<>(data);
        if (size == 0 ){
            front = temp;
            rear = temp;
        }else {
            rear.next = temp;
            rear = rear.next;
        }
        size++;
    }

    public T dequeue(){
        if (size == 0){
            return null;
        }
        T data = front.data;
        front = front.next;
        size--;
        return data;
    }

    public T top(){
        if (size == 0){
            return null;
        }
        return front.data;
    }
}
