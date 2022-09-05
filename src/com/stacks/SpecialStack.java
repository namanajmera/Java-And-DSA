package com.stacks;

public class SpecialStack {
    public static void main(String[] args) {
        StackUsingArray stackUsingArray = new StackUsingArray();
        System.out.println("Is Empty Stack ==> "+stackUsingArray.isEmpty());
        System.out.println("Size of Stack ==> " + stackUsingArray.size());
        stackUsingArray.push(10);
        System.out.println("Size of Stack ==> " + stackUsingArray.size());
        stackUsingArray.push(20);
        System.out.println("Size of Stack ==> " + stackUsingArray.size());
        stackUsingArray.push(30);
        System.out.println("Size of Stack ==> " + stackUsingArray.size());
        stackUsingArray.push(40);
        System.out.println("Size of Stack ==> " + stackUsingArray.size());
        System.out.println("Pop element is ==> " + stackUsingArray.pop());
        System.out.println("Size of Stack ==> " + stackUsingArray.size());
        System.out.println("Pop element is ==> " + stackUsingArray.pop());
        System.out.println("Size of Stack ==> " + stackUsingArray.size());
        stackUsingArray.printStack();
        stackUsingArray.push(5);
        stackUsingArray.push(0);
        stackUsingArray.push(4);
        stackUsingArray.push(1);
        stackUsingArray.push(20);
        stackUsingArray.printStack();
        System.out.println("Minimum value of Stack ==> " + stackUsingArray.getMin());
    }
}
