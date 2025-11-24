package com.example.SpringBootFundamental.Service;

import com.example.SpringBootFundamental.Repository.EmployeeRepository;
import com.example.SpringBootFundamental.dto.EmployeeDTO;
import com.example.SpringBootFundamental.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {


    @Autowired
    EmployeeRepository employeeRepository;


    public EmployeeDTO getAllEmployeeById(int id) {

        Employee employee = employeeRepository.getEmployeeById(id);
        EmployeeDTO employeeDTO = new EmployeeDTO();
        // Assuming EmployeeDTO has setters for id and name
        return employeeDTO.EmployeeMapper(employee);
    }
}
