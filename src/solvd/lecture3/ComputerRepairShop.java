package solvd.lecture3;

public class ComputerRepairShop extends Shop{
    private ManagerEmployee manager;
    private RepairEmployee[] repairEmployees;
    private int workSpaces;

    public ComputerRepairShop(String name, String address, ManagerEmployee manager, RepairEmployee[] repairEmployees, int workSpaces) {
        super(name, address);
        this.manager = manager;
        this.repairEmployees = repairEmployees;
        this.workSpaces = workSpaces;
    }

    public ManagerEmployee getManager() {
        return manager;
    }

    public void setManager(ManagerEmployee manager) {
        this.manager = manager;
    }

    public RepairEmployee[] getRepairEmployees() {
        return repairEmployees;
    }

    public void setRepairEmployees(RepairEmployee[] repairEmployees) {
        this.repairEmployees = repairEmployees;
    }

    public int getWorkSpaces() {
        return workSpaces;
    }

    public void setWorkSpaces(int workSpaces) {
        this.workSpaces = workSpaces;
    }
}
