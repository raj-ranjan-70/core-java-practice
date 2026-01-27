package com.raj.corejava.multithreading;

public class Multithreading extends Thread {
    String Task;

    Multithreading(String Task) {
        this.Task = Task;
    }

    @Override
    public void run() {
        System.out.println(Task + " is executed");
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println("Thread Interrupted");
        }
    }

    public static void main(String[] args) {
        Multithreading t1 = new Multithreading("Eat");
        Multithreading t2 = new Multithreading("Sleep");
        Multithreading t3 = new Multithreading("Study");
        Multithreading t4 = new Multithreading("Code");
        Multithreading t5 = new Multithreading("Watch Reels");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
