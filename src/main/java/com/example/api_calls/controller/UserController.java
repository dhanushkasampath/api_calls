package com.example.api_calls.controller;

import com.example.api_calls.dto.UserDto;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Validated
public class UserController {

    @PostMapping("/users")
    public ResponseEntity<String> createUser(@Valid @RequestBody UserDto user) {
        return new ResponseEntity<>("User is valid", HttpStatus.OK);
    }
}

/**

valid payload
{
    "name": "dhanushka"
}


invalid payload
{
    "name": "dhanushka123"
}


 **/