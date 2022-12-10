package javaapplication7;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Adminlog extends javax.swing.JFrame {

    public Adminlog() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(707, 14, 72, 34);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMIN LOGIN");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 64, 320, 50);

        jTextField1.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(390, 150, 180, 39);

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(238, 150, 130, 39);

        jPasswordField1.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(390, 220, 180, 39);

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 220, 140, 40);

        jRadioButton1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jRadioButton1.setText("Show");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(360, 290, 90, 30);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 350, 125, 32);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\pranav\\OneDrive\\Pictures\\New folder\\Adminlog.jpg")); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-10, 0, 840, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        setVisible(false);
        Front obj=new Front();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
                
        int cou=0;
        String pass=new String(jPasswordField1.getPassword());
        String uname=jTextField1.getText();
        DBC.connect();
        DBC.RSEXEQUE("SELECT Id FROM admin",DBC.rs);
        try {
            while(DBC.rs.next())
            {
               String name=DBC.rs.getString(1);
               if(uname.equals(name))
               {
                   cou++;
                   DBC.RSEXEQUE("SELECT Password FROM admin WHERE Id='"+name+"'",DBC.rs);
                   while(DBC.rs.next())
                   {
                       if(pass.equals(DBC.rs.getString(1)))
                       {
                           setVisible(false);
                           Admin obj=new Admin();
                           obj.setVisible(true);
                       }
                       else
                       {
                           JOptionPane.showMessageDialog(rootPane,"Incorrect Password!!");
                       }
                   }
                }
            }
            if(cou==0)
               {
                   JOptionPane.showMessageDialog(rootPane,"Incorrect Username!!");
               }
            
        } catch (SQLException ex) {
            Logger.getLogger(Userlog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        
        if(jRadioButton1.isSelected())
        {
            jPasswordField1.setEchoChar((char)0);
        } 
        else
        {
            jPasswordField1.setEchoChar('*');
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Adminlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adminlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adminlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adminlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminlog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
