package com.linkedList;

import java.util.Scanner;

public class CreateLinkedList {
    public static void main(String[] args) {
        Node<Integer> node = createLinkList();
        if (node != null) {
            System.out.println("From Scanner ==> ");
            PrintLinkedList.printLinkedList(node);
        }else{
            System.out.println("Empty Linked List.");
        }
    }

    public static Node<Integer> createLinkList() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == -1){
            return null;
        }
        Node<Integer> head = new Node<>(num);
        Node<Integer> currentNode = head;
        while (true){
            int nodeValue = sc.nextInt();
            if (nodeValue != -1){
                currentNode.next = new Node<>(nodeValue);
                currentNode = currentNode.next;
            }else {
                break;
            }
        }
        return head;
    }

}
