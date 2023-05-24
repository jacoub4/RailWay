
package gui1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.util.GregorianCalendar;
import java.util.Vector;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;;


public class JourneysTableForm_Client extends javax.swing.JFrame {
    Journey journey;
    Ticket ticket;
    Train train;
    Client CurrentClient;
    Golden_client golden;                                   //will be used if he became golden client
  private DefaultTableModel tm; 
    public JourneysTableForm_Client() {
        initComponents();
        initTableData();
        
        
    }
    
    public void setCurrentClient(Client c){
        CurrentClient=c;
    }
    public void initTableData(){
        Vector CI=new Vector();
        CI.add("Date");
        CI.add("Start Time");
        CI.add("From/To");
        CI.add("Train Number");
        CI.add("Distance");
        CI.add("Duration");
        CI.add("Price");
        tm=(DefaultTableModel)JourneyTable.getModel();
        journey=new Journey();
        ticket=new Ticket();
        train=new Train();
    
 try{
        FileInputStream fs=new FileInputStream("JourneyTable");
        ObjectInputStream os=new ObjectInputStream(fs);
        tm.setDataVector((Vector)os.readObject(), CI);
        fs.close();
        os.close();
        
        }          
 catch(ClassNotFoundException |IOException e){
     System.out.println("Error in JourneyTable for clients");
}   
 
 
    }
    
    public Journey getJourneyDetails(){
        int SelectedRow=JourneyTable.getSelectedRow();
        String From_To[]= String.valueOf(tm.getValueAt(SelectedRow,2)).split("/");
        //Need to assign
        journey.setStartTime(Double.parseDouble(String.valueOf(tm.getValueAt(SelectedRow,1))));
        journey.setStartStation(From_To[0]);
        journey.setDistination(From_To[1]);
        journey.setKm_Covered(Double.parseDouble(String.valueOf(tm.getValueAt(SelectedRow, 4)).replace("Km","")));
        journey.setDuration(Double.parseDouble(String.valueOf(tm.getValueAt(SelectedRow, 5)).replace("H","")));
        return journey;
    }
    
    public Ticket getTicketDetials(){
        ticket.setID(CurrentClient.getID()+100);
        ticket.setPrice(Double.parseDouble(tm.getValueAt(JourneyTable.getSelectedRow(),6).toString().replace("$","")));
        if(CurrentClient.isPensioner()){
           ticket.setDiscount(0.2);
        }
        else if (CurrentClient.getAge()>70){
            ticket.setDiscount(0.5);
        }
        else{
        ticket.setDiscount(0);
        }
        ticket.setFinalPrice(ticket.getPrice()*ticket.getDiscount());
    return ticket;
    }
    
    public void getTrainDetails(){
        for(Train t:Gui1.TrainsList){
            if(t.getTrainNum()==Integer.parseInt(tm.getValueAt(JourneyTable.getSelectedRow(), 3).toString())){
                train=t;
            break;}
                
        }
    }
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JourneyTable = new javax.swing.JTable();
        BookingBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JourneyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Start Time", "From/To", "Train Number", "Distance", "Duration", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JourneyTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JourneyTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JourneyTable);

        BookingBtn.setText("Book Journey");
        BookingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BookingBtn)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BookingBtn)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JourneyTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JourneyTableMouseClicked
       

    }//GEN-LAST:event_JourneyTableMouseClicked

    private void BookingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingBtnActionPerformed
        //check if he just selected one journey
        if(JourneyTable.getSelectedRowCount()==0){
            JOptionPane.showMessageDialog(this,"Please select a Journey to book");
        }
        else if(JourneyTable.getSelectedRowCount()>1){
            JOptionPane.showMessageDialog(this, "Please select Just one Journey");
        }
        //if just one journey is selected
        else{
            //get the value of Distance from the table 
            double Distance=Double.parseDouble(tm.getValueAt(JourneyTable.getSelectedRow(),4).toString().replace("Km", ""));
            System.out.println(getJourneyDetails().toString());
           //renewing data of clien
            CurrentClient.setNtravels(CurrentClient.getNtravels()+1);
            CurrentClient.setTraveledDistance(CurrentClient.getTraveledDistance()+Distance);
            //assign details of ticket and train
            getTicketDetials();
            getTrainDetails();
            //show Ticket with details Screen
            Gui1.SaveClientsToDataBase();
            Gui1.SaveTrainsToDataBase();
            JOptionPane.showMessageDialog(this,"Ticket Info :\nDate: "+String.valueOf(tm.getValueAt(JourneyTable.getSelectedRow(),0))+"\n"+ticket.toString()+"\n"+train.getService().toString());
            //Check if he is now a golden client or not
            
            if((CurrentClient.getNtravels()>50|| CurrentClient.getTraveledDistance()>10000)&&CurrentClient.isGolden()==false){
                golden=new Golden_client(CurrentClient,"","");
                Gui1.golden_clientsList.add(golden);
                Gui1.ClientsList.remove(CurrentClient);
                Gui1.SaveClientsToDataBase();
                this.setVisible(false);
                Gui1.setGoldenClientInfo();
                Gui1.getGoldenClientInfo().setCurrentClient(golden);
                Gui1.getGoldenClientInfo().setVisible(true);
            }
            else{
            System.out.println(Gui1.ClientsList);
                System.out.println("I should see you");
           train.setSeats(train.getSeats()+1);
                System.out.println("Seats Number now is :"+train.getSeats());
            if(train.getSeats()==3){
                train.setSeats(0);
                for(Train train1:Gui1.TrainsList){
                    if(train1.getTrainNum()==train.getTrainNum()){
                    train1.engine.setDist_traveled(train1.engine.getDist_traveled()+Distance);
                    if(train1.engine.getDist_traveled()>20000){
                        train1.setNeedOil(true);
                    }
                    if(train1.engine.getDist_traveled()>100000){
                        train1.setNeedMaintenance(true);
                    }
                    Gui1.SaveTrainsToDataBase();
                    
                    break;
                    }
                }
                
            }
            Gui1.SaveTrainsToDataBase();
            
        }
//            this.setVisible(false);                                             // check if you will need them or not
//            Gui1.getStartup().setVisible(true);
        }
        
    }//GEN-LAST:event_BookingBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JourneysTableForm_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JourneysTableForm_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JourneysTableForm_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JourneysTableForm_Client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JourneysTableForm_Client().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BookingBtn;
    private javax.swing.JTable JourneyTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
