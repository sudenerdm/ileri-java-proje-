package org.example;

public class Student {
    private String isim;
    private int age;
    private String className;

    public Student(String isim, int age, String className) {
        this.isim = isim;
        this.age = age;
        this.className = className;
    }

    public String getName() {
        return isim;
    }

    public int getAge() {
        return age;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "İsim ='" + isim + '\'' +
                ", Yaş=" + age +
                ", Sınıf Adı='" + className + '\'' +
                '}';
    }
}
