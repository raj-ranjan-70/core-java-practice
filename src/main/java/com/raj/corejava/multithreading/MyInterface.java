package com.raj.corejava.multithreading;

public class MyInterface implements Runnable {

    String Task;
    MyInterface(String Task) {
        this.Task = Task;
    }

    @Override
    public void run() {
        System.out.println(Task);
    }

    public static void main(String[] args) {

        MyInterface task1 = new MyInterface("Hii, There");
        MyInterface task2 = new MyInterface("Hello World!!!");
        MyInterface task3 = new MyInterface("Hello, Raj");

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);

        t1.start();
        t2.start();
        t3.start();
    }
}
