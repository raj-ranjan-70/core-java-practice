package com.raj.corejava.multithreading;

public class MyInterface {

    public static void printHello() {
        System.out.println("Hello World!!!");
    }

    public static void printName() {
        System.out.println("Hello Raj");
    }

    public static void printHii() {
        System.out.println("Hii There");
    }



    public static void main(String[] args) {
        Runnable r1 = () -> {
            printHello();
        };

        Runnable r2 = () -> {
            printName();
        };

        Runnable r3 = () -> {
            printHii();
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        Thread t3 = new Thread(r3);

        t1.start();
        t2.start();
        t3.start();
    }
}
