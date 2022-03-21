package solvd.lecture3;

public class ManagerEmployee extends Employee {
    Boolean supervising;

    public ManagerEmployee(String firstName, String lastName, char gender, int age, int employeeId, boolean working, int salary, Boolean supervising) {
        super(firstName, lastName, gender, age, employeeId, working, salary);
        this.supervising = supervising;
    }

    public Boolean getSupervising() {
        return supervising;
    }

    public void setSupervising(Boolean supervising) {
        this.supervising = supervising;
    }
}

