package com.raj.corejava.multithreading;

public class MyThread3 extends Thread {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                System.out.println("This is Thread 1");
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                System.out.println("This is Thread 2");
            }
        };

        Thread t3 = new Thread() {
            public void run() {
                System.out.println("This is Thread 3");
            }
        };

        Thread t4 = new Thread() {
            public void run() {
                System.out.println("This is Thread 4");
            }
        };

        Thread t5 = new Thread() {
            public void run() {
                System.out.println("This is Thread 5");
            }
        };

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
