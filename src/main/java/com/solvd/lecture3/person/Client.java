package com.solvd.lecture3.person;

import com.solvd.lecture3.computer.Computer;

public class Client extends Person{
    private Computer computer;

    public Client(String firstName, String lastName,String dni,char gender, int age, Computer computer) {
        super(firstName, lastName, dni, gender, age);
        this.computer = computer;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
