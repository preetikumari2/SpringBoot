package com.ivytraining.employeecrudoperation.Service;

import com.ivytraining.employeecrudoperation.Models.Employee;
import com.ivytraining.employeecrudoperation.Repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImplem implements EmployeeService{
    @Autowired
    private EmployeeRepo employeeRepo;
    public EmployeeServiceImplem(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }
    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }
    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }
    @Override
    public Employee getEmployeeById(int id) {
        return employeeRepo.findById(id).orElseThrow();
    }
    @Override
    public Employee updateEmployee(Employee employee ,int id)
    {
        Employee existingEmployee = employeeRepo.findById(id).orElseThrow();
        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setCompany(employee.getCompany());
        existingEmployee.setDOJ(employee.getDOJ());
        existingEmployee.setAddress(employee.getAddress());
        existingEmployee.setPhoneNo(employee.getPhoneNo());
        existingEmployee.setSalary(employee.getSalary());
        employeeRepo.save(existingEmployee);
        return existingEmployee;
    }
    @Override
    public void deleteEmployee(int id)
    {
        employeeRepo.findById(id).orElseThrow();
        employeeRepo.deleteById(id);
    }
}
