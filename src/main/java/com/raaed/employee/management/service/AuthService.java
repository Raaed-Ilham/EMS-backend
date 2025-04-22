package com.raaed.employee.management.service;

import com.raaed.employee.management.dto.AuthRequest;
import com.raaed.employee.management.model.Employee;
import com.raaed.employee.management.repository.EmployeeRepository;
import com.raaed.employee.management.security.JWTUtil;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private JWTUtil jwtUtil;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public String authenticate(AuthRequest authRequest) {
        Employee employee = employeeRepository.findByEmail(authRequest.getEmail())
                .orElseThrow(() -> new RuntimeException("employee not found"));

        if (!passwordEncoder.matches(authRequest.getPassword(), employee.getPassword())) {
            throw new RuntimeException("Invalid employee password");
        }



        return jwtUtil.generateToken(employee.getEmail(), employee.getRole());
    }
}
