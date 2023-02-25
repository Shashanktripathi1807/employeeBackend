package com.project.employeeManager.Services;

import com.project.employeeManager.EmployeeException.UserNotFoundException;
import com.project.employeeManager.Model.Employee;
import com.project.employeeManager.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServices {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee addEmployee(Employee employee)
    {
       employee.setEmpCode(UUID.randomUUID().toString());
       return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees()
    {
        return employeeRepository.findAll();
    }

    public Employee getEmployeebyId(long id) {
        return employeeRepository.findEmployeeById(id).orElseThrow(
         () -> new UserNotFoundException("Employee Not Found!!")
        );
    }

    public Employee updateEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }
    @Transactional
    public void deleteEmployeebyId(long id)
    {
        employeeRepository.deleteEmployeeById(id);
    }
}
