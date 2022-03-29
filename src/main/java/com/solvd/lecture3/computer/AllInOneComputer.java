package com.solvd.lecture3.computer;


import com.solvd.lecture3.peripheral.Peripheral;
import com.solvd.lecture3.more.ComputerComponent;

public class AllInOneComputer extends Computer{
    private ComputerComponent screen;
    private Peripheral[] peripherals;

    public AllInOneComputer(ComputerComponent CPU, ComputerComponent GPU, ComputerComponent memory, ComputerComponent storage, String brand, ComputerComponent screen, Peripheral[] peripherals) {
        super(CPU, GPU, memory, storage, brand);
        this.screen = screen;
        this.peripherals = peripherals;
    }

    public ComputerComponent getScreen() {
        return screen;
    }

    public void setScreen(ComputerComponent screen) {
        this.screen = screen;
    }

    public Peripheral[] getPeripherals() {
        return peripherals;
    }

    public void setPeripherals(Peripheral[] peripherals) {
        this.peripherals = peripherals;
    }
}
