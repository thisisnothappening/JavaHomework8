package com.fasttrack.Exercise4;

import java.util.Arrays;

// 4)Create an object that represents a Student with name and grade.
// Add getters for them. No setters, the object is immutable.
// Create two static fields that will remember the sum of the grades and the other is the number of students.
// Also create a static method that uses these static fields to calculate the average grade for all students.
public class Main {
    public static void main(String[] args) {
        Student student = new Student(Arrays.asList(new Cipri(), new Ana(), new Mircea()));

        student.getGrade("Ana");
        student.getGrade("Cipri");
        student.getGrade("Mircea");

        Student.averageGrade();
    }
}
