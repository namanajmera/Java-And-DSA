package com.stacks;

import java.util.Scanner;

public class ReverseAStringUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StackUsingLinkedList stack = new StackUsingLinkedList();
        for (int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        String reverseString = reverse(stack);
        System.out.println("reverseString ==> "+ reverseString);
    }

    private static String reverse(StackUsingLinkedList stack) {
        String ans = "";
        while (stack.top() != null){
            ans+=stack.pop();
        }
        return ans;
    }
}
