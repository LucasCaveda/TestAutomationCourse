package solvd.lecture3;

public class InputPeripheral extends Peripheral{
    private String name;
    private Boolean switchedOn;

    public InputPeripheral(String connection, String name, Boolean switchedOn) {
        super(connection);
        this.name = name;
        this.switchedOn = switchedOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getSwitchedOn() {
        return switchedOn;
    }

    public void setSwitchedOn(Boolean switchedOn) {
        this.switchedOn = switchedOn;
    }
}
