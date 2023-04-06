package com.abhishekcoder.StudentManagementApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("students")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/add-student")
    public ResponseEntity<String> addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return new ResponseEntity<>("Student has been added Successfully", HttpStatus.CREATED);
    }

    @PostMapping("/add-teacher")
    public ResponseEntity<String> addTeacher(@RequestBody Teacher teacher){
        studentService.addTeacher(teacher);
        return new ResponseEntity<>("Teacher has been added Succesfully", HttpStatus.CREATED);
    }

    @PutMapping("/add-student-teacher-pair")
    public ResponseEntity<String> addStudentTeacherPair(@RequestParam String student_name, @RequestParam String teacher_name){
        studentService.addStudentTeacherPair(student_name, teacher_name);
        return new ResponseEntity<>("Teacher student pair has been added Successfully", HttpStatus.CREATED);
    }

    @GetMapping("/get-student-by-name/{name}")
    public ResponseEntity<Student> getStudentByName(@PathVariable String student_name){
        Student student=null;
        student = studentService.getStudentBYName(student_name);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @GetMapping("/get-teacher-by-name/{name}")
    public ResponseEntity<Teacher> getTeacherByName(@PathVariable String teacher_name){
        Teacher teacher=null;
        teacher = studentService.getTeacherByName(teacher_name);
        return new ResponseEntity<>(teacher, HttpStatus.CREATED);
    }

    @GetMapping("/get-students-by-teacher-name/{teacher}")
    public ResponseEntity<List<String>> getStudentsByTeacherName(@PathVariable String teacher_name){
        List<String> students = null; // Assign list of student by calling service layer method
        students = studentService.getStudentsByTeacherName(teacher_name);
        return new ResponseEntity<>(students, HttpStatus.CREATED);
    }

    @GetMapping("/get-all-students")
    public ResponseEntity<List<String>> getAllStudents(){
        List<String> students = null; // Assign list of student by calling service layer method
        students = studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete-teacher-by-name")
    public ResponseEntity<String> deleteTeacherByName(@RequestParam String teacher){
        studentService.deleteTeacherByName(teacher);
        return new ResponseEntity<>(teacher + " removed successfully", HttpStatus.CREATED);
    }
    @DeleteMapping("/delete-all-teachers")
    public ResponseEntity<String> deleteAllTeachers(){
        studentService.deleteAllTeachers();
        return new ResponseEntity<>("All teachers deleted successfully", HttpStatus.CREATED);
    }
}
