package com.example.api_calls.dto;


import com.example.api_calls.validation.MyCustomValidation;

public class UserDto {

    @MyCustomValidation(message = "Name must contain only letters")// add the validation
    private String name;

    // Other fields, getters, and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
