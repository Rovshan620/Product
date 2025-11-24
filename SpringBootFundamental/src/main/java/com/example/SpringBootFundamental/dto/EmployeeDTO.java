package com.example.SpringBootFundamental.dto;

import com.example.SpringBootFundamental.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDTO {

    int id;
    String name;
    String surname;
    int age;

    @Autowired
Employee employee;



    public EmployeeDTO EmployeeMapper(Employee employee) {
        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setId(employee.getId());
        employeeDTO.setName(employee.getName());
        employeeDTO.setSurname(employee.getSurname());
        employeeDTO.setAge(employee.getAge());

        return employeeDTO;
    }
}
