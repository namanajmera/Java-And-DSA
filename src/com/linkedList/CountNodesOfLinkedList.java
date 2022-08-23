package com.linkedList;

public class CountNodesOfLinkedList {
    public static void main(String[] args) {
        Node<Integer> head = CreateLinkedList.createLinkList();
        int length = getCount(head);
        System.out.println("Length of Linked List==> " + length);
    }

    private static int getCount(Node<Integer> head) {
        int lengthLL = 0;
        if (head == null){
            return lengthLL;
        }
        Node<Integer> currentNode = head;
        while (currentNode!=null){
            lengthLL++;
            currentNode = currentNode.next;
        }
        return lengthLL;
    }
}
