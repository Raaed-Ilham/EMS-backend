package com.raaed.employee.management.repository;

import com.raaed.employee.management.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//marks as repository to alert spring it will be handling data storage logic
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //unused filter function to sort by department
    //useful to show how custom SQL queries can be written for whatever i want
    @Query(
            value = "SELECT * FROM employees WHERE department = :department",
            nativeQuery = true
    )
    List<Employee> findByDepartmentNative(@Param("department") String department);

    Optional<Employee> findByEmail(String email);

}
