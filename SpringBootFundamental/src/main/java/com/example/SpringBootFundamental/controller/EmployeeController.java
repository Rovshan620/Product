package com.example.SpringBootFundamental.controller;

import com.example.SpringBootFundamental.Service.EmployeeService;
import com.example.SpringBootFundamental.dto.EmployeeDTO;
import com.example.SpringBootFundamental.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee/{id}")
        public ResponseEntity<EmployeeDTO> getEmployeeById(@PathVariable int id){

        EmployeeDTO employee = employeeService.getAllEmployeeById(id);
        return ResponseEntity.ok(employee);

    }
}
