package solvd.lecture3;

public class Client extends Person{
    Computer computer;

    public Client(String firstName, String lastName, char gender, int age, Computer computer) {
        super(firstName, lastName, gender, age);
        this.computer = computer;
    }



    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }
}
