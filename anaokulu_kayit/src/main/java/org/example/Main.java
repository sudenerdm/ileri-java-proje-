package org.example;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        StudentManager<Student> studentManager = new StudentManager<>();


        Student student1 = new Student("Aylin ", 3, "3 yaş grubu");
        Student student2 = new Student("Mustafa", 4, "4 yaş grubu");
        Student student3 = new Student("Selin", 5, "5 yaş grubu");
        Student student4 = new Student("Emre", 6, "6 yaş grubu");
        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);
        studentManager.addStudent(student4);



        List<Student> allStudents = studentManager.getAllStudents();
        for (Student student : allStudents) {
            System.out.println(student);
        }
    }
    }
