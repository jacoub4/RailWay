
package gui1;

import java.io.Serializable;


public class Engine implements Serializable{
    private int ID;
    private String type;
    private double dist_traveled;
    
    Engine(){}
    Engine(int ID,String type,double dist_traveled){
    this.ID=ID;
    this.type=type;
    this.dist_traveled=dist_traveled;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDist_traveled() {
        return dist_traveled;
    }

    public void setDist_traveled(double dist_traveled) {
        this.dist_traveled = dist_traveled;
    }

    @Override
    public String toString() {
        return  "ID:" + ID + "\nType: " + type + "\nTraveled Distance: " + dist_traveled ;
    }
    
}
