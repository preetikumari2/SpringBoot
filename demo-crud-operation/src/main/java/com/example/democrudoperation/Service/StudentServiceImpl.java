package com.example.democrudoperation.Service;

import com.example.democrudoperation.Models.Student;
import com.example.democrudoperation.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepo studentRepo;
    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }
    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }
    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }
    @Override
    public Student getStudentById(int id) {
        return studentRepo.findById(id).orElseThrow();
    }
    @Override
    public Student updateStudent(Student student ,int id)
    {
        Student existingStudent = studentRepo.findById(id).orElseThrow();
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setAddress(student.getAddress());
        studentRepo.save(existingStudent);
        return existingStudent;
    }
    @Override
    public void deleteStudent(int id)
    {
        studentRepo.findById(id).orElseThrow();
        studentRepo.deleteById(id);
    }
}
