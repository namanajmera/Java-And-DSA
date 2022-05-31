package com.mathematical;

import java.util.Scanner;

public class PrintThePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:- ");
        int num = sc.nextInt();
        printPattern(num);
    }

    private static void printPattern(int num) {
        int k = num * num;
        int c = 1;
        for (int i=0;i<num;i++) {
            int temp = num;
            for(int j=0;j<num;j++) {
                for (int n=0;n<k/num;n++){
                    System.out.print(temp+" ");
                }
                temp-=1;
            }
            k = num * (num - c);
            c+=1;
            System.out.print('$');
        }
    }
}
