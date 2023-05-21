
package gui1;

import java.util.ArrayList;
import java.util.GregorianCalendar;


public class Journey {
   private  GregorianCalendar date;
    private double StartTime;
    private double Duration;
    private double Km_Covered;
    private ArrayList<String> Stations;
    
    
    Journey(){}
    Journey(GregorianCalendar date,double stime,double duration,double Km_Covered){
    this.date=date; 
    this.StartTime=stime;
    this.Duration=duration;
    this.Km_Covered=Km_Covered;
    
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public double getStartTime() {
        return StartTime;
    }

    public void setStartTime(double StartTime) {
        this.StartTime = StartTime;
    }

    public double getDuration() {
        return Duration;
    }

    public void setDuration(double Duration) {
        this.Duration = Duration;
    }

    public double getKm_Covered() {
        return Km_Covered;
    }

    public void setKm_Covered(double Km_Covered) {
        this.Km_Covered = Km_Covered;
    }

    public ArrayList<String> getStations() {
        return Stations;
    }

    public void setStations(ArrayList<String> Stations) {
        this.Stations = Stations;
    }

    @Override
    public String toString() {
        return "Journey{" + "date=" + date + "\nStartTime=" + StartTime + "\n Duration=" + Duration + "\n Km_Covered=" + Km_Covered + '}';
    }
    
    
}
