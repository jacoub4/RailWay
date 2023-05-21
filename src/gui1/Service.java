
package gui1;

import java.util.ArrayList;


public class Service {
    private boolean wifi;
    private ArrayList<String> Meals=new ArrayList<>();
     private  ArrayList<String> Drinks=new ArrayList<>();
     private boolean screens;
     
     public Service(){}
     public Service(boolean wifi,ArrayList Meals,ArrayList Drinks, boolean Screens){
     this.wifi=wifi;
     this.Meals=Meals;
     this.Drinks=Drinks;
     this.screens=Screens;
     }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public ArrayList<String> getMeals() {
        return Meals;
    }

    public void setMeals(ArrayList<String> Meals) {
        this.Meals = Meals;
    }

    public ArrayList<String> getDrinks() {
        return Drinks;
    }

    public void setDrinks(ArrayList<String> Drinks) {
        this.Drinks = Drinks;
    }

    public boolean isScreens() {
        return screens;
    }

    public void setScreens(boolean screens) {
        this.screens = screens;
    }

    @Override
    public String toString() {                                                      //might need changes 
        return "Service{" + "wifi=" + wifi + "\n Meals=" + Meals + "\nDrinks=" + Drinks + "\n screens=" + screens + '}';
    }
    
     
     
     
}
