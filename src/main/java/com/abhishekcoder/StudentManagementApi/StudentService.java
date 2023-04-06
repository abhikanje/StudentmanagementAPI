package com.abhishekcoder.StudentManagementApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public void addStudent(Student student){
        studentRepository.addStudent(student);
    }
    public void addTeacher(Teacher teacher){
        studentRepository.addTeacher(teacher);
    }

    public void addStudentTeacherPair(String student_name, String teacher_name){
        studentRepository.addStudentTeacherPair(student_name, teacher_name);
    }
    public Student getStudentBYName(String student_name){
        return studentRepository.getStudentByName(student_name);
    }
    public Teacher getTeacherByName(String teacher_name){
        return studentRepository.getTeacherByName(teacher_name);
    }
    public List<String> getStudentsByTeacherName(String teacher_name){
        return studentRepository.getStudentsByTeacherName(teacher_name);
    }
    public List<String> getAllStudents(){
        return studentRepository.getAllStudents();
    }
    public void deleteTeacherByName(String teacher_name){
        studentRepository.deleteTeacherByName(teacher_name);
    }
    public void deleteAllTeachers(){
        studentRepository.deleteAllTeachers();
    }
}
