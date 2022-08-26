package com.stacks;

public class ImplementUsingLinkedList {
    public static void main(String[] args) {
        StackUsingLinkedList stackUsingLinkedList = new StackUsingLinkedList();
        System.out.println("Is Empty Stack ==> "+stackUsingLinkedList.isEmpty());
        System.out.println("Size of Stack ==> " + stackUsingLinkedList.size());
        stackUsingLinkedList.push(10);
        System.out.println("Size of Stack ==> " + stackUsingLinkedList.size());
        stackUsingLinkedList.push(20);
        System.out.println("Size of Stack ==> " + stackUsingLinkedList.size());
        stackUsingLinkedList.push(30);
        System.out.println("Size of Stack ==> " + stackUsingLinkedList.size());
        stackUsingLinkedList.push(40);
        System.out.println("Size of Stack ==> " + stackUsingLinkedList.size());
        System.out.println("Pop element is ==> " + stackUsingLinkedList.pop());
        System.out.println("Size of Stack ==> " + stackUsingLinkedList.size());
        System.out.println("Pop element is ==> " + stackUsingLinkedList.pop());
        System.out.println("Size of Stack ==> " + stackUsingLinkedList.size());
    }
}
