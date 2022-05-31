package com.mathematical;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int num = sc.nextInt();
        ArrayList<Integer> list = getTable(num);
        System.out.println(list);
    }

    private static ArrayList<Integer> getTable(int num) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=1;i<=10;i++){
            list.add(i*num);
        }
        return list;
    }
}
