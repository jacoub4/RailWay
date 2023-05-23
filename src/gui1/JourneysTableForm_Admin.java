
package gui1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;


public class JourneysTableForm_Admin extends javax.swing.JFrame {
 private DefaultTableModel tm;
      double Duration;    
      Train T;  //Dummy Train
    public JourneysTableForm_Admin() {
        initComponents();
        initTableData();
        PrepareTrainsComboBox();
        
    }
    private void initTableData()
    {
        Vector CI=new Vector();
        CI.add("Date");
        CI.add("Start Time");
        CI.add("From/To");
        CI.add("Train Number");
        CI.add("Distance");
        CI.add("Duration");
        CI.add("Price");
        tm=(DefaultTableModel)JTable.getModel();
        try{
        FileInputStream fs=new FileInputStream("JourneyTable");
        ObjectInputStream os=new ObjectInputStream(fs);
        tm.setDataVector((Vector)os.readObject(), CI);
        fs.close();
        os.close();
        }
        catch(Exception e){
        e.printStackTrace();}
        
    }
    public Train getSelectedTrain(){
        
        for(Train train:Gui1.TrainsList){
            if(train.getTrainNum()==Integer.parseInt(TrainComboBox.getSelectedItem().toString().replace("T",""))){
                return train;
                
            }}
        return T;
    }
    public void PrepareTrainsComboBox(){
        TrainComboBox.removeAllItems();
        for(Train train:Gui1.TrainsList){
            if(train.getNeedMaintenance()){
                JOptionPane.showMessageDialog(this,"Train"+train.engine.getID()+"Need maintenance and need to change oil");
            }
            if(train.getNeedOil()){
                JOptionPane.showMessageDialog(this,"Train"+train.engine.getID()+"Need to change Oil");
            }
        TrainComboBox.addItem("T"+train.getTrainNum());
        }
    }
   public String[] GetAllData(){
       Train T=getSelectedTrain();
       Duration=Double.parseDouble(String.format("%.2f",Double.parseDouble(DistanceTextField.getText())/T.getSpeed()));
       //Method to get all the data from the TextFields
        String Data[]={DateTextField.getText(),StartTimeTextField.getText(),FromTextField.getText()+"/"+ToTextField.getText(),String.valueOf(TrainComboBox.getSelectedItem()).replace("T",""),DistanceTextField.getText()+"Km",Duration+"H",PriceTextField.getText()+"$"}; 
        return Data;
   }
   
   public void EmptyTextFields(){                               //Method to empty all textFields
        DateTextField.setText("");
            StartTimeTextField.setText("");
            FromTextField.setText("");
            ToTextField.setText("");
            PriceTextField.setText("");
            DistanceTextField.setText("");
   }
    
    public void AddJourney()
           
    {
       tm.addRow(GetAllData());
       saveJourneyTable();
    }
    
    public void saveJourneyTable(){                                     //Method to save The journeyTable to the data base
        try{
        FileOutputStream fs=new FileOutputStream("JourneyTable");
        ObjectOutputStream os=new ObjectOutputStream(fs);
        os.writeObject(tm.getDataVector());
        fs.close();
        os.close();}
        catch(IOException e ){
            System.out.println("Failed to save data");
        }
                                                                     
       
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTable = new javax.swing.JTable();
        AddJourneyBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        DateTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        StartTimeTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FromTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ToTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PriceTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        AddTrainBtn = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        DistanceTextField = new javax.swing.JTextField();
        TrainComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        JTable.setModel(new javax.swing.table.DefaultTableModel(
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
        JTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTable);

        AddJourneyBtn.setText("Add Journey");
        AddJourneyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddJourneyBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setText("Delete Journey");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        UpdateBtn.setText("Update Details");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Date:");

        DateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("From");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Start Time");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("To");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Price");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Train");

        AddTrainBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AddTrainBtn.setText("Add Train");
        AddTrainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddTrainBtnActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Distance");

        DistanceTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DistanceTextFieldActionPerformed(evt);
            }
        });

        TrainComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TrainComboBoxItemStateChanged(evt);
            }
        });
        TrainComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TrainComboBoxFocusGained(evt);
            }
        });
        TrainComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TrainComboBoxMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TrainComboBoxMousePressed(evt);
            }
        });
        TrainComboBox.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                TrainComboBoxComponentShown(evt);
            }
        });
        TrainComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrainComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(FromTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(ToTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(136, 136, 136))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(PriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TrainComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(AddJourneyBtn)
                                    .addGap(18, 18, 18)
                                    .addComponent(DeleteBtn)
                                    .addGap(18, 18, 18)
                                    .addComponent(UpdateBtn)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(jLabel1)
                                    .addGap(18, 18, 18)
                                    .addComponent(DateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(StartTimeTextField)))
                            .addGap(117, 117, 117)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(AddTrainBtn)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DistanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(StartTimeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FromTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(ToTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TrainComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DistanceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(PriceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddJourneyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(AddTrainBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddJourneyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddJourneyBtnActionPerformed
           //Check if there is any empty text field to show warning message
        if(DateTextField.getText().equals("")||StartTimeTextField.getText().equals("")||FromTextField.getText().equals("")||ToTextField.getText().equals("")||PriceTextField.getText().equals("")||DistanceTextField.getText().equals("")){
           
           JOptionPane.showMessageDialog(this, "Please Enter all the data");
           
           }
        else{
        //Adding Journey to the table
           AddJourney();
            JOptionPane.showMessageDialog(this, "Succesfully added a Journey");     //show message 
            //clearing TextFields
           EmptyTextFields();
        
        }
            
        
        
    }//GEN-LAST:event_AddJourneyBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        //check if just one row is selected if yes then delete the selected row
       if(JTable.getSelectedRowCount()==1){
           int response=JOptionPane.showConfirmDialog(this, "Do you want to Delete the journey!!", "", JOptionPane.YES_NO_OPTION);
           if(response==JOptionPane.YES_OPTION){
       tm.removeRow(JTable.getSelectedRow());
       saveJourneyTable();
           EmptyTextFields();
           }
       }
       //if admin didn't choose any row to be deleted
       else{
           if(JTable.getSelectedRowCount()==0){
         JOptionPane.showMessageDialog(this, "Please Select a row to delete"); 
       }
        //if admin selected more than one row
       else{
           JOptionPane.showMessageDialog(this, "please select just one row");
       }}
       
       
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
      if(JTable.getSelectedRowCount()==1){
          String Data[]=GetAllData();
          for(int i=0;i<7;i++){
              tm.setValueAt(Data[i], JTable.getSelectedRow(), i);
          }
          saveJourneyTable();
      JOptionPane.showMessageDialog(this, "successfully Updated");
      EmptyTextFields();
      }
      else{
      JOptionPane.showMessageDialog(this, "please select a row to update");
      
      }
      
      
      
      
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void DateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DateTextFieldActionPerformed

    private void JTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableMouseClicked
       String From_To[]= String.valueOf(tm.getValueAt(JTable.getSelectedRow(),2)).split("/");
        DateTextField.setText(String.valueOf(tm.getValueAt(JTable.getSelectedRow(),0)));
        StartTimeTextField.setText(String.valueOf(tm.getValueAt(JTable.getSelectedRow(),1)));
        FromTextField.setText(From_To[0]);
        ToTextField.setText(From_To[1]);
        TrainComboBox.setSelectedItem("T"+String.valueOf(tm.getValueAt(JTable.getSelectedRow(),3)));
        DistanceTextField.setText(String.valueOf(tm.getValueAt(JTable.getSelectedRow(),4)).replace("Km",""));
        PriceTextField.setText(String.valueOf(tm.getValueAt(JTable.getSelectedRow(),6)).replace("$",""));
        
    }//GEN-LAST:event_JTableMouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
    }//GEN-LAST:event_formKeyPressed

    private void AddTrainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddTrainBtnActionPerformed
        this.setVisible(false);
        Gui1.setNewTrainForm();
        Gui1.getTrainForm().setVisible(true);
       
    }//GEN-LAST:event_AddTrainBtnActionPerformed

    private void DistanceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DistanceTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DistanceTextFieldActionPerformed

    private void TrainComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrainComboBoxActionPerformed

    }//GEN-LAST:event_TrainComboBoxActionPerformed

    private void TrainComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrainComboBoxMouseClicked
               Train train= getSelectedTrain();
                JOptionPane.showMessageDialog(this, train.toString());
        
    }//GEN-LAST:event_TrainComboBoxMouseClicked

    private void TrainComboBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TrainComboBoxMousePressed
  
    }//GEN-LAST:event_TrainComboBoxMousePressed

    private void TrainComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TrainComboBoxItemStateChanged
        
    }//GEN-LAST:event_TrainComboBoxItemStateChanged

    private void TrainComboBoxComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TrainComboBoxComponentShown
        
    }//GEN-LAST:event_TrainComboBoxComponentShown

    private void TrainComboBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TrainComboBoxFocusGained
        
    }//GEN-LAST:event_TrainComboBoxFocusGained

   
    
    
    
    
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
            java.util.logging.Logger.getLogger(JourneysTableForm_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JourneysTableForm_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JourneysTableForm_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JourneysTableForm_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JourneysTableForm_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddJourneyBtn;
    private javax.swing.JButton AddTrainBtn;
    private javax.swing.JTextField DateTextField;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField DistanceTextField;
    private javax.swing.JTextField FromTextField;
    private javax.swing.JTable JTable;
    private javax.swing.JTextField PriceTextField;
    private javax.swing.JTextField StartTimeTextField;
    private javax.swing.JTextField ToTextField;
    private javax.swing.JComboBox<String> TrainComboBox;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
