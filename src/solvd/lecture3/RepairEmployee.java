package solvd.lecture3;

public class RepairEmployee extends Employee{
    int taskQueue;
    Tool[] tools;
    Boolean repairing;

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
}
