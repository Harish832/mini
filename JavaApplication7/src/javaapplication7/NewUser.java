
package javaapplication7;

import javax.swing.JOptionPane;

public class NewUser extends javax.swing.JFrame {

    public NewUser() {
        initComponents();
        DBC.connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pfield = new javax.swing.JPasswordField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        phno = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
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
        jButton2.setBounds(740, 10, 85, 30);

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NEW USER");
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 30, 379, 40);

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Name:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(226, 100, 150, 40);

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("USER NAME:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(224, 160, 150, 36);
        getContentPane().add(name);
        name.setBounds(390, 100, 230, 40);
        getContentPane().add(uname);
        uname.setBounds(390, 160, 230, 36);

        jLabel4.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Email:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(220, 222, 160, 40);
        getContentPane().add(email);
        email.setBounds(390, 222, 230, 40);

        jLabel5.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("PassWord:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 280, 160, 40);

        pfield.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        getContentPane().add(pfield);
        pfield.setBounds(390, 280, 230, 40);

        jRadioButton1.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Show Password");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(330, 330, 213, 32);

        jLabel6.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Phone:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(236, 370, 140, 40);
        getContentPane().add(phno);
        phno.setBounds(390, 370, 230, 40);

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jButton1.setText("SIGN-UP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(340, 430, 154, 35);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\pranav\\OneDrive\\Pictures\\New folder\\newuser.jpg")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 850, 520);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String s="";
        String a=name.getText();
        String u=uname.getText();
        String e=email.getText();
        String p=new String(pfield.getPassword());
        String ph=phno.getText();
        boolean b=true;
        if(name.getText().equals(s))
        {
            JOptionPane.showMessageDialog(rootPane,"Please Enter your Name!!!");
            b=false;
        }
        if(uname.getText().equals(s))
        {
            JOptionPane.showMessageDialog(rootPane,"Please Enter your User-Name!!!");
            b=false;
        }
        if(email.getText().equals(s))
        {
            JOptionPane.showMessageDialog(rootPane,"Please Enter your Email!!!");
            b=false;
        }
        if(phno.getText().equals(s))
        {
            JOptionPane.showMessageDialog(rootPane,"Please Enter your Phone-Number!!!");
            b=false;
        }
        if(pfield.getPassword().length<8)
        {
            JOptionPane.showMessageDialog(rootPane,"Password Should have atleast 8 characters!!!");
            b=false;
        }
        if(phno.getText().length()<10)
        {
            JOptionPane.showMessageDialog(rootPane,"Phone-number Should have atleast 10 characters!!!");
            b=false;
        }
        if(b){
        DBC.STATEEXEUP("INSERT INTO user VALUES('"+a+"','"+u+"','"+e+"','"+p+"','"+ph+"')");
        setVisible(false);
        Userlog obj=new Userlog();
        obj.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        
        if(jRadioButton1.isSelected())
        {
            pfield.setEchoChar((char)0);
        } 
        else
        {
            pfield.setEchoChar('*');
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        setVisible(false);
        Front obj=new Front();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField pfield;
    private javax.swing.JTextField phno;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
