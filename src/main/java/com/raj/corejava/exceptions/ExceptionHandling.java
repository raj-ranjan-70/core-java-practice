package com.raj.corejava.exceptions;

import java.util.Scanner;

public class ExceptionHandling {

    public static void function() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int first_num = sc.nextInt();
        int second_num = sc.nextInt();
        if(second_num == 0) {
            throw new ArithmeticException("User entered 0 as the value of second number!!!");
        }
        System.out.println("The division result is " + (first_num / second_num));

        int[] arr = new int[10];
        System.out.println("Enter the index you want to access: ");
        int index = sc.nextInt();
        if(index < 0 || index >= arr.length) throw new ArrayIndexOutOfBoundsException("User entered the value which is not present in the array");
        System.out.println("The element at index " + "index is: " + arr[index]);
    }
    public static void main(String[] args) {

        try {
            function();
        }
        catch (Exception e) {
            if(e instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("This is Array Index out of Bounds Exception");
            }
            if(e instanceof ArithmeticException) {
                System.out.println("This is Arithmetic Exception");
            }
        }

    }
}
