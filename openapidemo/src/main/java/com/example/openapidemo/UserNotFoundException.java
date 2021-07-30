package com.example.openapidemo;

public class UserNotFoundException extends RuntimeException {
    UserNotFoundException(String email) {
        super("Could not find employee " + email);
    }
}
