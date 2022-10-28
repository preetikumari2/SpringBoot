package com.example.democrudoperation.Service;

import com.example.democrudoperation.Models.Student;

import java.util.List;

public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(int id);
    Student updateStudent(Student student, int id);
    void deleteStudent(int id);
}
