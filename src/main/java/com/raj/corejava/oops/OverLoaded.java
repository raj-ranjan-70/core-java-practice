package com.raj.corejava.oops;

/*
    The compilation time will be much less than the class which has the methods with different signatures
    In Polymorphism, At compile time the reference is checked  (left hand side) but at run time the object is checked (right hand side)

 */

public class OverLoaded {

    public void show(int integer) {
        System.out.println("Int is " + integer);
    }

    public void show(long integer) {
        System.out.println("Long is " + integer);
    }

    public void show(String string) {
        System.out.println("String is " + string);
    }

    public void show(StringBuilder string) {
        System.out.println("StringBuilder is " + string);
    }

    public static void main(String[] args) {
        OverLoaded overLoaded = new OverLoaded();
        overLoaded.show(123456789);
    }
}
