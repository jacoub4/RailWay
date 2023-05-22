
package gui1;

import java.io.Serializable;

public class Service implements Serializable {
    private boolean wifi;
    private String Meal;
     private  String Drink;
     private boolean screens;
     
     public Service(){}
     public Service(boolean wifi,String Meal,String Drink, boolean Screens){
     this.wifi=wifi;
     this.Meal=Meal;
     this.Drink=Drink;
     this.screens=Screens;
     }

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public String getMeal() {
        return Meal;
    }

    public void setMeal(String Meal) {
        this.Meal = Meal;
    }

    public String getDrink() {
        return Drink;
    }

    public void setDrink(String Drink) {
        this.Drink = Drink;
    }

    

    public boolean isScreens() {
        return screens;
    }

    public void setScreens(boolean screens) {
        this.screens = screens;
    }

    @Override
    public String toString() {                                                      //might need changes 
        return "Service{" + "wifi=" + wifi + "\n Meal=" + Meal + "\nDrinks=" + Drink + "\n screens=" + screens + '}';
    }
    
     
     
     
}
