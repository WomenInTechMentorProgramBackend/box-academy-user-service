package com.boxacademy.userservice;

import com.boxacademy.userservice.dto.RegisterRequest;
import com.boxacademy.userservice.service.AuthenticationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.boxacademy.userservice.entity.Role.ADMIN;
import static com.boxacademy.userservice.entity.Role.USER;

@SpringBootApplication
public class UserServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(
            AuthenticationService authenticationService
    ) {
        return args -> {
            var admin = RegisterRequest.builder()
                    .firstName("Admin")
                    .lastName("Admin")
                    .email("admin@mail.com")
                    .password("password")
                    .role(ADMIN)
                    .build();
            System.out.println(authenticationService.register(admin));

            var user = RegisterRequest.builder()
                    .firstName("User")
                    .lastName("User")
                    .email("user@mail.com")
                    .password("password2")
                    .role(USER)
                    .build();
            System.out.println(authenticationService.register(user));
        };
    }
}
