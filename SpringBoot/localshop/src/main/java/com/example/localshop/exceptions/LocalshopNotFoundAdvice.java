package com.example.localshop.exceptions;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class LocalshopNotFoundAdvice {

    @ExceptionHandler(LocalshopNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String, Object> productNotFoundHandler(
            LocalshopNotFoundException ex) {

        Map<String, Object> error = new LinkedHashMap<>();

        error.put("errorMessage", ex.getMessage());
        error.put("status", 404);

        return error;
    }
}