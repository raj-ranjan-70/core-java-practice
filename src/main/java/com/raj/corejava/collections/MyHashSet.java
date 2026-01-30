package com.raj.corejava.collections;

import java.util.HashSet;

public class MyHashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println(set.contains(5));

        for(int ele : set) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
