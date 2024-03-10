package com.boxacademy.userservice.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@PreAuthorize("hasAnyRole('ADMIN', 'USER')")
@Tag(name = "User")
public class UserController {

    @Operation(
            description = "Get endpoint for the user",
            summary = "This is a summary for user get endpoint",
            responses = {
                    @ApiResponse(
                            description = "Success",
                            responseCode = "200"
                    ),
                    @ApiResponse(
                            description = "Unauthorized / Invalid Token",
                            responseCode = "403"
                    )
            }
    )
    @GetMapping
    public String get() {
        return "GET:: user controller";
    }

    @PostMapping
    public String post() {
        return "post:: user controller";
    }

    @PutMapping
    public String Put() {
        return "Put:: user controller";
    }

    @DeleteMapping
    public String Delete() {
        return "Delete:: user controller";
    }
}
