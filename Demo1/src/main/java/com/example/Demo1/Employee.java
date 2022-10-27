package com.example.Demo1;

public class Employee {
    private String firstName;
    private String companyName;
    private int salary;


    public Employee(String firstName, String companyName, int salary){

        this.firstName = firstName;
        this.companyName = companyName;
        this.salary = salary;
    }
    public String getFirstName() { return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }
    public int getSalary() { return salary;}
    public void setSalary(int salary) {this.salary = salary; }
}