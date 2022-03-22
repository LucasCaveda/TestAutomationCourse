package solvd.lecture3;

public class Runner {

    public static void main(String[] args) {
        DesktopComputer desktopComputer = createDesktopComputer();
        Laptop laptop = createLaptop();
        Client client1 = new Client("Carlos","Perez",'M',31,desktopComputer);
        RepairEmployee employee1 = new RepairEmployee("Gerardo","Ramirez",'M',25,032,true,1500,1,null,true);
        ManagerEmployee manager = new ManagerEmployee("Florencia", "Salvador", 'F', 34, 002, true, 3000, true);
        RepairEmployee[] employees= new RepairEmployee[10];
        employees[1]= employee1;
        ComputerRepairShop computerRepairShop = new ComputerRepairShop("Computer service","Estrada 1455", manager,employees,4);


        employee1.repair(laptop,client1);

    }

    private static DesktopComputer createDesktopComputer(){
        ComputerComponent CPU = new ComputerComponent(false,"Ryzen 7");
        ComputerComponent GPU = new ComputerComponent(true, "RX5500XT");
        ComputerComponent memory = new ComputerComponent(false,"16gb Teamgroup");
        ComputerComponent storage = new ComputerComponent(true, "1tb Seagate");

        DesktopComputer desktopComputer = new DesktopComputer(CPU,GPU,memory,storage,null,null);

        return desktopComputer;
    }

    private static Laptop createLaptop(){
        ComputerComponent CPU = new ComputerComponent(true,"Core I7");
        ComputerComponent GPU = new ComputerComponent(true, "Intel Graphics");
        ComputerComponent memory = new ComputerComponent(true, "16 gb acer");
        ComputerComponent storage = new ComputerComponent(false, "500gb");
        ComputerComponent screen = new ComputerComponent(false, "Oled");
        ComputerComponent keyboard = new ComputerComponent(true, "tkl");

        Laptop laptop = new Laptop(CPU,GPU,memory,storage,"Acer",screen,keyboard,null);

        return laptop;
    }

}
