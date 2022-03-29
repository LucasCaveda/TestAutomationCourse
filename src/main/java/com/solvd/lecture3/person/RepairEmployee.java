package com.solvd.lecture3.person;

import com.solvd.lecture3.computer.AllInOneComputer;
import com.solvd.lecture3.computer.Computer;
import com.solvd.lecture3.computer.DesktopComputer;
import com.solvd.lecture3.computer.Laptop;
import com.solvd.lecture3.runner.Runner;
import com.solvd.lecture3.more.Tool;
import com.solvd.lecture3.interfaces.ICleanComputer;
import com.solvd.lecture3.interfaces.IComputerRepair;
import com.solvd.lecture5.exceptions.InvalidWorkingStatus;

import java.util.logging.Level;
import java.util.logging.Logger;



public class RepairEmployee extends Employee implements IComputerRepair, ICleanComputer {
    private int taskQueue;
    private Tool[] tools;
    private Boolean repairing;

    private static final Logger LOGGER1 = Logger.getLogger(Runner.class.getName());

    public RepairEmployee(String firstName, String lastName,String dni, char gender, int age, int employeeId, boolean working, int salary, int taskQueue, Tool[] tools, Boolean repairing) {
        super(firstName, lastName, dni, gender, age, employeeId, working, salary);
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
    public void repair(Computer computer, Client client) throws InvalidWorkingStatus{
            System.out.println("The client "+ client.getFirstName() +" delivered a/an "+ computer.getBrand() +" brand computer");
            diagnosis(computer);
            if(this.isWorking()){
                System.out.println("The "+ client.getFirstName()+"'s computer is being repaired by "+ this.getFirstName());
            }else{
                throw new InvalidWorkingStatus();
            }
    }



    @Override
    public void diagnosis(Computer computer) {
        int repairCost = 0;
        if (computer instanceof DesktopComputer) {
            LOGGER1.log(Level.INFO, "Computer diagnosis:");
            if (computer.getCPU().isStatus() && computer.getGPU().isStatus() && computer.getMemory().isStatus() && computer.getStorage().isStatus()) {
                LOGGER1.log(Level.INFO, "       CPU status: working");
                LOGGER1.log(Level.INFO, "       GPU status: working");
                LOGGER1.log(Level.INFO, "       memory status: working");
                LOGGER1.log(Level.INFO, "       storage status: working");
                LOGGER1.log(Level.INFO, "\nAll components of the computer work properly, the computer is not broken.");
            } else if (!computer.getCPU().isStatus()) {
                LOGGER1.log(Level.INFO, "       CPU status: broken");
                repairCost = repairCost + 1000;
            }
            if (!computer.getGPU().isStatus()) {
                LOGGER1.log(Level.INFO, "       GPU status: broken");
                repairCost = repairCost + 1200;
            }
            if (!computer.getMemory().isStatus()) {
                LOGGER1.log(Level.INFO, "       memory status: broken");
                repairCost = repairCost + 500;
            }
            if (!computer.getStorage().isStatus()) {
                LOGGER1.log(Level.INFO, "       storage status: broken");
                repairCost = repairCost + 250;
            }
        } else if (computer instanceof Laptop) {
            LOGGER1.log(Level.INFO, "Computer diagnosis:");
            if (computer.getCPU().isStatus() && computer.getGPU().isStatus() && computer.getMemory().isStatus() && computer.getStorage().isStatus() && ((Laptop) computer).getScreen().isStatus() && ((Laptop) computer).getKeyboard().isStatus()) {
                LOGGER1.log(Level.INFO, "       CPU status: working");
                LOGGER1.log(Level.INFO, "       GPU status: working");
                LOGGER1.log(Level.INFO, "       memory status: working");
                LOGGER1.log(Level.INFO, "       storage status: working");
                LOGGER1.log(Level.INFO, "       screen status: working");
                LOGGER1.log(Level.INFO, "       keyboard status: working");
                LOGGER1.log(Level.INFO, "\nAll components of the computer work properly, the computer is not broken.");
            } else if (!computer.getCPU().isStatus()) {
                LOGGER1.log(Level.INFO, "       CPU status: broken");
                repairCost = repairCost + 1000;
            }
            if (!computer.getGPU().isStatus()) {
                LOGGER1.log(Level.INFO, "       GPU status: broken");
                repairCost = repairCost + 1200;
            }
            if (!computer.getMemory().isStatus()) {
                LOGGER1.log(Level.INFO, "       memory status: broken");
                repairCost = repairCost + 500;
            }
            if (!computer.getStorage().isStatus()) {
                LOGGER1.log(Level.INFO, "       storage status: broken");
                repairCost = repairCost + 250;
            }
            if (!((Laptop) computer).getScreen().isStatus()) {
                LOGGER1.log(Level.INFO, "       screen status: broken");
                repairCost = repairCost + 500;
            }
            if (!((Laptop) computer).getKeyboard().isStatus()) {
                LOGGER1.log(Level.INFO, "       keyboard status: broken");
                repairCost = repairCost + 350;
            }
        } else if (computer instanceof AllInOneComputer) {
            System.out.println("\nComputer diagnosis:\n");
            if (computer.getCPU().isStatus() && computer.getGPU().isStatus() && computer.getMemory().isStatus() && computer.getStorage().isStatus() && ((AllInOneComputer) computer).getScreen().isStatus()) {
                LOGGER1.log(Level.INFO, "       CPU status: working");
                LOGGER1.log(Level.INFO, "       GPU status: working");
                LOGGER1.log(Level.INFO, "       memory status: working");
                LOGGER1.log(Level.INFO, "       storage status: working");
                LOGGER1.log(Level.INFO, "       screen status: working");
                LOGGER1.log(Level.INFO, "\nAll components of the computer work properly, the computer is not broken.");
            } else if (!computer.getCPU().isStatus()) {
                LOGGER1.log(Level.INFO, "       CPU status: broken");
                repairCost = repairCost + 1000;
            }
            if (!computer.getGPU().isStatus()) {
                LOGGER1.log(Level.INFO, "       GPU status: broken");
                repairCost = repairCost + 1200;
            }
            if (!computer.getMemory().isStatus()) {
                LOGGER1.log(Level.INFO, "       memory status: broken");
                repairCost = repairCost + 500;
            }
            if (!computer.getStorage().isStatus()) {
                LOGGER1.log(Level.INFO, "       storage status: broken");
                repairCost = repairCost + 250;
            }
            if (!((AllInOneComputer) computer).getScreen().isStatus()) {
                LOGGER1.log(Level.INFO, "       screen status: broken");
                repairCost = repairCost + 500;
            }
        }
        LOGGER1.log(Level.INFO, "\nThe repair cost will be $" + repairCost + "\n");
    }

    @Override
    public void cleanComputer() {
        LOGGER1.log(Level.INFO, this.getFirstName() + "has cleaned the computer.");
    }
}
