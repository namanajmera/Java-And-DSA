package com.linkedList;

import java.util.Scanner;

public class RemoveEveryKthNode {
    public static void main(String[] args) {
        Node<Integer> head = CommonFunctionLinkedList.createLinkList();
        Scanner sc = new Scanner(System.in);
        int kth = sc.nextInt();
//        deleteKPrint(head,kth);
        Node<Integer> newHead = deleteK(head,kth);
        PrintLinkedList.printLinkedList(newHead);
    }

    private static Node<Integer> deleteK(Node<Integer> head, int kth) {
        Node<Integer> currentNode = head;
        int count = 1;
        while (currentNode!=null){
            if (count == kth){
                head = CommonFunctionLinkedList.deleteNode(head,count);
                kth +=count-1;
            }
            count++;
            currentNode = currentNode.next;
        }
        return head;
    }

    private static void deleteKPrint(Node<Integer> head, int kth) {
        Node<Integer> currentNode = head;
        int count = 1;
        while (currentNode!= null){
            if (count == kth){
                count = 1;
                currentNode = currentNode.next;
            }else{
                System.out.println(currentNode.data+" ");
                currentNode = currentNode.next;
                count++;
            }
        }
    }
}
