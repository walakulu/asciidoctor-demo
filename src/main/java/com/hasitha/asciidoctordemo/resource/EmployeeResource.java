package com.hasitha.asciidoctordemo.resource;

import com.hasitha.asciidoctordemo.model.Employee;
import com.hasitha.asciidoctordemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/employees")
public class EmployeeResource {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return   employeeService.getEmployeeById(1) ;
    }
}
