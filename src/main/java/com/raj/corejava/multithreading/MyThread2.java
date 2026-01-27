package com.raj.corejava.multithreading;

public class MyThread2 extends Thread{
    public static void printname() {
        System.out.println("Hello, Raj");
    }

    public static void printhello() {
        System.out.println("Hello World!!!");
    }

    public static void printhii() {
        System.out.println("Hii There");
    }

    public static void main(String[] args) {
        MyThread2 t1 = new MyThread2() {
            public void run() {
                printname();
            }
        };

        MyThread2 t2 = new MyThread2() {
            public void run() {
                printhello();
            }
        };

        MyThread2 t3 = new MyThread2() {
            public void run() {
                printhii();
            }
        };

        t1.start();
        t2.start();
        t3.start();
    }
}
