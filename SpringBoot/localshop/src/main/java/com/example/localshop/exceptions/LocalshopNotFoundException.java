package com.example.localshop.exceptions;

public class LocalshopNotFoundException extends RuntimeException {

    public LocalshopNotFoundException(Integer id) {
        super("Could not find the product with id " + id);
    }
}