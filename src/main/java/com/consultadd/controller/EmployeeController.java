package com.consultadd.controller;
import com.consultadd.modal.Employee;
import com.consultadd.repository.EmployeeRepository;
import com.consultadd.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;
    @GetMapping("/employee")
    public List<Employee> getEmployee(){
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeList;

    }
}
