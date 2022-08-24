package com.linkedList;

import java.util.Scanner;

public class NthNodeFromEndLL {
    public static void main(String[] args) {
        Node<Integer> head = CommonFunctionLinkedList.createLinkList();
        Scanner sc = new Scanner(System.in);
        int nth = sc.nextInt();
        int nodeValue = getNthFromLast(head,nth);
        System.out.println("nodeValue==> " + nodeValue);
    }

    private static int getNthFromLast(Node<Integer> head, int nth) {
        int nodeValue = -1;
        int i=0;
        int lengthOfLL = CommonFunctionLinkedList.lengthOfLinkedList(head);
        int index = lengthOfLL - nth;
        Node<Integer> currentNode = head;
        while (currentNode != null){
            if (index == i){
                nodeValue = currentNode.data;
                break;
            }
            i++;
            currentNode = currentNode.next;
        }
        return nodeValue;
    }
}
