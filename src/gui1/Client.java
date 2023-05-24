
package gui1;

import java.io.Serializable;


public class Client implements Serializable{
    private static final long serialVersionUID = 1L;
private String password;
private int ID;
private int age;
private String name;
private boolean pensioner;
private String adress;
private int  Ntravels=0;
private double TraveledDistance=0;

Client(){

}

public Client(String name,int age,int ID,String adress,boolean p,int Ntravels,double distance,String password){
this. name=name;
this.age=age;
this.ID=ID;
this.adress=adress;
pensioner=p;
this.Ntravels=Ntravels;
TraveledDistance=distance;
this.password=password;

}
public boolean isGolden(){
    return false;
}


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPensioner() {
        return pensioner;
    }

    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNtravels() {
        return Ntravels;
    }

    public void setNtravels(int Ntravels) {
        this.Ntravels = Ntravels;
    }

    public double getTraveledDistance() {
        return TraveledDistance;
    }

    public void setTraveledDistance(double TraveledDistance) {
        this.TraveledDistance = TraveledDistance;
    }
public void TakeTrain(Train tr1){                                                   // not Done yet !!
//tr1.performJourney();
}
public void buyTicket(Ticket ticket){                                                   // not done yet!! (don't forget to change String to Ticket after making the class)

}
    
    
    
    @Override
    public String toString() {
        return "Client{" + "ID=" + ID + ", age=" + age +", name=" + name + ", Password: "+password+ ", pensioner=" + pensioner + ", adress=" + adress + ", Ntravels=" + Ntravels + ", TraveledDistance=" + TraveledDistance + '}';
    }}
