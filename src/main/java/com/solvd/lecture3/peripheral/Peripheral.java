package com.solvd.lecture3.peripheral;

public abstract class Peripheral {
    private String connection;

    public Peripheral(String connection) {
        this.connection = connection;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }
}

