package com.boxacademy.userservice.controller;

import com.boxacademy.userservice.dto.AuthenticationRequest;
import com.boxacademy.userservice.dto.AuthenticationResponse;
import com.boxacademy.userservice.dto.RegisterRequest;
import com.boxacademy.userservice.service.AuthenticationService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/register")
    public ResponseEntity<String> register(
            @RequestBody RegisterRequest request
    ) {
        String registrationMessage = authenticationService.register(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(registrationMessage);
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody AuthenticationRequest request
    ) {
        return ResponseEntity.ok(authenticationService.authenticate(request));
    }

    @PostMapping("/refresh-token")
    public void refresh(
           HttpServletRequest request,
           HttpServletResponse response
    ) throws IOException {
        authenticationService.refreshToken(request,response);
    }
}
