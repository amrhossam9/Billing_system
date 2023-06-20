package cashier;

import db_connection.db_connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.proteanit.sql.DbUtils;
import javax.swing.*;

public class cashierFrame extends javax.swing.JFrame {
    static String sort_by;
    static String search_for;
    static String search_by;
    static String query;
    public cashierFrame() {
        initComponents();
        sort_by = (String) sort.getSelectedItem();
        search_for = searchText.getText();
        search_by = searchby.getItemAt(searchby.getSelectedIndex());
        String ss;
        switch(sort_by){
                case "ID ↑" -> {query = "SELECT customer_id as 'ID',first_name+' '+last_name as 'Name',phone,membership,address FROM  customer order by customer_id;";}
                case "ID ↓" -> {query = "SELECT customer_id as 'ID',first_name+' '+last_name as 'Name',phone,membership,address FROM  customer order by customer_id DESC";}
                case "Name ↑" -> {query = "SELECT customer_id as 'ID',first_name+' '+last_name as 'Name',phone,membership,address FROM  customer order by first_name,last_name";}
                case "Name ↓" -> {query = "SELECT customer_id as 'ID',first_name+' '+last_name as 'Name',phone,membership,address FROM  customer order by first_name,last_name DESC";}
                case "Membership ↑" -> {query = "SELECT customer_id as 'ID',first_name+' '+last_name as 'Name',phone,membership,address FROM  customer order by membership";}
                default -> {query = "SELECT customer_id as 'ID',first_name+' '+last_name as 'Name',phone,membership,address FROM  customer order by membership DESC";}
            }
        try{
            Connection conn= db_connection.connect();
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            if(rs != null) {
                customers_table.setModel(DbUtils.resultSetToTableModel(rs));
                while(rs.next()){
                    System.out.println(rs.getInt(1));
                }
                
            }else{System.out.println("Hello");}
        }catch (SQLException ee){
            System.out.println(ee.getMessage());
        }catch(Exception ee){
            System.out.println(ee.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cashier_name = new javax.swing.JLabel();
        Panel_label = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        Make_Bill = new javax.swing.JButton();
        searchText = new javax.swing.JTextField();
        searchby = new javax.swing.JComboBox<>();
        search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        customers_table = new javax.swing.JTable();
        sort = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cashier_name.setText("Cashier_Name");

        Panel_label.setText("Program Title - Menu name");

        add.setText("New Customer");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        Make_Bill.setText("Make_BIill");

        searchText.setText("Search");
        searchText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTextActionPerformed(evt);
            }
        });

        searchby.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Name ", "Phone", " " }));
        searchby.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbyActionPerformed(evt);
            }
        });

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        customers_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Phone ", "Membership", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        customers_table.setColumnSelectionAllowed(true);
        customers_table.getTableHeader().setReorderingAllowed(false);
        customers_table.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                customers_tableFocusGained(evt);
            }
        });
        customers_table.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                customers_tablePropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(customers_table);
        customers_table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        sort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID ↑", "ID ↓", "Name ↑", "Name ↓", "Membership ↑", "Membership ↓" }));
        sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(Panel_label, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cashier_name, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(Make_Bill, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchText)
                                .addGap(35, 35, 35)
                                .addComponent(search)
                                .addGap(10, 10, 10))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(add)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Panel_label)
                    .addComponent(cashier_name))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchby, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Make_Bill, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        newCustomerFrame newcustomer = new newCustomerFrame();
        newcustomer.setVisible(true);dispose();
    }//GEN-LAST:event_addActionPerformed

    private void customers_tableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customers_tableFocusGained
        
    }//GEN-LAST:event_customers_tableFocusGained
    private void customers_tablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_customers_tablePropertyChange

    }//GEN-LAST:event_customers_tablePropertyChange
    private void sortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sortActionPerformed
        
    }//GEN-LAST:event_sortActionPerformed
    private void searchTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTextActionPerformed
            
    }//GEN-LAST:event_searchTextActionPerformed
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        search_for = searchText.getText();
        search_by = searchby.getItemAt(searchby.getSelectedIndex());
        if(search_by.equals("ID")){query = "select customer_id as 'ID',first_name+' '+last_name as 'Name',phone,membership,address from customer where customer_id like ? "; }
        if(search_by.equals("Name")){query = "select customer_id as 'ID',first_name+' '+last_name as 'Name',phone,membership,address from customer where first_name+' '+last_name like ? ";}
        if(search_by.equals("Phone")){query = "select customer_id as 'ID',first_name+' '+last_name as 'Name',phone,membership,address from customer where phone like ? ";}
        try{
            Connection conn=db_connection.connect();
            PreparedStatement stmt = conn.prepareStatement(query);
            System.out.println(query);System.out.println(search_by);
            if("ID".equals(search_by)){ stmt.setInt(1,Integer.parseInt(search_for));}
            else{stmt.setString(1, '%'+search_for+'%');}
            ResultSet rs = stmt.executeQuery();
            if(rs != null) {customers_table.setModel(DbUtils.resultSetToTableModel(rs));}
        }catch (SQLException ee){
            System.out.println(ee.getMessage());
        }catch(NumberFormatException ee){
            System.out.println(ee.getMessage());
        }catch(Exception ee){
            System.out.println(ee.getMessage());
        }
    }//GEN-LAST:event_searchActionPerformed
    private void searchbyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbyActionPerformed
       
    }//GEN-LAST:event_searchbyActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cashierFrame().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Make_Bill;
    private javax.swing.JLabel Panel_label;
    private javax.swing.JButton add;
    private javax.swing.JLabel cashier_name;
    private javax.swing.JTable customers_table;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchText;
    private javax.swing.JComboBox<String> searchby;
    private javax.swing.JComboBox<String> sort;
    // End of variables declaration//GEN-END:variables
}
