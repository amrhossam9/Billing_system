package cashier;

import db_connection.db_connection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class newCustomerFrame extends javax.swing.JFrame {
    
    public newCustomerFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    static String first_name ;
    static String last_name;
    static String phone;
    static String membership;
    static String address;
    static String query;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JTextField();
        adressfield = new javax.swing.JTextField();
        membershipType = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelGradient2 = new cashier.PanelGradient();
        jLabel2 = new javax.swing.JLabel();
        panelGradient1 = new cashier.PanelGradient();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("The Bold Font", 0, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PAY");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 130, 50));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Phone Number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 170, 30));

        firstName.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        firstName.setForeground(new java.awt.Color(51, 255, 51));
        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });
        jPanel1.add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 240, -1));

        lastName.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        lastName.setForeground(new java.awt.Color(51, 255, 51));
        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });
        jPanel1.add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 240, 30));

        phoneNumber.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        phoneNumber.setForeground(new java.awt.Color(51, 255, 51));
        phoneNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberActionPerformed(evt);
            }
        });
        jPanel1.add(phoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 240, -1));

        adressfield.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        adressfield.setForeground(new java.awt.Color(51, 255, 51));
        adressfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adressfieldActionPerformed(evt);
            }
        });
        jPanel1.add(adressfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, 240, 30));

        membershipType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Bronze", "Silver", "Gold", "Platinum" }));
        membershipType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membershipTypeActionPerformed(evt);
            }
        });
        jPanel1.add(membershipType, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 240, 30));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("First Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 130, 30));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Membership");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 130, 30));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Last Name");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 130, 30));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Address");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 130, 30));

        jLabel3.setFont(new java.awt.Font("The Bold Font", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Swift");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 50));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 28)); // NOI18N
        jLabel5.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        jLabel5.setText("ADD CUSTOMER...");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 190, 30));

        jLabel6.setFont(new java.awt.Font("VIP Cartoon", 0, 24)); // NOI18N
        jLabel6.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        jLabel6.setText("-----------");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 440, -1));

        panelGradient2.setBackground(new java.awt.Color(0, 159, 253));
        panelGradient2.setColorGradient(new java.awt.Color(42, 42, 114));
        panelGradient2.setRadius(40);
        panelGradient2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelGradient2MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelGradient2MousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Gilroy Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Back");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelGradient2.add(jLabel2);
        jLabel2.setBounds(10, 0, 110, 40);

        jPanel1.add(panelGradient2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 130, 40));

        panelGradient1.setBackground(new java.awt.Color(0, 159, 253));
        panelGradient1.setColorGradient(new java.awt.Color(42, 42, 114));
        panelGradient1.setRadius(40);

        jLabel7.setFont(new java.awt.Font("Gilroy ExtraBold", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ADD Customer");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7MousePressed(evt);
            }
        });
        panelGradient1.add(jLabel7);
        jLabel7.setBounds(10, 0, 220, 40);

        jPanel1.add(panelGradient1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, 230, 40));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/new.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, 270, 340));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/223.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-90, 0, 990, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
    }//GEN-LAST:event_firstNameActionPerformed

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
    }//GEN-LAST:event_lastNameActionPerformed

    private void phoneNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberActionPerformed
    }//GEN-LAST:event_phoneNumberActionPerformed

    private void adressfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adressfieldActionPerformed
    }//GEN-LAST:event_adressfieldActionPerformed

    private void membershipTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membershipTypeActionPerformed

    }//GEN-LAST:event_membershipTypeActionPerformed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        first_name = firstName.getText();
        last_name = lastName.getText();
        phone = phoneNumber.getText();
        address = adressfield.getText();
        membership = (String) membershipType.getSelectedItem();
        if(phone.isEmpty()||first_name.isEmpty()||last_name.isEmpty()||address.isEmpty()||membership.isEmpty())
        {
           JOptionPane.showMessageDialog(this, "Enter all the fields");
        }
        else if(phone.length() != 11 || !phone.startsWith("01")|| phone.contains("[a-zA-Z]+"))
        {
            JOptionPane.showMessageDialog(this, "Enter valid phone number");
       }
        else{
                try{
                Connection conn=db_connection.connect();
                query = """
                         DECLARE @ids TABLE (id INT);
                         INSERT INTO customer (first_name, last_name, membership)
                                            OUTPUT inserted.customer_id INTO @ids
                                            VALUES (?,?,?);

                                            DECLARE @cus_id INT = (SELECT TOP 1 id FROM @ids);

                                            INSERT INTO cus_phone (id, phone)
                                            OUTPUT inserted.id INTO @ids
                                            VALUES (@cus_id,?);

                                            DECLARE @phone_id INT = (SELECT TOP 1 id FROM @ids);

                                            INSERT INTO cus_address (id, address)
                                            VALUES(@cus_id,?);
                        """;
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, first_name);stmt.setString(2, last_name);stmt.setString(3, membership);
                stmt.setString(4, phone);stmt.setString(5, address);
                stmt.execute();
                JOptionPane.showMessageDialog(null, "Customer added successfully");
            }catch (SQLException ee){
                System.out.println(ee.getMessage());
            }catch(Exception ee){
                System.out.println(ee.getMessage());
            }
        }
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setForeground(Color.white);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
      
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void panelGradient2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGradient2MouseClicked
    }//GEN-LAST:event_panelGradient2MouseClicked

    private void panelGradient2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGradient2MousePressed
this.setVisible(false);
ViewCustomersFrame c1=new ViewCustomersFrame();
c1.setVisible(true);
    }//GEN-LAST:event_panelGradient2MousePressed

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
            java.util.logging.Logger.getLogger(newCustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newCustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newCustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newCustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new newCustomerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adressfield;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lastName;
    private javax.swing.JComboBox<String> membershipType;
    private cashier.PanelGradient panelGradient1;
    private cashier.PanelGradient panelGradient2;
    private javax.swing.JTextField phoneNumber;
    // End of variables declaration//GEN-END:variables
}
