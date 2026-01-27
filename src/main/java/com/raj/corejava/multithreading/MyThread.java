package com.raj.corejava.multithreading;

public class MyThread extends Thread{
    String task;

    MyThread(String task) {
        this.task = task;
    }
    @Override
    public void run() {
        System.out.println(task);
    }


    public static void main(String[] args) {
        MyThread t1 = new MyThread("Hello World!!!");
        MyThread t2 = new MyThread("Hii There");

        t1.start();
        t2.start();
    }
}
