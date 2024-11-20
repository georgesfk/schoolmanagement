package com.example.schoolmanagement.exception;

public class UserNotFoundException extends RuntimeException {

    // Constructeur prenant un message
    public UserNotFoundException(String message) {
        super(message);  // Appel du constructeur parent (RuntimeException)
    }
}

