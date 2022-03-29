package com.solvd.lecture5.exceptions;

public class InvalidWord extends Exception{
    @Override
    public String getMessage() {
        return "The word cannot have numbers.";
    }
}
