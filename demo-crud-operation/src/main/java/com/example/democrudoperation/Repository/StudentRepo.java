package com.example.democrudoperation.Repository;

import com.example.democrudoperation.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
