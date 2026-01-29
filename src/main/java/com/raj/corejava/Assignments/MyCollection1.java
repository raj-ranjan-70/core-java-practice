package com.raj.corejava.Assignments;

import java.util.ArrayList;

public class MyCollection1 {
    public static boolean isValidWord(String str) {
        if(str.length() > 4) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if(!Character.isLetter(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Dev@ops");
        words.add("Microservices");
        words.add("Raj1");

        System.out.print("Before: ");
        for(String str : words) {
            System.out.print(str + " ");
        }


        for(int i=words.size() - 1;i>=0;i--) {
            if(!isValidWord(words.get(i))) {
                words.remove(i);
            }
        }

        System.out.print("\nAfter: ");
        for(String ele : words) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
