package com.linkedList;

public class PrintLinkedList {
    public static void printLinkedList(Node<Integer> head){
        if (head == null){
            return;
        }
        Node<Integer> currentNode = head;
        while (currentNode != null){
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
    }
}
