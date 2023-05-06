/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Products;

import db_connection.db_connection;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import manager.manager_frame;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author abdoa
 */
public class products_frame extends javax.swing.JFrame {

    /**
     * Creates new form products_frame
     */
    public products_frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        products_Table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        search_TextField = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        category_ComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        products_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Product_id", "Name", "Price", "Discount", "Quantity", "Brand_name", "Category"
            }
        ));
        products_Table.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                products_TableFocusGained(evt);
            }
        });
        products_Table.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                products_TablePropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(products_Table);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Search");

        search_TextField.setToolTipText("product name");

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        category_ComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                category_ComboBoxFocusGained(evt);
            }
        });
        category_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category_ComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Filter");

        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(category_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jButton3))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(25, 25, 25)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)
                                    .addComponent(jButton2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(12, 12, 12)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(category_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3)))
                .addGap(22, 22, 22))
        );

        search_TextField.getAccessibleContext().setAccessibleName("product name");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        this.setVisible(false);
        manager_frame x=new manager_frame();
        x.setVisible(true);



    }//GEN-LAST:event_jButton1ActionPerformed

    private void products_TablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_products_TablePropertyChange

  
    }//GEN-LAST:event_products_TablePropertyChange

    private void products_TableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_products_TableFocusGained
 try{ 
     
     db_connection c= new db_connection();
           
           //ResultSet rs =c.fetch("products");

            Connection conn=c.connect();
           String query = "SELECT * FROM  products";
           PreparedStatement stmt = conn.prepareStatement(query);
         ResultSet rs = stmt.executeQuery();
                    products_Table.setModel(DbUtils.resultSetToTableModel(rs));

            }
            
            catch (SQLException ee){
            
            ee.getMessage();
        }
        
    }//GEN-LAST:event_products_TableFocusGained

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        

 try{ 
     
     db_connection c= new db_connection();
           
           //ResultSet rs =c.fetch("products");
        String product_name = search_TextField.getText();
            Connection conn=c.connect();
           String query = "SELECT * FROM  products where name like ? ";
           PreparedStatement stmt = conn.prepareStatement(query);
           stmt.setString(1, "%"+product_name+"%");
         ResultSet rs = stmt.executeQuery();
                    products_Table.setModel(DbUtils.resultSetToTableModel(rs));

            }
            
            catch (SQLException ee){
            
            ee.getMessage();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void category_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category_ComboBoxActionPerformed
      
    }//GEN-LAST:event_category_ComboBoxActionPerformed

    private void category_ComboBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_category_ComboBoxFocusGained
try{ 
     
     db_connection c= new db_connection();
         Connection conn=c.connect();
           String query = "SELECT category_name FROM  categories";
            PreparedStatement stmt =  conn.prepareStatement(query);
         ResultSet rs = stmt.executeQuery();
         while(rs.next()){
             String name =rs.getString("category_name");
             category_ComboBox.addItem(name);
             System.out.println(name);
         }
         conn.close();
        }
        
catch (SQLException ee){
            
            ee.getMessage();
        }    }//GEN-LAST:event_category_ComboBoxFocusGained

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       
        try{ 
            
        String cat_name= category_ComboBox.getSelectedItem().toString();
        db_connection c= new db_connection(); 
        Connection conn=c.connect();
           String query = "SELECT * FROM  products where category_name = ? ";
           PreparedStatement stmt = conn.prepareStatement(query);
           stmt.setString(1, cat_name);
         ResultSet rs = stmt.executeQuery();
                    products_Table.setModel(DbUtils.resultSetToTableModel(rs));

            }
            
            catch (SQLException ee){
            
            ee.getMessage();
        }
        

    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        db_connection c =new db_connection();
//        Connection con=c.connect();
//        ResultSet rs = c.fetch("products");
//        prod
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new products_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> category_ComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable products_Table;
    private javax.swing.JTextField search_TextField;
    // End of variables declaration//GEN-END:variables
}
