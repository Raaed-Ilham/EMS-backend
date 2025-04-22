package com.raaed.employee.management;

import com.raaed.employee.management.model.Employee;
import com.raaed.employee.management.repository.EmployeeRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class DataInitializer {

    private final EmployeeRepository employeeRepository;

    public DataInitializer(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @PostConstruct
    public void initData() {
        if (employeeRepository.count() == 0) {
            List<Employee> employees = List.of(
                    new Employee(
                            "Admin User",
                            "admin@example.com",
                            "test pass", // hashed password
                            "ADMIN",
                            "IT",
                            "Manager",
                            "Mon-Fri",
                            "Morning",
                            "EMS System",
                            LocalDate.now(),
                            true,
                            "Review and approve weekly reports"
                    ),
                    new Employee(
                            "Admin User",
                            "admin@example.com",
                            "admin2025",
                            "ADMIN",
                            "IT",
                            "Manager",
                            "Mon-Fri",
                            "Morning",
                            "EMS System",
                            LocalDate.now(),
                            true,
                            "Review and approve weekly reports"
                    )
            );

            employeeRepository.saveAll(employees);
            System.out.println("Sample employee data initialized.");
        } else {
            System.out.println("Employee data already exists. Skipping initialization.");
        }
    }
}
