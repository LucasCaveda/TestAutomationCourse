package solvd.lecture3.interfaces;

import solvd.lecture3.Client;
import solvd.lecture3.Computer;

public interface IComputerRepair {
    void repair(Computer computer, Client client);
    void diagnosis(Computer computer);
}
