package com.raj.corejava.Assignments;
import java.util.*;
public class ArrayException {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Arrays.fill(arr, 0);
        try {
            System.out.println("The element at index 10 is " + arr[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception happened: " + e.getMessage());
        }
    }
}
