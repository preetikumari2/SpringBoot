package com.ivytraining.employeecrudoperation.Models;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "EmployeeDetails")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String Company;
    @Column(nullable = false)
    private Date DOJ;
    @Column(nullable = false)
    private String Address;
    @Column(nullable = false)
    private long PhoneNo;
    @Column(nullable = false)
    private double Salary;
}
