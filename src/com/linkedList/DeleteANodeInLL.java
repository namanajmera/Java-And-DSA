package com.linkedList;

import java.util.Scanner;

public class DeleteANodeInLL {
    public static void main(String[] args) {
        Node<Integer> head = CommonFunctionLinkedList.createLinkList();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        Node<Integer> newHead = CommonFunctionLinkedList.deleteNode(head,x);
        PrintLinkedList.printLinkedList(newHead);
    }
}
