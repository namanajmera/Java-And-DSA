package com.queue;

public class ImplementQueueUsingArrays {
    public static void main(String[] args) {
        QueueArrays queueArrays = new QueueArrays();
        queueArrays.enqueue(10);
        System.out.println(queueArrays.top());
        queueArrays.enqueue(20);
        queueArrays.enqueue(30);
        queueArrays.enqueue(40);
        queueArrays.enqueue(50);
        System.out.println(queueArrays.top());
        System.out.println(queueArrays.dequeue());
        System.out.println(queueArrays.dequeue());
        System.out.println(queueArrays.dequeue());
        System.out.println(queueArrays.top());
    }
}
