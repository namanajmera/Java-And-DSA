package com.queue;

public class QueueArrays {
    public int data[];
    public int front;
    public int rear;
    public int size;

    QueueArrays(){
        data = new int[10];
        front = -1;
        rear = -1;
    }

    public void enqueue(int a){
        if (size == data.length){
            return;
        }
        if (size == 0){
            front = 0;
        }
        data[++rear] = a;
        size++;
    }

    public int dequeue(){
        if (size == 0){
            return -1;
        }
        int pop = data[front];
        front++;
        size--;
        if(size==0){
            front=-1;
            rear= -1;
        }
        return pop;
    }

    public int top(){
        if (size == 0){
            return -1;
        }
        return data[front];
    }
}
