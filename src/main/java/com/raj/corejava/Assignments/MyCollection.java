package com.raj.corejava.Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class MyCollection {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5));

        int start = 0;
        while(start < arr.size() - 1) {
            if(arr.get(start).equals(arr.get(start + 1))) {
                arr.remove(start + 1);
            }
            else {
                start++;
            }
        }

        for(int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

    }
}
