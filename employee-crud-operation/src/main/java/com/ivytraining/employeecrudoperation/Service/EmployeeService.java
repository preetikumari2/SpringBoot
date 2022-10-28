package com.ivytraining.employeecrudoperation.Service;

import com.ivytraining.employeecrudoperation.Models.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(int id);
    Employee updateEmployee(Employee employee, int id);
    void deleteEmployee(int id);
}
