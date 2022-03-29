package com.solvd.lecture3.person;

import com.solvd.lecture3.interfaces.IManager;

public class ManagerEmployee extends Employee implements IManager {
    private Boolean supervising;

    public ManagerEmployee(String firstName, String lastName,String dni, char gender, int age, int employeeId, boolean working, int salary, Boolean supervising) {
        super(firstName, lastName, dni, gender, age, employeeId, working, salary);
        this.supervising = supervising;
    }

    public Boolean getSupervising() {
        return supervising;
    }

    public void setSupervising(Boolean supervising) {
        this.supervising = supervising;
    }

    @Override
    public void collectRepair(){
        System.out.println("Thank you for trusting us, here's your change.");
    }

}

