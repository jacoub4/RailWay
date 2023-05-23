
package gui1;

import java.util.ArrayList;
import java.util.GregorianCalendar;


public class Journey {
    private String StartStation;
    private String Distination;
   private  GregorianCalendar date;
    private double StartTime;
    private double Duration;
    private double Km_Covered;
    Journey(){}

    public Journey(String StartStation, String Distination, GregorianCalendar date, double StartTime, double Duration, double Km_Covered) {
        this.StartStation = StartStation;
        this.Distination = Distination;
        this.date = date;
        this.StartTime = StartTime;
        this.Duration = Duration;
        this.Km_Covered = Km_Covered;
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

    public void setStartStation(String StartStation) {
        this.StartStation = StartStation;
    }

    public String getStartStation() {
        return StartStation;
    }
    

    public void setDistination(String Distination) {
        this.Distination = Distination;
    }
    public String getDistination() {
        return Distination;
    }
    

    

    @Override
    public String toString() {
        return "Journey{" + "StartStation=" + StartStation + ", Distination=" + Distination + ", date=" + date + ", StartTime=" + StartTime + ", Duration=" + Duration + ", Km_Covered=" + Km_Covered + '}';
    }
    
    
    
}
