
package gui1;


public class Train {
    private int TrainNum;
    private String TrainType;
    private double speed;
    Service S1;
    Engine engine;
    
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

    public Service getS1() {
        return S1;
    }

   

    public Engine getG() {
        return engine;
    }

    public void setG(Engine g) {
        this.engine = g;
    }
    public void performJourney(Journey j1){
        
    engine.setDist_traveled(engine.getDist_traveled()+j1.getKm_Covered());
    }

    @Override
    public String toString() {                                                  //need tweekings 
        
        
        
        return "Train{" + "TrainNum=" + TrainNum + ", TrainType=" + TrainType + ", speed=" + speed + ", S1=" + S1 + ", g=" + engine + '}';
    }
    
    
}
