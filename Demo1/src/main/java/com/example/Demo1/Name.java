package com.example.Demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Name {
    @GetMapping("/name")
    public String Name() { return "Preethi";}
}
