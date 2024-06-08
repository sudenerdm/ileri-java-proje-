package org.example;
import java.util.ArrayList;
import java.util.List;
public class StudentManager<T extends Student>  {
    private List<T> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public void addStudent(T student) {
        students.add(student);
    }

    public List<T> getAllStudents() {
        return students;
    }
}
