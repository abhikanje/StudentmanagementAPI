package com.abhishekcoder.StudentManagementApi;

public class Student {
    private String name;
    private int rollNo;
    private double avgScore;
    private int age;
    private int admYear;

    public Student() {
    }

    public Student(String name, int rollNo, double avgScore, int age, int admYear) {
        this.name = name;
        this.rollNo = rollNo;
        this.avgScore = avgScore;
        this.age = age;
        this.admYear = admYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAdmYear() {
        return admYear;
    }

    public void setAdmYear(int admYear) {
        this.admYear = admYear;
    }
}
