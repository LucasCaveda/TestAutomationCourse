package solvd.lecture3;

import solvd.lecture3.interfaces.IPerson;

public abstract class Person implements IPerson {
    private String firstName;
    private String lastName;
    private char gender;
    private int age;

    public Person(String firstName, String lastName, char gender, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.age = age;
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
}
