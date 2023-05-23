
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
    Train(){}
    Train(int num,String type,double speed,Service S1,Engine g){}

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
