package com.hasitha.asciidoctordemo.repository;

import com.hasitha.asciidoctordemo.model.Employee;

public interface EmployeeRepository {

    Employee getEmployeeById(int id);
}
