package com.example.registration;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class AddressValidator implements ConstraintValidator<Address, String> {

    @Override
    public boolean isValid(String s, ConstraintValidatorContext cvc) {
        if (s == null) {
        return false;
    }

    s = s.toLowerCase();
    return s.contains("india");
    }
}