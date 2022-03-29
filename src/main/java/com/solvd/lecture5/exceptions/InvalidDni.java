package com.solvd.lecture5.exceptions;

public class InvalidDni extends Exception{
    @Override
    public String getMessage() {
        return "Wrong DNI. It must have 7 or 8 numbers";
    }
}
