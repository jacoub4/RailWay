
package gui1;

import java.util.Date;

public class Golden_client extends Client{
    private Date BirthDate;
    private String favStation;

    public Golden_client() {
    }

    public Golden_client(Date BirthDate, String favStation, String name, int age, int ID, String adress, boolean p, int Ntravels, double distance,String password) {
        super(name, age, ID, adress, p, Ntravels, distance,password);
        this.BirthDate = BirthDate;
        this.favStation = favStation;
    }

    public Date getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(Date BirthDate) {
        this.BirthDate = BirthDate;
    }

    public String getFavStation() {
        return favStation;
    }

    public void setFavStation(String favStation) {
        this.favStation = favStation;
    }

   
    
    

    @Override
    public String toString() { // need some changes !!
        super.toString();
        return "Golden_client{" + "BirthDate=" + BirthDate + ", favStation=" + favStation + '}';
    }
    
    
    
    
    
}
