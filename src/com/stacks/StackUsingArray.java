package com.stacks;

public class StackUsingArray {
    private int data[];
    private int topIndex;

    StackUsingArray(){
        data = new int[10];
        topIndex = -1;
    }

    public int size(){
        return topIndex + 1;
    }

    public boolean isEmpty(){
        return topIndex == -1;
    }

    public void push(int elem){
        if (topIndex == data.length -1){
            System.out.println("Stack is Full.");
            return;
        }
        data[++topIndex] = elem;
    }

    public int pop(){
        if (topIndex == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        int popElem = data[topIndex];
        topIndex--;
        return popElem;
    }

    public int getMin(){
        if (topIndex == -1){
            return -1;
        }
        int min = Integer.MAX_VALUE;
        for (int i =0;i<=topIndex;i++){
            if (min > data[i]){
                min = data[i];
            }
        }
        return min;
    }

    public void printStack(){
        if (topIndex == -1){
            System.out.println("Stack is empty");
            return;
        }
        for (int i = topIndex;i>=0;i--){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

}
