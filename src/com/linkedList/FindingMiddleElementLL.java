package com.linkedList;

public class FindingMiddleElementLL {
    public static void main(String[] args) {
        Node<Integer> head = CommonFunctionLinkedList.createLinkList();
        int middleNodeValue = getMiddle(head);
        System.out.println("middleNodeValue ==> " + middleNodeValue);
    }

    private static int getMiddle(Node<Integer> head) {
        int lengthOfLL = 0;
        int middlePointIndex = -1;
        int middleValue = -1;
        if (head == null){
            return -1;
        }
        Node<Integer> currentNode = head;
        while (currentNode!=null){
            lengthOfLL++;
            currentNode = currentNode.next;
        }
        middlePointIndex = lengthOfLL/2;
        currentNode = head;
        int i=0;
        while (currentNode!=null){
            if (i == middlePointIndex){
                middleValue = currentNode.data;
                break;
            }
            currentNode = currentNode.next;
            i++;
        }
        return middleValue;
    }
}
