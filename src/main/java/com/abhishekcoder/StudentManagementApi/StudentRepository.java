package com.abhishekcoder.StudentManagementApi;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class StudentRepository {
    private HashMap<String,Student> StudentHashMap;
    private HashMap<String, Teacher> TeacherHashMap;
    private HashMap<String, List<String>> StudentTeacherHashMap;

    public StudentRepository() {
        this.StudentHashMap = new HashMap<>();
        this.TeacherHashMap = new HashMap<>();
        this.StudentTeacherHashMap = new HashMap<>();
    }

    public void addStudent(Student student){
        StudentHashMap.put(student.getName(), student);
    }
    public void addTeacher(Teacher teacher){
        TeacherHashMap.put(teacher.getName(), teacher);
    }
    public void addStudentTeacherPair(String student_name, String teacher_name){

        List<String> std_list = new ArrayList<>();
        // if is there an existing teacher in the teacherStudentHashMap than
        // get the list add student into it
        if(StudentTeacherHashMap.containsKey(teacher_name)){
            std_list = StudentTeacherHashMap.get(teacher_name);
        }
        std_list.add(student_name);
        StudentTeacherHashMap.put(teacher_name,std_list);
    }
    public Student getStudentByName(String student_name){
        return StudentHashMap.get(student_name);
    }
    public Teacher getTeacherByName(String teacher_name){
        return TeacherHashMap.get(teacher_name);
    }
    public List<String> getStudentsByTeacherName(String teacher_name){
        return StudentTeacherHashMap.get(teacher_name);
    }
    public List<String> getAllStudents(){
        return new ArrayList<>(StudentHashMap.keySet());
    }
    public void deleteTeacherByName(String teacher_name){
        List<String> studentList = StudentTeacherHashMap.get(teacher_name);
        for(String student : studentList){
            StudentHashMap.remove(student);
        }
        TeacherHashMap.remove(teacher_name);
        StudentTeacherHashMap.remove(teacher_name);
    }
    public void deleteAllTeachers(){
        for(String name : TeacherHashMap.keySet()){
            deleteTeacherByName(name);
        }
    }
}
