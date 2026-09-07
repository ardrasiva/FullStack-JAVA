package com.example.localbookstore.Exceptions;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice 
public class LocalbookstoreNotFoundAdvice {

    @ExceptionHandler(LocalbookstoreNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String,String> bookstoreNotFoundHandler(LocalbookstoreNotFoundException lex){
        Map<String,String> error = new LinkedHashMap<>();
        error.put("errormessage", lex.getMessage());
        error.put("status", "404");
        return error;
    }
    
}
