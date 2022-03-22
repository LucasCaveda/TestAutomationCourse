package solvd.lecture3;

import solvd.lecture3.interfaces.ICleanComputer;
import solvd.lecture3.interfaces.IComputerRepair;

public class RepairEmployee extends Employee implements IComputerRepair, ICleanComputer {
    private int taskQueue;
    private Tool[] tools;
    private Boolean repairing;

    public RepairEmployee(String firstName, String lastName, char gender, int age, int employeeId, boolean working, int salary, int taskQueue, Tool[] tools, Boolean repairing) {
        super(firstName, lastName, gender, age, employeeId, working, salary);
        this.taskQueue = taskQueue;
        this.tools = tools;
        this.repairing = repairing;
    }

    public int getTaskQueue() {
        return taskQueue;
    }

    public void setTaskQueue(int taskQueue) {
        this.taskQueue = taskQueue;
    }

    public Tool[] getTools() {
        return tools;
    }

    public void setTools(Tool[] tools) {
        this.tools = tools;
    }

    public Boolean getRepairing() {
        return repairing;
    }

    public void setRepairing(Boolean repairing) {
        this.repairing = repairing;
    }

    @Override
    public void repair(Computer computer, Client client) {
            System.out.println("The client "+ client.getFirstName() +" delivered a/an "+ computer.getBrand() +" brand computer");
            diagnosis(computer);
            if(this.isWorking()){
                System.out.println("The "+ client.getFirstName()+"'s computer is being repaired by "+ this.getFirstName());
            }
    }



    @Override
    public void diagnosis(Computer computer) {
        int repairCost = 0;
        if (computer instanceof DesktopComputer) {
            System.out.println("\nComputer diagnosis:\n");
            if (computer.getCPU().isStatus() && computer.getGPU().isStatus() && computer.getMemory().isStatus() && computer.getStorage().isStatus()) {
                System.out.println("    CPU status: working");
                System.out.println("    GPU status: working");
                System.out.println("    memory status: working");
                System.out.println("    storage status: working");
                System.out.println("\nAll components of the computer work properly, the computer is not broken.");
            } else if (!computer.getCPU().isStatus()) {
                System.out.println("    CPU status: broken");
                repairCost = repairCost + 1000;
            }
            if (!computer.getGPU().isStatus()) {
                System.out.println("    GPU status: broken");
                repairCost = repairCost + 1200;
            }
            if (!computer.getMemory().isStatus()) {
                System.out.println("    memory status: broken");
                repairCost = repairCost + 500;
            }
            if (!computer.getStorage().isStatus()) {
                System.out.println("    storage status: broken");
                repairCost = repairCost + 250;
            }
        } else if (computer instanceof Laptop) {
            System.out.println("\nComputer diagnosis:\n");
            if (computer.getCPU().isStatus() && computer.getGPU().isStatus() && computer.getMemory().isStatus() && computer.getStorage().isStatus() && ((Laptop) computer).getScreen().isStatus() && ((Laptop) computer).getKeyboard().isStatus()) {
                System.out.println("    CPU status: working");
                System.out.println("    GPU status: working");
                System.out.println("    memory status: working");
                System.out.println("    storage status: working");
                System.out.println("    screen status: working");
                System.out.println("    screen keyboard: working");
                System.out.println("\nAll components of the computer work properly, the computer is not broken.");
            } else if (!computer.getCPU().isStatus()) {
                System.out.println("    CPU status: broken");
                repairCost = repairCost + 1000;
            }
            if (!computer.getGPU().isStatus()) {
                System.out.println("    GPU status: broken");
                repairCost = repairCost + 1200;
            }
            if (!computer.getMemory().isStatus()) {
                System.out.println("    memory status: broken");
                repairCost = repairCost + 500;
            }
            if (!computer.getStorage().isStatus()) {
                System.out.println("    storage status: broken");
                repairCost = repairCost + 250;
            }
            if (!((Laptop) computer).getScreen().isStatus()) {
                System.out.println("    screen status: broken");
                repairCost = repairCost + 500;
            }
            if (!((Laptop) computer).getKeyboard().isStatus()) {
                System.out.println("    keyboard status: broken");
                repairCost = repairCost + 350;
            }
        } else if (computer instanceof AllInOneComputer) {
            System.out.println("\nComputer diagnosis:\n");
            if (computer.getCPU().isStatus() && computer.getGPU().isStatus() && computer.getMemory().isStatus() && computer.getStorage().isStatus() && ((AllInOneComputer) computer).getScreen().isStatus()) {
                System.out.println("    CPU status: working");
                System.out.println("    GPU status: working");
                System.out.println("    memory status: working");
                System.out.println("    storage status: working");
                System.out.println("    screen status: working");
                System.out.println("\nAll components of the computer work properly, the computer is not broken.");
            } else if (!computer.getCPU().isStatus()) {
                System.out.println("    CPU status: broken");
                repairCost = repairCost + 1000;
            }
            if (!computer.getGPU().isStatus()) {
                System.out.println("    GPU status: broken");
                repairCost = repairCost + 1200;
            }
            if (!computer.getMemory().isStatus()) {
                System.out.println("    memory status: broken");
                repairCost = repairCost + 500;
            }
            if (!computer.getStorage().isStatus()) {
                System.out.println("    storage status: broken");
                repairCost = repairCost + 250;
            }
            if (!((AllInOneComputer) computer).getScreen().isStatus()) {
                System.out.println("    screen status: broken");
                repairCost = repairCost + 500;
            }
        }
        System.out.println("\nThe repair cost will be $" + repairCost + "\n");
    }

    @Override
    public void cleanComputer() {
        System.out.println(this.getFirstName() + "has cleaned the computer.");
    }
}
