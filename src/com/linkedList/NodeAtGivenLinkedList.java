package com.linkedList;

import java.util.Scanner;

public class NodeAtGivenLinkedList {
    public static void main(String[] args) {
        Node<Integer> head = CreateLinkedList.createLinkList();
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        int nodeValue = getNthValue(head,index);
        System.out.println("NodeValue ==> " + nodeValue);
    }

    private static int getNthValue(Node<Integer> head, int index) {
        Node<Integer> currentNode = head;
        int answer = 0;
        int i = 0;
        while (currentNode != null){
            if (i+1 == index){
                answer = currentNode.data;
                break;
            }
            currentNode = currentNode.next;
            i++;
        }
        return answer;
    }
}
