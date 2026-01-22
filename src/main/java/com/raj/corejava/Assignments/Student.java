package com.raj.corejava.Assignments;
import java.util.*;
public class Student {
    private int student_id;
    private String student_name;

    public Student(int student_id, String student_name) {
        this.student_id = student_id;
        this.student_name = student_name;
    }

    public int getStudent_id() {
        return this.student_id;
    }
    public String getStudent_name() {
        return this.student_name;
    }
}


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students you want to enroll: ");
        int student_count = sc.nextInt();

        if(student_count <= 0 || student_count > 100) {
            System.out.println("Invalid Student count!!!\n Please enter the student count between 1 and 100 (inclusive)");
        }
        else {
            Student[] students = new Student[student_count];
            for(int i=0;i<student_count;i++) {
                System.out.print("Enter the id of student " + (i + 1) +": ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter the name of student " + (i + 1) + ": ");
                String name = sc.nextLine();
                students[i]= new Student(id, name);
            }

            System.out.println("The student details are as follows: ");
            for(int i=0;i<student_count;i++) {
                System.out.println("Student " + i + " { ID: " + students[i].getStudent_id() + ", Name: " + students[i].getStudent_name() + " }.");
            }
        }

        sc.close();
    }
}