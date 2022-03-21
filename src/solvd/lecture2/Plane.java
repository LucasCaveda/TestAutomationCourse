package solvd.lecture2;

public class Plane {

    private String model;
    private final String engine;
    private final String pilot;
    private int loadingCapacity;
    private int Seats;
    private float weight;
    private float altitude;
    private float speed;

    public Plane(String model, String pilot, String engine){

        this.model=model;
        this.pilot=pilot;
        this.engine=engine;

    }

    public String getModel(){
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine(){
        return engine;
    }

    public String getPilot(){
        return pilot;
    }
}
