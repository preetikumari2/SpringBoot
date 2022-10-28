package com.example.democrudoperation.Models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "StudentDetails")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(nullable = false)
    private String address;
}