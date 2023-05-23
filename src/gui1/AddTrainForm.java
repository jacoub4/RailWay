
package gui1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class AddTrainForm extends javax.swing.JFrame {
        Service service;
        Engine engine;
        Train train;
    public AddTrainForm() {
        initComponents();
        service=new Service();
        engine=new Engine();
        train=new Train();
    }
    
    public Service getServiceDetails(){
    service.setWifi(WifiCheck.isSelected());
        service.setScreens(ScreenCheck.isSelected());
        service.setDrink(String.valueOf(DrinkComboBox.getSelectedItem()));
        service.setMeal(String.valueOf(MealComboBox.getSelectedItem()));
        return service;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MealComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        DrinkComboBox = new javax.swing.JComboBox<>();
        WifiCheck = new javax.swing.JCheckBox();
        ScreenCheck = new javax.swing.JCheckBox();
        ApplyBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        SpeedTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        EngineComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        MealComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Meat", "Fish", "Chicken" }));
        MealComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MealComboBoxMouseClicked(evt);
            }
        });
        MealComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MealComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Meal:");

        jLabel3.setText("Drink:");

        DrinkComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lemon", "Orange", "Pepsi", " " }));
        DrinkComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrinkComboBoxActionPerformed(evt);
            }
        });

        WifiCheck.setText("Wifi");
        WifiCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WifiCheckActionPerformed(evt);
            }
        });

        ScreenCheck.setText("TvScreens");
        ScreenCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScreenCheckActionPerformed(evt);
            }
        });

        ApplyBtn.setText("Apply");
        ApplyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplyBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Train Speed: ");

        jLabel4.setText("Choose Train Service");

        EngineComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "electric", "hydraulic ", "mechanical" }));

        jLabel5.setText("Engine");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ApplyBtn)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MealComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(EngineComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DrinkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(WifiCheck)
                            .addComponent(ScreenCheck)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SpeedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel4)))
                .addContainerGap(215, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(SpeedTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addGap(17, 17, 17)
                .addComponent(WifiCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ScreenCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MealComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DrinkComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EngineComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(ApplyBtn)
                .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MealComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MealComboBoxActionPerformed
      
    }//GEN-LAST:event_MealComboBoxActionPerformed

    private void DrinkComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrinkComboBoxActionPerformed

    }//GEN-LAST:event_DrinkComboBoxActionPerformed

    private void WifiCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WifiCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WifiCheckActionPerformed

    private void ScreenCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScreenCheckActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ScreenCheckActionPerformed

    private void ApplyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplyBtnActionPerformed
        //put servide attributes 
        train.setService(getServiceDetails());
        //put Engine Details
        engine.setType(String.valueOf(EngineComboBox.getSelectedItem()));
        engine.setID(Gui1.TrainsList.size()+1);
        //
        train.setEngine(engine);
        //setting the Type of the train
        if(WifiCheck.isSelected()&&ScreenCheck.isSelected()){
            train.setTrainType("High Class");
        }
        else if(WifiCheck.isSelected()^ScreenCheck.isSelected()){
            train.setTrainType("Medium");
        }
        else{
            train.setTrainType("Normal");
        }
        //set train number
        train.setTrainNum(Gui1.TrainsList.size()+1);
        //set train speed
        train.setSpeed(Double.parseDouble(SpeedTextField.getText()));
        System.out.println(train);                                              //delete later
        //add the train to the ArrayList
        Gui1.TrainsList.add(train);
        System.out.println(Gui1.TrainsList);                                    //  delete later
        //serializing the Data

        Gui1.SaveTrainsToDataBase();
        this.setVisible(false);
        Gui1.getJrounForm().PrepareTrainsComboBox();
        Gui1.getJrounForm().setVisible(true);
        
        
        
    }//GEN-LAST:event_ApplyBtnActionPerformed

    private void MealComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MealComboBoxMouseClicked
      
    }//GEN-LAST:event_MealComboBoxMouseClicked

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
            java.util.logging.Logger.getLogger(AddTrainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTrainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTrainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTrainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTrainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ApplyBtn;
    private javax.swing.JComboBox<String> DrinkComboBox;
    private javax.swing.JComboBox<String> EngineComboBox;
    private javax.swing.JComboBox<String> MealComboBox;
    private javax.swing.JCheckBox ScreenCheck;
    private javax.swing.JTextField SpeedTextField;
    private javax.swing.JCheckBox WifiCheck;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
