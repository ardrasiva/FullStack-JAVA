package com.example.registration;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class GmailValidator implements ConstraintValidator<Gmail, String> {

    @Override
    public boolean isValid(String email, ConstraintValidatorContext cvc) {
        if(email == null)
        {
            return false;
        }
        return email.contains("@gmail.com");
    }
}