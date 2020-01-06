package com.hasitha.asciidoctordemo.repository.impl;

import com.hasitha.asciidoctordemo.model.Employee;
import com.hasitha.asciidoctordemo.repository.EmployeeRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
    @Override
    public Employee getEmployeeById(int id) {
        return new Employee(1,"Hasitha","SSE");
    }
}
