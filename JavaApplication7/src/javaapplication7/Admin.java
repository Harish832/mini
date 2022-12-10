package javaapplication7;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Admin extends javax.swing.JFrame {

    int it,i1,i2;

    public Admin() {
        initComponents();
        DBC.connect();
         try{
             DBC.RSEXEQUE("SELECT Id FROM books", DBC.rs);
         
           while(DBC.rs.next())
           {
               String ex=DBC.rs.getString(1);
               id1.addItem(ex);
           }
           DBC.RSEXEQUE("SELECT Title FROM books", DBC.rs);
           
           while(DBC.rs.next())
           {
               String ex1=DBC.rs.getString(1);
               t1.addItem(ex1);
               t2.addItem(ex1);
           }
       }
       catch(SQLException e){
           System.out.println(e);
       }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t1 = new javax.swing.JComboBox<>();
        t2 = new javax.swing.JComboBox<>();
        id1 = new javax.swing.JComboBox<>();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Id2 = new javax.swing.JTextField();
        Author = new javax.swing.JTextField();
        Quantity = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        Title = new javax.swing.JTextField();
        Price2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        category = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        name = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ONLINE BOOK STORE");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(150, 11, 420, 40);

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Quantity:");
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jLabel2.setPreferredSize(new java.awt.Dimension(40, 15));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(340, 110, 80, 20);

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("ID:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 160, 40, 30);

        t1.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        t1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-" }));
        t1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                t1ItemStateChanged(evt);
            }
        });
        t1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                t1ComponentHidden(evt);
            }
        });
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1);
        t1.setBounds(70, 70, 260, 23);

        t2.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        t2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-" }));
        t2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                t2ItemStateChanged(evt);
            }
        });
        getContentPane().add(t2);
        t2.setBounds(70, 110, 260, 23);

        id1.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        id1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-" }));
        id1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                id1ItemStateChanged(evt);
            }
        });
        getContentPane().add(id1);
        id1.setBounds(70, 160, 100, 30);
        getContentPane().add(tf1);
        tf1.setBounds(430, 70, 110, 22);
        getContentPane().add(tf2);
        tf2.setBounds(430, 110, 110, 22);

        jButton1.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Update Price");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(560, 70, 140, 23);

        jButton2.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Update Quantity");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(560, 110, 140, 23);

        jButton3.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("DELETE ID");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(580, 160, 120, 30);

        jLabel7.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ID:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 240, 50, 30);

        jLabel8.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Author:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(240, 300, 80, 30);

        jLabel9.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Quantity:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 360, 80, 30);
        getContentPane().add(Id2);
        Id2.setBounds(80, 240, 130, 30);
        getContentPane().add(Author);
        Author.setBounds(320, 300, 380, 30);
        getContentPane().add(Quantity);
        Quantity.setBounds(80, 360, 130, 30);

        jLabel10.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Title:");
        jLabel10.setToolTipText("");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(250, 240, 70, 30);

        jLabel11.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Price:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(10, 300, 60, 30);

        jButton4.setBackground(new java.awt.Color(255, 0, 0));
        jButton4.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jButton4.setText("INSERT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(450, 430, 140, 40);
        getContentPane().add(Title);
        Title.setBounds(320, 240, 380, 30);
        getContentPane().add(Price2);
        Price2.setBounds(80, 300, 130, 30);

        jLabel12.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Title:");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jLabel12.setPreferredSize(new java.awt.Dimension(40, 15));
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 70, 50, 20);

        jLabel13.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Title:");
        jLabel13.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jLabel13.setPreferredSize(new java.awt.Dimension(40, 15));
        getContentPane().add(jLabel13);
        jLabel13.setBounds(10, 110, 50, 20);

        jLabel14.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Price:");
        jLabel14.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jLabel14.setPreferredSize(new java.awt.Dimension(40, 15));
        getContentPane().add(jLabel14);
        jLabel14.setBounds(340, 70, 80, 20);

        jButton5.setBackground(new java.awt.Color(255, 0, 0));
        jButton5.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        jButton5.setText("BACK");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(620, 10, 90, 30);
        getContentPane().add(category);
        category.setBounds(320, 360, 380, 30);

        jButton6.setBackground(new java.awt.Color(255, 0, 0));
        jButton6.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        jButton6.setText("CLEAR");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(160, 430, 130, 40);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(0, 142, 724, 10);

        name.setFont(new java.awt.Font("Algerian", 0, 12)); // NOI18N
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(name);
        name.setBounds(190, 160, 370, 30);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(0, 200, 724, 10);

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Category:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(230, 360, 90, 30);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\pranav\\OneDrive\\Pictures\\New folder\\Admin.jpg")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, -40, 790, 590);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_t1ComponentHidden
       
    }//GEN-LAST:event_t1ComponentHidden

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
       
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setVisible(false);
        Front obj=new Front();
        obj.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DBC.connect();
        int a=Integer.parseInt(Id2.getText());
        String b=Author.getText();
        int c=Integer.parseInt(Quantity.getText());
        String d=Title.getText();
        float e=Float.parseFloat(Price2.getText());
        String f=category.getText();
        Id2.setText("");
        Author.setText("");
        Quantity.setText("");
        Title.setText("");
        Price2.setText("");
        category.setText("");
        DBC.STATEEXEUP("INSERT INTO books VALUES('"+a+"','"+d+"','"+b+"','"+f+"','"+c+"','"+e+"')");
        Admin ob=new Admin();
        setVisible(false);
        ob.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String id=id1.getItemAt(it);
        DBC.connect();
        DBC.STATEEXEUP("DELETE FROM books WHERE id = '"+id+"'");
        Admin ob=new Admin();
        setVisible(false);
        ob.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void id1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_id1ItemStateChanged
        it=id1.getSelectedIndex();
        String l=id1.getItemAt(it);
        if(it==0)
        {
            name.setText("");
        }
        else{
        DBC.RSEXEQUE("SELECT Title FROM books where Id='"+l+"'",DBC.rs);
        try {
            while(DBC.rs.next())
            {
                name.setText(DBC.rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_id1ItemStateChanged

    private void t1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_t1ItemStateChanged
        i1=t1.getSelectedIndex();
    }//GEN-LAST:event_t1ItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        float price=Float.parseFloat(tf1.getText());
        String title=t1.getItemAt(i1);
        tf1.setText("");
        DBC.connect();
        DBC.STATEEXEUP("UPDATE books SET Price= '" +price+"' WHERE Title = '" +title+"'");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void t2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_t2ItemStateChanged
        i2=t2.getSelectedIndex();
    }//GEN-LAST:event_t2ItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        int quantity=Integer.parseInt(tf2.getText());
        String title=t2.getItemAt(i2);
        tf2.setText("");
        DBC.connect();
        DBC.STATEEXEUP("UPDATE books SET Quantity= '" +quantity+"' WHERE Title = '" +title+"'");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        Id2.setText("");
        Author.setText("");
        Quantity.setText("");
        Title.setText("");
        Price2.setText("");
        category.setText("");
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Userlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Userlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Userlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Userlog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Author;
    private javax.swing.JTextField Id2;
    private javax.swing.JTextField Price2;
    private javax.swing.JTextField Quantity;
    private javax.swing.JTextField Title;
    private javax.swing.JTextField category;
    private javax.swing.JComboBox<String> id1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField name;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JComboBox<String> t1;
    private javax.swing.JComboBox<String> t2;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf2;
    // End of variables declaration//GEN-END:variables
}
