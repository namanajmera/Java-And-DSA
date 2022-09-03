package com.queue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
    public static void main(String[] args) {
        System.out.println("Stack");
        Stack s1 = new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        s1.push(50);
        System.out.println(s1.top());
        System.out.println(s1.size());
        System.out.println(s1.pop());
        System.out.println(s1.top());
        System.out.println(s1.size());
    }
}

class Stack {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int data){
        q2.add(data);

        while (!q1.isEmpty()){
            q2.add(q1.peek());
            q1.remove();
        }
        Queue<Integer> tempQueue = q1;
        q1 = q2;
        q2 = tempQueue;
    }

    int pop(){
        if (q1.isEmpty()){
            return -1;
        }
        return q1.remove();
    }

    int top(){
        if (q1.isEmpty())
            return -1;
        return q1.peek();
    }

    int size(){
        return q1.size();
    }
}