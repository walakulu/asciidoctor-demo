package com.hasitha.asciidoctordemo.service.impl;

import com.hasitha.asciidoctordemo.model.Employee;
import com.hasitha.asciidoctordemo.repository.EmployeeRepository;
import com.hasitha.asciidoctordemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repository;
    @Override
    public Employee getEmployeeById(int id) {

        return repository.getEmployeeById(id);
    }
}
