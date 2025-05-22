package com.example.meli_back.exception;

/**
 * class created to handle a not found exception
 */
public class ResourceNotFoundException extends RuntimeException {

    /**
     * constructor of the class
     * @param message message that will send in the exception
     */
    public ResourceNotFoundException(String message) {
        super(message);
    }

}