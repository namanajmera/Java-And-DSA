package com.puzzles;

import java.util.Scanner;

public class CountSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = countSquares(num);
        System.out.println("result==> "+ result);
    }

    private static int countSquares(int num) {
        if (num == 0 || num == 1){
            return 0;
        }
        int count = 1;
        for (int  i = 2;i<num;i++){
            if (perfectSquare(i)){
                count++;
            }
        }
        return count;
    }

    private static boolean perfectSquare(int num){
        int sr = (int)Math.sqrt(num);
        return ((sr * sr) == num);
    }
}
