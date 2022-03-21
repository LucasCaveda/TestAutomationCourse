package solvd.lecture3;

public class Employee extends Person{
    int employeeId;
    int salary;
    boolean working;

    public Employee(String firstName, String lastName, char gender, int age, int employeeId, boolean working, int salary) {
        super(firstName, lastName, gender, age);
        this.employeeId = employeeId;
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
}
