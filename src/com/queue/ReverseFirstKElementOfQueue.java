package com.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseFirstKElementOfQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        while (value!= -1){
            queue.add(value);
            value = sc.nextInt();
        }
        System.out.print("Enter Kth Value==> ");
        int k = sc.nextInt();
        Queue<Integer> result = reverseFirstKthElement(queue,k);
        for (Integer elem:result){
            System.out.print(elem+" ");
        }
    }

    private static Queue<Integer> reverseFirstKthElement(Queue<Integer> queue, int k) {
        Queue<Integer> result = new LinkedList<>();
        Stack<Integer> s1 = new Stack<>();
        int i=0;
        while (i<k){
            s1.push(queue.remove());
            i++;
        }
        while (!s1.isEmpty()){
            result.add(s1.pop());
        }
        while (!queue.isEmpty()){
            result.add(queue.remove());
        }
        return result;
    }
}
