package com.solvd.lecture3.person;

import com.solvd.lecture3.interfaces.IEmployee;
import com.solvd.lecture5.exceptions.InvalidEmployeeId;

public class Employee extends Person implements IEmployee {
    private int employeeId;
    private int salary;
    private boolean working;

    public Employee(String firstName, String lastName,String dni, char gender, int age, int employeeId, boolean working, int salary) {
        super(firstName, lastName, dni, gender, age);
        if(employeeId>0){
            this.employeeId = employeeId;
        }else throw new InvalidEmployeeId();
        this.salary = salary;
        this.working = working;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    @Override
    public void working(){
        if (working){
            System.out.println(getFirstName()+" is working.");
        }
    }

}
