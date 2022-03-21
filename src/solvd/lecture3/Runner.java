package solvd.lecture3;

public class Runner {

    public static void main(String[] args) {
        DesktopComputer desktopComputer = createDesktopComputer();
        Client client1 = new Client("Carlos","Perez",'M',31,desktopComputer);
        RepairEmployee employee1 = new RepairEmployee("Gerardo","Ramirez",'M',25,032,true,1500,1,null,true);
        ManagerEmployee manager = new ManagerEmployee("Florencia", "Salvador", 'F', 34, 002, true, 3000, true);
        RepairEmployee[] employees= new RepairEmployee[10];
        employees[1]= employee1;
        ComputerRepairShop computerRepairShop = new ComputerRepairShop("Computer service","Estrada 1455", manager,employees,4);


        repairMycomputer(desktopComputer,computerRepairShop,client1,employee1);

    }

    private static void repairMycomputer(Computer computer, Shop shop, Client client, Employee employee) {
        System.out.println("The client "+ client.getFirstName() +" delivered a/an "+ computer.getBrand() +" brand computer");
        computerDiagnosis(computer);
        if(employee.working==true){
            System.out.println("The "+ client.getFirstName()+"'s computer is being repaired by "+ employee.getFirstName());
        }
    }

    private static void computerDiagnosis(Computer computer){
        int repairCost=0;
        System.out.println("\nComputer diagnosis:\n");
        if (computer.getCPU().isStatus()==true && computer.getGPU().isStatus()==true && computer.getMemory().isStatus()==true && computer.getStorage().isStatus()==true) {
            System.out.println("    CPU status: working");
            System.out.println("    GPU status: working");
            System.out.println("    memory status: working");
            System.out.println("    storage status: working");
            System.out.println("\nAll components of the computer work properly, the computer is not broken.");
        }else if (computer.getCPU().isStatus()==false){
            System.out.println("    CPU status: broken");
            repairCost=repairCost+1000;
        }if (computer.getGPU().isStatus()==false){
            System.out.println("    GPU status: broken");
            repairCost=repairCost+1200;
        }if (computer.getMemory().isStatus()==false){
            System.out.println("    memory status: broken");
            repairCost=repairCost+500;
        }if (computer.getStorage().isStatus()==false){
            System.out.println("    storage status: broken");
            repairCost=repairCost+250;
        }
        System.out.println("\nThe repair cost will be $"+ repairCost+"\n");
    }

    private static DesktopComputer createDesktopComputer(){
        ComputerComponent CPU = new ComputerComponent(false,"Ryzen 7");
        ComputerComponent GPU = new ComputerComponent(true, "RX5500XT");
        ComputerComponent memory = new ComputerComponent(false,"16gb Teamgroup");
        ComputerComponent storage = new ComputerComponent(true, "1tb Seagate");

        DesktopComputer desktopComputer = new DesktopComputer(CPU,GPU,memory,storage,null,null);

        return desktopComputer;
    }


}
