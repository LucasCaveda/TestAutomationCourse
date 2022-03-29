package com.solvd.lecture3.interfaces;

import com.solvd.lecture3.person.Client;
import com.solvd.lecture3.computer.Computer;
import com.solvd.lecture5.exceptions.InvalidWorkingStatus;

import java.util.logging.Logger;

public interface IComputerRepair {
    void repair(Computer computer, Client client) throws InvalidWorkingStatus;
    void diagnosis(Computer computer);
}
