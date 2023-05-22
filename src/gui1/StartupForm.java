
package gui1;

import java.util.ArrayList;


public class StartupForm extends javax.swing.JFrame {

// I deleted this line from here because it is in GUi1 Form i am not sure from that ArrayList<Client> clinets=new ArrayList<>();
public static int ID=0;
    public StartupForm() {
        initComponents();
        current_ClinetBtn.setVisible(false);              
        New_clientBtn.setVisible(false);
    
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userbtn = new javax.swing.JButton();
        adminbtn = new javax.swing.JButton();
        welcome = new javax.swing.JLabel();
        current_ClinetBtn = new javax.swing.JButton();
        New_clientBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userbtn.setBackground(new java.awt.Color(0, 51, 51));
        userbtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        userbtn.setForeground(new java.awt.Color(51, 51, 51));
        userbtn.setText("User");
        userbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userbtnActionPerformed(evt);
            }
        });
        getContentPane().add(userbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 150, 70));

        adminbtn.setBackground(new java.awt.Color(51, 51, 0));
        adminbtn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        adminbtn.setForeground(new java.awt.Color(51, 51, 51));
        adminbtn.setText("Admin");
        adminbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminbtnActionPerformed(evt);
            }
        });
        getContentPane().add(adminbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 150, 70));

        welcome.setFont(new java.awt.Font("Castellar", 3, 36)); // NOI18N
        welcome.setForeground(new java.awt.Color(51, 51, 51));
        welcome.setText("WELCOME");
        getContentPane().add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 260, 65));

        current_ClinetBtn.setText("Current client");
        current_ClinetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                current_ClinetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(current_ClinetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 150, 70));

        New_clientBtn.setText("New client");
        New_clientBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_clientBtnActionPerformed(evt);
            }
        });
        getContentPane().add(New_clientBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 150, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui1/roland-losslein-DmDYX_ltI48-unsplash.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void userbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userbtnActionPerformed
       current_ClinetBtn.setVisible(true);
        New_clientBtn.setVisible(true);
        adminbtn.setVisible(false);
        userbtn.setVisible(false);
    }//GEN-LAST:event_userbtnActionPerformed

    private void adminbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminbtnActionPerformed
        
        this.setVisible(false);
        try{
        Gui1.setJournForm();                                                        // هبد 
        Gui1.getJrounForm().setVisible(true);}
        catch(NullPointerException e){
            System.out.println("Journey form failed");
        }
        
    }//GEN-LAST:event_adminbtnActionPerformed

    private void current_ClinetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_current_ClinetBtnActionPerformed
        Gui1.setCurrent_ClinetForm();
        this.setVisible(false);
        Gui1.getCurrent_ClientForm().setVisible(true);
    }//GEN-LAST:event_current_ClinetBtnActionPerformed

    private void New_clientBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_New_clientBtnActionPerformed
     Gui1.setNewClientForm();
        this.setVisible(false);
      Gui1.getAddingClient().setVisible(true);
    }//GEN-LAST:event_New_clientBtnActionPerformed

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
            java.util.logging.Logger.getLogger(StartupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartupForm().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton New_clientBtn;
    private javax.swing.JButton adminbtn;
    private javax.swing.JButton current_ClinetBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton userbtn;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
