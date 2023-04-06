package com.abhishekcoder.StudentManagementApi;

public class Teacher {
    private String name;
    private int age;
    private int numOfStudent;

    public Teacher() {
    }

    public Teacher(String name, int age, int numOfStudent) {
        this.name = name;
        this.age = age;
        this.numOfStudent = numOfStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumOfStudent() {
        return numOfStudent;
    }

    public void setNumOfStudent(int numOfStudent) {
        this.numOfStudent = numOfStudent;
    }
}
