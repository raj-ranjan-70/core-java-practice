package com.raj.corejava.oops;

public class Student {

    private int student_id;
    private String student_name;

    public Student(String student_name, int student_id) {
        this.student_name = student_name;
        this.student_id = student_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", student_name='" + student_name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student firstStudent = new Student("Raj Ranjan", 1);
        System.out.println(firstStudent);
    }

}
