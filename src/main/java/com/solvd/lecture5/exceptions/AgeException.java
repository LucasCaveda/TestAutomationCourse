package com.solvd.lecture5.exceptions;

public class AgeException extends RuntimeException{
    @Override
    public String getMessage() {
        return "Age must be greater greater than 0";
    }
}
