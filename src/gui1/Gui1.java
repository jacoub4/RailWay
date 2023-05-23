
package gui1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class Gui1 {
    public static int seats;
    private static StartupForm S1;
    private static AddClientForm N1;
    private static JourneysTableForm_Admin JA;
    private static JourneysTableForm_Client JC; 
    private static CurrentClientForm c1;
    private static AddTrainForm T1;
    private static GoldenClientInfo GI;
    private static AdminLogin AL;
public  static ArrayList<Client>ClientsList=new ArrayList<>();
public static ArrayList<Journey>journeysList=new ArrayList<>();
public static ArrayList<Train>TrainsList=new ArrayList<>();
   

public static void SaveClientsToDataBase(){
      try (FileOutputStream fs = new FileOutputStream("Clients.ser");
             ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(Gui1.ClientsList);
            os.close();
            fs.close();
        } catch (IOException e) {
             System.out.println("Error44");                 
        }
}

public static void SaveTrainsToDataBase(){
    try (FileOutputStream fs = new FileOutputStream("Trains.ser");
             ObjectOutputStream os = new ObjectOutputStream(fs)){
            os.writeObject(Gui1.TrainsList);
            os.close();
            fs.close();
        } catch (IOException e) {
                        System.out.println("Failed to save data of the train");     
        }
}

public static void setAdminLoginForm(){
    AL=new AdminLogin();
}
public static AdminLogin getAdminLoginForm(){
    return AL;
}
public static void setGoldenClientInfo(){
    GI=new GoldenClientInfo();
}
public static GoldenClientInfo getGoldenClientInfo(){
    return GI;
}
public static void setNewClientForm(){
   N1= new AddClientForm();
}
public static StartupForm getStartup(){
    return S1;
}
public static AddClientForm getAddingClient(){
    return N1;
}                                                                                                   //think about adding current client object here!! (it's a static variable to know which client data we need right now ...might get used in journeytable and also in ading new client)
public static JourneysTableForm_Admin getJrounForm(){
    return JA;
}
public static void setJournForm(){
JA=new JourneysTableForm_Admin();
}

public static void setClientJounrForm(){
    JC=new JourneysTableForm_Client();
}
public static JourneysTableForm_Client getClientJournForm(){
    return JC;
}


public static CurrentClientForm getCurrent_ClientForm(){
    return c1;
}
public static void setCurrent_ClinetForm(){
c1=new CurrentClientForm();
}


    public static AddTrainForm getTrainForm() {
        return T1;
    }

    public static void setNewTrainForm() {
        Gui1.T1 = new AddTrainForm();
    }

 
    public static void main(String[] args) {
      
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                S1=new StartupForm();
                S1.setVisible(true);
                
                try(FileInputStream fs1= new FileInputStream("Clients.ser");
                    ObjectInputStream os1=new ObjectInputStream(fs1)){
                    ClientsList =(ArrayList<Client>)os1.readObject();
                    fs1.close();
                    os1.close();
                    System.out.println(ClientsList);
                }
                catch(IOException | ClassNotFoundException e){
                    e.printStackTrace();
                }
                
                try(FileInputStream fs=new FileInputStream("Trains.ser");
                        ObjectInputStream os =new ObjectInputStream(fs)){
                    TrainsList=(ArrayList<Train>)os.readObject();
                    fs.close();
                    os.close();
                    System.out.println(TrainsList);
                }
                catch(ClassNotFoundException | IOException e){
                    e.printStackTrace();
                }
                
            }
        });

    }
    
}
