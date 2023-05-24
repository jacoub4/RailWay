
package gui1;

import java.io.Serializable;


public class Train implements Serializable{
    private int TrainNum;
    private static final long serialVersionUID = 2L;
    private String TrainType;
    private double speed;
    Service service;
    Engine engine;
    private boolean NeedOil;
    private boolean NeedMaintenance;
    private int Seats;
    Train(){}

    public Train(int TrainNum, String TrainType, double speed, Service service, Engine engine, boolean NeedOil, boolean NeedMaintenance, int Seats) {
        this.TrainNum = TrainNum;
        this.TrainType = TrainType;
        this.speed = speed;
        this.service = service;
        this.engine = engine;
        this.NeedOil = NeedOil;
        this.NeedMaintenance = NeedMaintenance;
        this.Seats = Seats;
    }

    public int getSeats() {
        return Seats;
    }

    public void setSeats(int Seats) {
        this.Seats = Seats;
    }
    

    public int getTrainNum() {
        return TrainNum;
    }

    public void setTrainNum(int TrainNum) {
        this.TrainNum = TrainNum;
    }

    public String getTrainType() {
        return TrainType;
    }

    public void setTrainType(String TrainType) {
        this.TrainType = TrainType;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Service getService() {
        return service;
    }
    public void setService(Service service){
        this.service=service;
    }

    public boolean getNeedOil() {
        return NeedOil;
    }

    public void setNeedOil(boolean p) {
        this.NeedOil = p;
    }

    public boolean getNeedMaintenance() {
        return NeedMaintenance;
    }

    public void setNeedMaintenance(boolean p) {
        this.NeedMaintenance = p;
    }

    
   

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine g) {
        this.engine = g;
    }
    public void performJourney(Journey j1){
        
    engine.setDist_traveled(engine.getDist_traveled()+j1.getKm_Covered());
    }

    @Override
    public String toString() {                                                  //need tweekings 
        
        
        
        return "Train Info:\n" + "Train Number: " + TrainNum + "\n Type: " + TrainType + "\nspeed: " + speed + "\nService: " + service + "\nEngine: " + engine + '}';
    }
    
    
}
