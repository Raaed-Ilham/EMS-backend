package com.raaed.employee.management.controller;

import com.raaed.employee.management.dto.AuthRequest;
import com.raaed.employee.management.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:3000")

//authentication controller to handle requests for login

public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public String login(@RequestBody AuthRequest authRequest) {
        return authService.authenticate(authRequest);
    }
}
