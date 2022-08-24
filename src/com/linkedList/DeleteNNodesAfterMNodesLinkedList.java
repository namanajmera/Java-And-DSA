package com.linkedList;

import java.util.Scanner;

public class DeleteNNodesAfterMNodesLinkedList {
    public static void main(String[] args) {
        Node<Integer> head = CommonFunctionLinkedList.createLinkList();
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        Node<Integer> newHead = linkDelete(head, m, n);
        PrintLinkedList.printLinkedList(newHead);
    }

    private static Node<Integer> linkDelete(Node<Integer> head, int m, int n) {
        if (head == null) {
            return null;
        }
        int index = 0;
        Node<Integer> currentNode = head;
        while (currentNode != null) {
            if (index == m) {
                int i = 0;
                while (i != n) {
                    int nth = index + 1 + i;
                    head = CommonFunctionLinkedList.deleteNode(head, nth);
                    i++;
                }
                m += index;
            }
            index++;
            currentNode = currentNode.next;
        }
        return head;
    }
}
