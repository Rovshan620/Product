package com.example.SpringBootFundamental.Repository;

import com.example.SpringBootFundamental.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    public Employee getEmployeeById(int id) {

        return new Employee();
    }
}
