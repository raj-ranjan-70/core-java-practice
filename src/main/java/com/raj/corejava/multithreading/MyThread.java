package com.raj.corejava.multithreading;

public class MyThread extends Thread{
    public static void printHello() {
        System.out.println("Hello World");
    }

    public static void printHi() {
        System.out.println("Hii There");
    }

    public static void printName() {
        System.out.println("Hello, Raj");
    }
    @Override
    public void run() {
        printHello();
        printHi();
        printName();
    }


    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
    }
}
