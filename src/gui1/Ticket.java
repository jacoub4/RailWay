/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui1;

import java.util.GregorianCalendar;


public class Ticket {
    private double Discount;
    private int ID;
    private GregorianCalendar date;
    private double price;
    private double finalPrice;

    public Ticket() {
    }

    public Ticket(double Discount, int ID,GregorianCalendar date) {
        this.Discount = Discount;
        this.ID = ID;
        this.date=date;
        
    }

    public double getDiscount() {
        return Discount;
    }

    public void setDiscount(double Discount) {
        this.Discount = Discount;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public GregorianCalendar getDate() {
        return date;
    }

    public void setDate(GregorianCalendar date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }
    
    public void reserveTicket(Journey J1,Train T1){                    /// note Done yet
        setDate(J1.getDate());
    
    
    
    }
    
    
    
    
    
}
