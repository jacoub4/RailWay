
package gui1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class AddClientForm extends javax.swing.JFrame {
    Client Current_Client;
    
    public AddClientForm() {
        initComponents();
        Error_Label.setVisible(false);
         Gui1.ClientsList.add(new Client());
         Current_Client = Gui1.ClientsList.get(Gui1.ClientsList.size()-1);
    }
    public void setName(){
        
        Current_Client.setName(NameInput.getText());
    }
    public boolean setAge(){
        try{
        
        Current_Client.setAge(Integer.parseInt(AgeInput.getText()));
        if(Current_Client.getAge()>=65)
            Current_Client.setPensioner(true);
       
        return true;
        }
        catch(NumberFormatException e){                                             //add catch code Don't forget!!
            Error_Label.setVisible(true);
            return false;
    }
    }
    public void setAdress(){
        Current_Client.setAdress(AdressInput.getText());
    
    }
    public void setPassword(){
    Current_Client.setPassword((String.valueOf(PasswordInput.getPassword())));
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        adressLabel = new javax.swing.JLabel();
        NameInput = new javax.swing.JTextField();
        AgeInput = new javax.swing.JTextField();
        AdressInput = new javax.swing.JTextField();
        Applybtn = new javax.swing.JButton();
        Error_Label = new javax.swing.JLabel();
        adressLabel1 = new javax.swing.JLabel();
        PasswordInput = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("Please input your data ");

        nameLabel.setFont(new java.awt.Font("sansserif", 0, 17)); // NOI18N
        nameLabel.setText("Name:");

        ageLabel.setFont(new java.awt.Font("sansserif", 0, 17)); // NOI18N
        ageLabel.setText("Age:");

        adressLabel.setFont(new java.awt.Font("sansserif", 0, 17)); // NOI18N
        adressLabel.setText("Adress:");

        NameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameInputActionPerformed(evt);
            }
        });

        Applybtn.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        Applybtn.setText("Apply");
        Applybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApplybtnActionPerformed(evt);
            }
        });

        Error_Label.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Error_Label.setForeground(new java.awt.Color(255, 51, 51));
        Error_Label.setText("Age must be numeric");

        adressLabel1.setFont(new java.awt.Font("sansserif", 0, 17)); // NOI18N
        adressLabel1.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(adressLabel)
                            .addComponent(adressLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AgeInput)
                            .addComponent(AdressInput)
                            .addComponent(PasswordInput))))
                .addGap(0, 136, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Error_Label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Applybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AgeInput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdressInput, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(adressLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(PasswordInput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Applybtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Error_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameInputActionPerformed
        
    }//GEN-LAST:event_NameInputActionPerformed

    private void ApplybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApplybtnActionPerformed
         setName();
       setAge();
       setAdress();
       setPassword();
       Current_Client.setID(Gui1.ClientsList.size());
       
       if(setAge()){
        this.setVisible(false);
        Gui1.getStartup().setVisible(true);}
       
       
        try (FileOutputStream fs = new FileOutputStream("Clients.ser");
             ObjectOutputStream os = new ObjectOutputStream(fs)) {
            os.writeObject(Gui1.ClientsList);
            os.close();
            fs.close();
        } catch (IOException e) {
             System.out.println("Error44");                 
        }
    }//GEN-LAST:event_ApplybtnActionPerformed

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
            java.util.logging.Logger.getLogger(AddClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddClientForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddClientForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdressInput;
    private javax.swing.JTextField AgeInput;
    private javax.swing.JButton Applybtn;
    private javax.swing.JLabel Error_Label;
    private javax.swing.JTextField NameInput;
    private javax.swing.JPasswordField PasswordInput;
    private javax.swing.JLabel adressLabel;
    private javax.swing.JLabel adressLabel1;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel nameLabel;
    // End of variables declaration//GEN-END:variables
}
