package com.solvd.lecture5.exceptions;

public class InvalidWorkingStatus extends Exception {
    @Override
    public String getMessage() {
        return "The employee is not working.";
    }
}
