package com.solvd.lecture3.person;

import com.solvd.lecture3.interfaces.IPerson;
import com.solvd.lecture5.exceptions.InvalidDni;
import com.solvd.lecture5.exceptions.InvalidWord;

import static com.solvd.lecture5.validationFunctions.Validations.*;

public abstract class Person implements IPerson {
    private String firstName;
    private String lastName;
    private String dni;
    private char gender;
    private int age;

    public Person(String firstName, String lastName, String dni, char gender, int age) {
        try {
            if(checkWord(firstName)){
                this.firstName = firstName;
            }
        } catch (InvalidWord e) {
            e.getMessage();
        }
        try {
            if(checkWord(lastName)){
                this.lastName = lastName;
            }
        } catch (InvalidWord e) {
            e.getMessage();
        }
        this.gender = gender;
        if (checkAge(age)){
            this.age = age;
        }
        try {
            if (checkDni(dni)){
                this.dni = dni;
            }
        } catch (InvalidDni e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sayHello(String firstName){
        System.out.println("Hello, my name is "+firstName+".");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {return gender;}

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
