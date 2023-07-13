package Employees_info;

import cashier.*;
import db_connection.db_connection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import manager.ViewEmployeesInternalFrame;
public class NewEmpFrame extends javax.swing.JFrame {
     Connection con;
            db_connection c= new db_connection();
            
    public NewEmpFrame() {
        initComponents();
       con= c.connect();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        employeeNameField = new javax.swing.JTextField();
        employeePhoneField = new javax.swing.JTextField();
        employeeAddressField = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox<>();
        employeeRoleComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        employeePasswordField = new javax.swing.JPasswordField();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        panelGradient2 = new cashier.PanelGradient();
        jLabel2 = new javax.swing.JLabel();
        panelGradient1 = new cashier.PanelGradient();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        employeeSallaryField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("The Bold Font", 0, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PAY");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 130, 50));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 150, 30));

        employeeNameField.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        employeeNameField.setForeground(new java.awt.Color(51, 255, 51));
        employeeNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeNameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(employeeNameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 240, -1));

        employeePhoneField.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        employeePhoneField.setForeground(new java.awt.Color(51, 255, 51));
        employeePhoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeePhoneFieldActionPerformed(evt);
            }
        });
        getContentPane().add(employeePhoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 240, -1));

        employeeAddressField.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        employeeAddressField.setForeground(new java.awt.Color(51, 255, 51));
        employeeAddressField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeAddressFieldActionPerformed(evt);
            }
        });
        getContentPane().add(employeeAddressField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 240, -1));

        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        genderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(genderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 240, -1));

        employeeRoleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Stock Manager", "Cashier" }));
        employeeRoleComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeRoleComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(employeeRoleComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 240, -1));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Name");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 110, 30));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Salary");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 130, 30));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Phone");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 110, 30));
        getContentPane().add(employeePasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 240, 30));

        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Gender");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 110, 30));

        jLabel3.setFont(new java.awt.Font("The Bold Font", 0, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SWIFT");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 50));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 28)); // NOI18N
        jLabel5.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        jLabel5.setText("ADD EMPLOYEE...");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, 30));

        jLabel6.setFont(new java.awt.Font("VIP Cartoon", 0, 24)); // NOI18N
        jLabel6.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        jLabel6.setText("----------");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        panelGradient2.setBackground(new java.awt.Color(0, 159, 253));
        panelGradient2.setColorGradient(new java.awt.Color(42, 42, 114));
        panelGradient2.setRadius(40);
        panelGradient2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelGradient2MousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Gilroy Light", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Back");
        panelGradient2.add(jLabel2);
        jLabel2.setBounds(40, 0, 90, 40);

        getContentPane().add(panelGradient2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 440, 160, 40));

        panelGradient1.setBackground(new java.awt.Color(0, 159, 253));
        panelGradient1.setColorGradient(new java.awt.Color(42, 42, 114));
        panelGradient1.setRadius(40);
        panelGradient1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelGradient1MousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Gilroy ExtraBold", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ADD Employee");
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
        jLabel7.setBounds(20, -10, 180, 70);

        getContentPane().add(panelGradient1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 220, 50));

        jLabel13.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("Role");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 110, 30));

        jLabel14.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 51));
        jLabel14.setText("Password");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 110, 30));
        getContentPane().add(employeeSallaryField, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 240, 30));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/addemployee36686.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 300, 320));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/223.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, 0, 1000, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void employeeNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeNameFieldActionPerformed
    }//GEN-LAST:event_employeeNameFieldActionPerformed

    private void employeePhoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeePhoneFieldActionPerformed
    }//GEN-LAST:event_employeePhoneFieldActionPerformed

    private void employeeAddressFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeAddressFieldActionPerformed
    }//GEN-LAST:event_employeeAddressFieldActionPerformed

    private void genderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboBoxActionPerformed

    }//GEN-LAST:event_genderComboBoxActionPerformed

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
 
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseEntered
        jLabel7.setForeground(Color.white);
    }//GEN-LAST:event_jLabel7MouseEntered

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
      jLabel7.setForeground(Color.GREEN);
    }//GEN-LAST:event_jLabel7MouseExited

    private void panelGradient1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGradient1MousePressed
      
    }//GEN-LAST:event_panelGradient1MousePressed

    private void panelGradient2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGradient2MousePressed
        this.setVisible(false);
        ViewEmployeesInternalFrame e=new ViewEmployeesInternalFrame();
        e.setVisible(true);
    }//GEN-LAST:event_panelGradient2MousePressed

    private void employeeRoleComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeRoleComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeRoleComboBoxActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       
        String employeeAddress = employeeAddressField.getText();
        if(employeeNameField.getText().isEmpty()||employeePhoneField.getText().isEmpty()||employeeAddressField.getText().isEmpty()||
                employeePasswordField.getPassword().length == 0||employeeSallaryField.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter all the fields");
        }
        else if(employeePhoneField.getText().length() != 11 || !employeePhoneField.getText().startsWith("01")
                || employeePhoneField.getText().contains("[a-zA-Z]+"))
        {
            JOptionPane.showMessageDialog(this, "Enter valid phone number");
        }
        else
        {
            String EmployeeNameField = employeeNameField.getText(),
               employeePhone = employeePhoneField.getText(),
               //employeeAddress = employeeAddressField.getText(),
               employeeGender = genderComboBox.getSelectedItem().toString(),
               EmployeePassword = new String (employeePasswordField.getPassword()),
               employeeSallary = employeeSallaryField.getText(),
               EmployeeRole = employeeRoleComboBox.getSelectedItem().toString();
        
            PreparedStatement stmt;
            try {

                stmt = con.prepareStatement("Select *"
                        + "from employee inner join emp_phone "
                        + "on employee.employee_id = emp_phone.id inner join emp_address "
                        + "on employee.employee_id = emp_address.id where phone = ?");
                stmt.setString(1, employeePhone);

                ResultSet resultSet= stmt.executeQuery();

                if(resultSet.next() == true)
                {
                    JOptionPane.showMessageDialog(this, "User already exist the phone number is saved in the database");
                }
                else
                {
                    stmt = con.prepareStatement("""
                                                DECLARE @ids TABLE (id INT);
                                                
                                                INSERT INTO employee (name, gender, role, password, sallary)
                                                OUTPUT inserted.employee_id INTO @ids
                                                VALUES (?,?,?,?,?);
                                                
                                                DECLARE @emp_id INT = (SELECT TOP 1 id FROM @ids);
                                                
                                                INSERT INTO emp_phone (id, phone)
                                                OUTPUT inserted.id INTO @ids
                                                VALUES (@emp_id,?);
                                                
                                                DECLARE @phone_id INT = (SELECT TOP 1 id FROM @ids);
                                                
                                                INSERT INTO emp_address (id, address)
                                                VALUES (@emp_id,?);""");
                    stmt.setString(1, EmployeeNameField);
                    stmt.setString(2, employeeGender);
                    stmt.setString(3, EmployeeRole);
                    stmt.setString(4, EmployeePassword);
                    stmt.setFloat(5, Float.parseFloat(employeeSallary));
                    stmt.setString(6, employeePhone);
                    stmt.setString(7, employeeAddress);

                    stmt.executeQuery();
                    
                    
                    
                } 
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "User added successfully");
                
                employeeNameField.setText("");
                employeePhoneField.setText("");
                employeeAddressField.setText("");
                genderComboBox.setSelectedIndex(0);
                employeePasswordField.setText("");
                employeeSallaryField.setText("");
                employeeRoleComboBox.setSelectedIndex(0);
                
                    
                 //  ViewEmloyeesInternalFrame empObject = new ViewEmloyeesInternalFrame();
                //   empObject.setVisible(true);
            } 
            
        }
                       
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(NewEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewEmpFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField employeeAddressField;
    private javax.swing.JTextField employeeNameField;
    private javax.swing.JPasswordField employeePasswordField;
    private javax.swing.JTextField employeePhoneField;
    private javax.swing.JComboBox<String> employeeRoleComboBox;
    private javax.swing.JTextField employeeSallaryField;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private cashier.PanelGradient panelGradient1;
    private cashier.PanelGradient panelGradient2;
    // End of variables declaration//GEN-END:variables
}
