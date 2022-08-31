package com.queue;

import java.util.Stack;
public class ImplementQueueUsingStack {
    public static void main(String[] args) {
        Queues q = new Queues();
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);
        System.out.println(q.top());
        System.out.println(q.size());
        System.out.println(q.pop());
        System.out.println(q.top());
        System.out.println(q.size());
    }
}

class Queues{
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void push(int a){
        while (!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(a);
        while (!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    int pop(){
        if (s1.empty()){
            return -1;
        }
        return s1.pop();
    }

    int top(){
        if (s1.empty()){
            return -1;
        }
        return s1.peek();
    }

    int size(){
        return s1.size();
    }
}
