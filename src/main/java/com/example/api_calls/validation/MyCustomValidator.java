package com.example.api_calls.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;

@Component
public class MyCustomValidator implements ConstraintValidator<MyCustomValidation, String> {
    @Override
    public void initialize(MyCustomValidation constraintAnnotation) {

    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        // Custom validation logic
        System.out.println("value received to validate:"+value);
        if (value == null) {
            return false; // or true if nulls are valid
        }
        return value.matches("[a-zA-Z]+"); // Example: only allow letters
    }
}
