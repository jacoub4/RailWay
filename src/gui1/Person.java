/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui1;

/**
 *
 * @author assas
 */
public abstract class Person {
    
    private String name;
    private int age;
    private String adress;
    private boolean pensioner;

    public abstract String getName();

    public abstract void setName(String name);
    
    public abstract void setNtravels(int Ntravels);
    
    public abstract int getAge();

    public abstract void setAge(int age);

    public abstract String getAdress();
  

    public abstract void setAdress(String adress);

    public abstract boolean isPensioner();

    public abstract void setPensioner(boolean pensioner);
    
     
    
    
}
