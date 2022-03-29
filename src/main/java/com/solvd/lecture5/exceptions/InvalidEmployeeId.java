package com.solvd.lecture5.exceptions;

public class InvalidEmployeeId extends RuntimeException{
    @Override
    public String getMessage() {
        return "Wrong employee ID - Input a valid ID";
    }
}
