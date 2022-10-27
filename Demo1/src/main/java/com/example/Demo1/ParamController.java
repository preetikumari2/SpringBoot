package com.example.Demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParamController {
    @GetMapping("/employee/{firstName}/{companyName}/{salary}")
    public Employee employee(@PathVariable("firstName") String firstName, @PathVariable("companyName") String companyName,
                             @PathVariable("salary") int salary){
        return new Employee(firstName, companyName, salary);
    }
    @GetMapping("/employees/api")
    public Employee employees(@RequestParam(name = "firstName") String firstName, @RequestParam(name = "companyName") String companyName,
                              @RequestParam(name = "salary") int salary){
        return new Employee(firstName, companyName, salary);
    }
}
