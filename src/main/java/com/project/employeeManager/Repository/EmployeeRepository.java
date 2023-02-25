package com.project.employeeManager.Repository;

import com.project.employeeManager.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    Optional<Employee> findEmployeeById(long id);

    void deleteEmployeeById(long id);
}
