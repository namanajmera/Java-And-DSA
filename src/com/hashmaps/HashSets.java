package com.hashmaps;

import java.util.HashSet;

public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> hashSets = new HashSet();
        hashSets.add(5);
        hashSets.add(10);
        hashSets.add(1);

        if (hashSets.contains(10)){
            System.out.println("Present");
        }else
            System.out.println("Not Present");

        hashSets.remove(1);
        System.out.println(hashSets.size());
        System.out.println(hashSets.isEmpty());
        hashSets.clear();
        System.out.println(hashSets.isEmpty());
    }
}
