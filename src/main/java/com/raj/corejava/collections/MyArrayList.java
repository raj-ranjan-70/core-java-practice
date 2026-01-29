package com.raj.corejava.collections;

import java.util.Arrays;

public class MyArrayList {

    private int[] arr;
    private int size;

    MyArrayList() {
        arr = new int[8];
        size = 0;
    }


    public void add(int element) {

        if (size == arr.length) {
            arr = Arrays.copyOf(arr, arr.length * 2);
        }

        arr[size] = element;
        size++;
    }

    public void delete(int index) {

        if (index < 0 || index >= size) {
            System.out.println("Invalid index!");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;
    }

    public int get(int index) {

        if (index < 0 || index >= size) {
            System.out.println("Invalid Index");
            return -1;
        }

        return arr[index];
    }

    public void set(int index, int element) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid Index");
            return;
        }

        arr[index] = element;
    }

    public void display() {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }




    public static void main(String[] args) {

        MyArrayList list = new MyArrayList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        list.display();

        System.out.println("Element at index 2: " + list.get(2));

        list.set(2, 999);
        System.out.println("After setting index 2: " + list.get(2));

        list.display();

        list.delete(3);
        System.out.println("After deleting index 3: " + list.get(3));
        list.display();
    }


}
