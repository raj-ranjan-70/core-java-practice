package com.raj.corejava.collections;

import java.util.HashMap;

// {"Akash", "Java", "Enroll"}
public class MyHashMap {

    public static void main(String[] args) {

        String[][] logs = {
                {"Raj", "Cloud", "Enroll"},
                {"Amit", "Java", "Enroll"},
                {"Suresh", "Spring Boot", "Enroll"},
                {"Neha", "Cloud", "Enroll"},
                {"Priya", "Java", "Enroll"},
                {"Rahul", "Spring Boot", "Enroll"},
                {"Ankit", "Cloud", "Enroll"},
                {"Simran", "Java", "Enroll"},
                {"Vikram", "Spring Boot", "Enroll"},
                {"Pooja", "Java", "Enroll"},

                {"Karan", "Cloud", "Enroll"},
                {"Sneha", "Spring Boot", "Enroll"},
                {"Rohan", "Cloud", "Enroll"},
                {"Arjun", "Spring Boot", "Enroll"},
                {"Meena", "Cloud", "Enroll"},
                {"Kiran", "Java", "Enroll"},
                {"Deepak", "Java", "Enroll"},
                {"Rohit", "Java", "Enroll"},
                {"Raj", "Cloud", "Watch"},
                {"Amit", "Java", "Watch"},

                {"Suresh", "Spring Boot", "Watch"},
                {"Neha", "Cloud", "Watch"},
                {"Priya", "Java", "Watch"},
                {"Rahul", "Spring Boot", "Watch"},
                {"Ankit", "Cloud", "Watch"},
                {"Simran", "Java", "Watch"},
                {"Vikram", "Spring Boot", "Watch"},
                {"Pooja", "Java", "Watch"},
                {"Karan", "Cloud", "Watch"},
                {"Sneha", "Spring Boot", "Watch"},

                {"Rohan", "Cloud", "Watch"},
                {"Arjun", "Spring Boot", "Watch"},
                {"Meena", "Cloud", "Watch"},
                {"Kiran", "Java", "Watch"},
                {"Deepak", "Java", "Watch"},
                {"Rohit", "Java", "Watch"},
                {"Raj", "Cloud", "Watch"},
                {"Amit", "Java", "Watch"},
                {"Suresh", "Spring Boot", "Watch"},
                {"Neha", "Cloud", "Watch"},

                {"Priya", "Java", "Watch"},
                {"Rahul", "Spring Boot", "Watch"},
                {"Ankit", "Cloud", "Watch"},
                {"Simran", "Java", "Watch"},
                {"Vikram", "Spring Boot", "Watch"},
                {"Pooja", "Java", "Watch"},
                {"Karan", "Cloud", "Watch"},
                {"Sneha", "Spring Boot", "Watch"},
                {"Rohan", "Cloud", "Watch"},
                {"Raj", "Cloud", "Watch"}
        };

        HashMap<String, Integer> count = new HashMap<>();

        for(int i=0;i < logs.length;i++) {
            count.put(logs[i][0], 0);
        }

        for(int i=0;i < logs.length;i++) {
            count.put(logs[i][0], count.get(logs[i][0]) + 1);
        }

        int max_count = -1;
        String user_name = "";
        for(String key : count.keySet()) {
            if(count.get(key) > max_count) {
                max_count = count.get(key);
                user_name = key;
            }
        }

        System.out.println("Most Active User is " + user_name + ", total times visited is " + max_count);
    }
}
