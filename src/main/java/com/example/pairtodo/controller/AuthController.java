package com.example.pairtodo.controller;

import com.example.pairtodo.model.User;
import com.example.pairtodo.payload.RegisterRequest;
import com.example.pairtodo.payload.RegisterResponse;
import com.example.pairtodo.service.UserService;
import com.example.pairtodo.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    
    @Autowired
    private UserService userService;
    
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody RegisterRequest registerRequest) {
        User user = userService.createUser(registerRequest);
        String token = jwtTokenUtil.generateToken(user);
        
        RegisterResponse response = new RegisterResponse(
            user.getId(),
            user.getAccountId(),
            user.getUsername(),
            user.getPhone(),
            token
        );
        
        return ResponseEntity.ok(response);
    }
}
