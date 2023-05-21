
package gui1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class Gui1 {
    private static StartupForm S1;
    private static AddClientForm N1;
    private static JourneysTableForm j1;
    private static CurrentClientForm c1;
public  static ArrayList<Client>ClientsList=new ArrayList<>();
public static ArrayList<Journey>journeysList=new ArrayList<>();
   
public static void setNewClientForm(){
   N1= new AddClientForm();
}
public static StartupForm getStartup(){
    return S1;
}
public static AddClientForm getAddingClient(){
    return N1;
}                                                                                                   //think about adding current client object here!! (it's a static variable to know which client data we need right now ...might get used in journeytable and also in ading new client)
public static JourneysTableForm getJrounForm(){
    return j1;
}
public static CurrentClientForm getCurrent_ClientForm(){
    return c1;
}
public static void setCurrent_ClinetForm(){
c1=new CurrentClientForm();
}
public static void setJournForm(){
j1=new JourneysTableForm();
}
 
    public static void main(String[] args) {
      
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartupForm().setVisible(true);
                S1=new StartupForm();
                
                try(FileInputStream fs1= new FileInputStream("Clients.ser");
                    ObjectInputStream os1=new ObjectInputStream(fs1))
                    {
                    ClientsList =(ArrayList<Client>)os1.readObject();
                    fs1.close();
                    os1.close();
                    System.out.println(ClientsList);}
                   
                
                catch(IOException | ClassNotFoundException e){
                    e.printStackTrace();
                }
            }
        });

    }
    
}
