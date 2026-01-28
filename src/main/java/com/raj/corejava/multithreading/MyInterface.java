package com.raj.corejava.multithreading;

public class MyInterface {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Hii There");
        });

        Thread t2 = new Thread(() -> {
            System.out.println("Hello World!!!");
        });

        Thread t3 = new Thread(() -> {
            System.out.println("Hello Raj");
        });

        /*
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hii there");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello World!!!");
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, Raj");
            }
        });
        */

        t1.start();
        t2.start();
        t3.start();
    }
}
