package com.fasttrack.Exercise4;

import java.util.List;

public class Student {
    private static List<Students> students;

    private static double sum;

    private static int numberOfStudents;

    public Student(List<Students> students) {
        Student.students = students;
    }

    public void getGrade(String name) {
        for (Students student : students) {
            if (student.name().equals(name)) {
                System.out.printf(student.name() + ": %.2f%n", student.grade());
            }
        }
    }

    public static void averageGrade() {
        for (Students student : students) {
            sum += student.grade();
            numberOfStudents++;
        }
        System.out.printf("Average grade: %.4f%n", sum / numberOfStudents);
    }
}
