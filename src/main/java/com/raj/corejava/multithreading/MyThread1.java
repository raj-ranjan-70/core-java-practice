package com.raj.corejava.multithreading;

public class MyThread1 extends Thread{
    String Task;

    MyThread1(String Task) {
        this.Task = Task;
    }

    @Override
    public void run() {
        System.out.println(this.Task);
    }

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("Hello World");
        MyThread1 t2 = new MyThread1("Hii there");
        MyThread1 t3 = new MyThread1("Hello. Raj");

        t1.start();
        t2.start();
        t3.start();
    }

}
