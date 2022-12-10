//This is the front page!!!
package javaapplication7;

import javax.swing.JOptionPane;

public class Front extends javax.swing.JFrame {
    public Front() {
        initComponents();
        DBC.connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 450));
        getContentPane().setLayout(null);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(new java.awt.Color(255, 51, 51));
        label1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        label1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        label1.setText("ONLINE BOOK STORE");
        getContentPane().add(label1);
        label1.setBounds(140, 40, 430, 60);

        button1.setBackground(new java.awt.Color(255, 51, 51));
        button1.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        button1.setLabel("USER");
        button1.setPreferredSize(new java.awt.Dimension(24, 24));
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        getContentPane().add(button1);
        button1.setBounds(280, 170, 130, 50);

        button2.setBackground(new java.awt.Color(255, 51, 51));
        button2.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        button2.setLabel("ADMIN");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        getContentPane().add(button2);
        button2.setBounds(280, 290, 130, 50);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\pranav\\OneDrive\\Pictures\\New folder\\Front.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 710, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
                
                String s="Already an User???";
                int a=JOptionPane.showConfirmDialog(rootPane,s,"Please Confirm!!!",0);
                if(a==0)
                {
                   setVisible(false);
                   Userlog obj=new Userlog();
                   obj.setVisible(true);
                }
                if(a==1)
                {
                   setVisible(false);
                   NewUser obj1=new NewUser();
                   obj1.setVisible(true);
                }
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        
                setVisible(false);
                Adminlog obj=new Adminlog();
                obj.setVisible(true);
    }//GEN-LAST:event_button2ActionPerformed

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
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Front.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Front obj=new Front();
                obj.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private javax.swing.JLabel jLabel1;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables
}
