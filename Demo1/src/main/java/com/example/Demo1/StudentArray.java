package com.example.Demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;

@RestController
public class StudentArray {
    @GetMapping("/students")
    public ArrayList DisplayList(){
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Preethi");
        arr.add("Nisha");
        arr.add("Seema");
        arr.add("Priya");
        return arr;
    }
}
