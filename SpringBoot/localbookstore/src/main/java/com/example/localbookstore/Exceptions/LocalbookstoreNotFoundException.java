package com.example.localbookstore.Exceptions;

public class LocalbookstoreNotFoundException extends RuntimeException{
    public LocalbookstoreNotFoundException(Integer id){
        super("Could not find the book with the id "+id);
    }
    
}
