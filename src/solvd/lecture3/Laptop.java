package solvd.lecture3;


public class Laptop extends Computer{
    private ComputerComponent screen;
    private ComputerComponent keyboard;
    private Peripheral[] peripherals;

    public Laptop(ComputerComponent CPU, ComputerComponent GPU, ComputerComponent memory, ComputerComponent storage, String brand, ComputerComponent screen, ComputerComponent keyboard, Peripheral[] peripherals) {
        super(CPU, GPU, memory, storage, brand);
        this.screen = screen;
        this.keyboard = keyboard;
        this.peripherals = peripherals;
    }

    public ComputerComponent getScreen() {
        return screen;
    }

    public void setScreen(ComputerComponent screen) {
        this.screen = screen;
    }

    public ComputerComponent getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(ComputerComponent keyboard) {
        this.keyboard = keyboard;
    }

    public Peripheral[] getPeripherals() {
        return peripherals;
    }

    public void setPeripherals(Peripheral[] peripherals) {
        this.peripherals = peripherals;
    }
}
