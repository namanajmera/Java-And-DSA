package com.queue;

public class ImplementQueueUsingLinkedList {
    public static void main(String[] args) {
        QueueLinkedList<Integer> queueLinkedList = new QueueLinkedList<>();
        queueLinkedList.enqueue(10);
        System.out.println(queueLinkedList.top());
        queueLinkedList.enqueue(20);
        queueLinkedList.enqueue(30);
        queueLinkedList.enqueue(40);
        queueLinkedList.enqueue(50);
        System.out.println(queueLinkedList.top());
        System.out.println(queueLinkedList.dequeue());
        System.out.println(queueLinkedList.dequeue());
        System.out.println(queueLinkedList.dequeue());
        System.out.println(queueLinkedList.top());
    }
}
