package com.ivytraining.employeecrudoperation.Repository;

import com.ivytraining.employeecrudoperation.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
