package solvd.lecture3;


public class DesktopComputer extends Computer{
    Peripheral[] peripherals;

    public DesktopComputer(ComputerComponent CPU, ComputerComponent GPU, ComputerComponent memory, ComputerComponent storage, String brand, Peripheral[] peripherals) {
        super(CPU, GPU, memory, storage, brand);
        this.peripherals = peripherals;
    }

    public Peripheral[] getPeripherals() {
        return peripherals;
    }

    public void setPeripherals(Peripheral[] peripherals) {
        this.peripherals = peripherals;
    }
}
