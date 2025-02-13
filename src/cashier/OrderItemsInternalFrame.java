/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package cashier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import static billing_system_project.login.get_cashier_id;


import com.formdev.flatlaf.FlatDarkLaf;
import db_connection.db_connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import manager.ViewEmployeesInternalFrame;


public class OrderItemsInternalFrame extends javax.swing.JInternalFrame {

    int cashier_id = get_cashier_id();
    int customer_id = CustomerListInternalFrame.getID();
     float discount = CustomerListInternalFrame.getDiscount();
    float total = 0;
    Connection conn;
    
      

    /**
     * Creates new form order_items
     */
    
    public int getOrderID()
    {
        ResultSet rs = null;
        int orderID = 0;
        try {
            db_connection c = new db_connection();
            conn = c.connect();
            PreparedStatement stmt = conn.prepareStatement("Insert Into orders (customer_id,cashier_id) output inserted.order_id values(?,?)");
            stmt.setInt(1, customer_id);
            stmt.setInt(2, cashier_id);
            rs = stmt.executeQuery();
            rs.next();
            //System.out.println("HERE");
            orderID = Integer.parseInt(rs.getString("order_id"));
            //System.out.println(orderID);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return orderID;
    }
 
    public void fetch_products(){

        try {

            db_connection c = new db_connection();
            Connection conn = c.connect();
            String query = "SELECT product_id as Id,name as Name,price AS Price,discount AS Discount,quantity AS Quantity,brand_name AS Brand,category_name AS Category FROM  products,brands,categories "
                    + "where categories.id=products.category_id and brands.id = products.brand_id";
            PreparedStatement stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            ProductsTable.setModel(DbUtils.resultSetToTableModel(rs));
            conn.close();
            stmt.close();
        } catch (SQLException ee) {
            ee.getMessage();
        }
    }
    
    public OrderItemsInternalFrame() {
        initComponents();
        fetch_products();
        try {
             UIManager.setLookAndFeel(new FlatDarkLaf());
         } catch (UnsupportedLookAndFeelException ex) {
             Logger.getLogger(ViewEmployeesInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
            //view of internal frame modifications
            this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
            BasicInternalFrameUI ui= (BasicInternalFrameUI)this.getUI();
            ui.setNorthPane(null);
            //disable Resize for internalJframe
            this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductsTable = new javax.swing.JTable();
        searchLabel = new javax.swing.JLabel();
        search_TextField = new javax.swing.JTextField();
        find_Button = new javax.swing.JButton();
        back = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        tot = new javax.swing.JLabel();
        distot = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        disc = new javax.swing.JLabel();
        Dis = new javax.swing.JLabel();
        disc1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RemoveButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 153, 204));
        kGradientPanel1.setkStartColor(new java.awt.Color(0, 153, 255));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(1076, 588));
        kGradientPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProductsTable.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        ProductsTable.setForeground(new java.awt.Color(255, 255, 255));
        ProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Product_id", "Name", "Price", "Discount", "Quantity", "Brand_name", "Category"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ProductsTable.setSelectionBackground(new java.awt.Color(26, 226, 141));
        ProductsTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        ProductsTable.setShowVerticalLines(true);
        ProductsTable.getTableHeader().setReorderingAllowed(false);
        ProductsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductsTable);

        kGradientPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 900, 200));

        searchLabel.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        searchLabel.setForeground(new java.awt.Color(255, 255, 255));
        searchLabel.setText("Search");
        kGradientPanel1.add(searchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 78, -1));

        search_TextField.setToolTipText("product name");
        kGradientPanel1.add(search_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 200, 30));

        find_Button.setForeground(new java.awt.Color(255, 255, 255));
        find_Button.setText("Find");
        find_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                find_ButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(find_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 270, 120, 30));

        back.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("Back");
        back.setBorder(null);
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        kGradientPanel1.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 630, 200, 40));

        SubmitButton.setBackground(new java.awt.Color(51, 255, 102));
        SubmitButton.setFont(new java.awt.Font("Libel Suit Rg", 0, 36)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton.setText("SUBMIT ORDER");
        SubmitButton.setBorder(null);
        SubmitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });
        kGradientPanel1.add(SubmitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 580, 200, 40));

        BillTable.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        BillTable.setForeground(new java.awt.Color(255, 255, 255));
        BillTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "product_id", "Name", "Price", "Qunatity", "Discount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BillTable.setSelectionBackground(new java.awt.Color(26, 226, 141));
        BillTable.setSelectionForeground(new java.awt.Color(255, 255, 255));
        BillTable.setShowVerticalLines(true);
        BillTable.getTableHeader().setReorderingAllowed(false);
        BillTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(BillTable);

        kGradientPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 900, 250));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Stock");
        kGradientPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, 60));

        tot.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        tot.setForeground(new java.awt.Color(255, 255, 255));
        tot.setText("0");
        kGradientPanel1.add(tot, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 140, 30));

        distot.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        distot.setForeground(new java.awt.Color(51, 255, 102));
        distot.setText("0");
        kGradientPanel1.add(distot, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 640, 100, 40));

        jLabel5.setFont(new java.awt.Font("Good Times Rg", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 102));
        jLabel5.setText("Cash");
        kGradientPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 120, 50));

        disc.setFont(new java.awt.Font("The Bold Font", 1, 18)); // NOI18N
        disc.setForeground(new java.awt.Color(255, 255, 255));
        disc.setText("---------------------");
        kGradientPanel1.add(disc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 280, 40));

        Dis.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        Dis.setForeground(new java.awt.Color(255, 255, 255));
        Dis.setText("0");
        kGradientPanel1.add(Dis, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 600, 150, 30));

        disc1.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        disc1.setForeground(new java.awt.Color(255, 255, 255));
        disc1.setText("Discount");
        kGradientPanel1.add(disc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 110, 30));

        jLabel1.setBackground(new java.awt.Color(255, 153, 102));
        jLabel1.setFont(new java.awt.Font("The Bold Font", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("swift");
        kGradientPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 120, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/money-bag (1).png"))); // NOI18N
        kGradientPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 640, -1, 50));

        RemoveButton1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        RemoveButton1.setForeground(new java.awt.Color(255, 255, 255));
        RemoveButton1.setText("Remove Item");
        RemoveButton1.setBorder(null);
        RemoveButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RemoveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveButton1ActionPerformed(evt);
            }
        });
        kGradientPanel1.add(RemoveButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 580, 180, 40));

        jLabel4.setBackground(new java.awt.Color(255, 153, 102));
        jLabel4.setFont(new java.awt.Font("The Bold Font", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 255, 51));
        jLabel4.setText("   PAY");
        kGradientPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 440, 60));

        jLabel6.setFont(new java.awt.Font("The Bold Font", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TOTAL");
        kGradientPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 580, 80, 20));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Customer Bill ");
        kGradientPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 200, 80));

        getContentPane().add(kGradientPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 950, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProductsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsTableMouseClicked
        int row = ProductsTable.getSelectedRow();

        String requestedQuantity = JOptionPane.showInputDialog(null, "Required Quantity");

        if(requestedQuantity == ""  || requestedQuantity == null || Integer.parseInt(requestedQuantity) <=0 )
        {
            JOptionPane.showInternalMessageDialog(null, "Enter a valid Quantity");
        }
        else
        {
            int productID = Integer.parseInt(ProductsTable.getValueAt(row, 0).toString());
            String productName = ProductsTable.getValueAt(row, 1).toString();
            float price = Float.parseFloat(ProductsTable.getValueAt(row, 2).toString());
            int quantity = Integer.parseInt(ProductsTable.getValueAt(row, 4).toString());
            float discountOfProduct = Float.parseFloat(ProductsTable.getValueAt(row, 3).toString());

            if(quantity < Integer.parseInt(requestedQuantity))
            {
                JOptionPane.showInternalMessageDialog(null, "Enter Less Quantity");
            }
            else
            {
                int index = 0;
                while(index < BillTable.getRowCount())
                {
                    if(productID == Integer.parseInt(BillTable.getValueAt(index, 0).toString()))
                    {
                        break;
                    }
                    index++;
                }

                if(index >= 0 && index <BillTable.getRowCount())
                {
                    int BillQuantity = Integer.parseInt(BillTable.getValueAt(index, 3).toString());
                    BillTable.setValueAt(BillQuantity + Integer.parseInt(requestedQuantity), index, 3);
                    total += ((price - discountOfProduct) * Integer.parseInt(requestedQuantity));
                }
                else
                {
                    DefaultTableModel newRow;
                    newRow = (DefaultTableModel) BillTable.getModel();
                    newRow.addRow(new Object[]{productID, productName, price, Integer.parseInt(requestedQuantity), discountOfProduct});

                    ProductsTable.setValueAt(quantity - Integer.parseInt(requestedQuantity), row, 4);
                    System.out.println(price - Integer.parseInt(requestedQuantity));
                    total += ((price - discountOfProduct) * Integer.parseInt(requestedQuantity));
                }

                float subTotal = total - (total*discount);

                tot.setText(Float.toString(total));
                distot.setText(Float.toString(subTotal));
                Dis.setText(Float.toString(discount));
            }

        }
    }//GEN-LAST:event_ProductsTableMouseClicked

    private void find_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_find_ButtonActionPerformed

        try {
            db_connection c = new db_connection();
            String product_name = search_TextField.getText();
            conn = c.connect();
            String query = "SELECT * FROM  products where name like ? ";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, "%" + product_name + "%");
            ResultSet rs = stmt.executeQuery();
            ProductsTable.setModel(DbUtils.resultSetToTableModel(rs));
            conn.close();
            stmt.close();
        } catch (SQLException ee) {
            ee.getMessage();
        }
    }//GEN-LAST:event_find_ButtonActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed

         CustomerListInternalFrame viewcustomersobj = new CustomerListInternalFrame();
         CashierPhase.jDesktopPane1.removeAll();
         CashierPhase.jDesktopPane1.updateUI();
         CashierPhase.jDesktopPane1.add(viewcustomersobj).setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed

        if(BillTable.getRowCount()>0)
        {
            int index = 0;
            int orderID = getOrderID();
            Connection conn = null;
            PreparedStatement stmt;
            while(index < BillTable.getRowCount())
            {
                int productID = Integer.parseInt(BillTable.getValueAt(index, 0).toString());
                int quantity = Integer.parseInt(BillTable.getValueAt(index, 3).toString());

                db_connection c = new db_connection();
                conn = c.connect();
                try {
                    System.out.println(customer_id);
                    System.out.println(cashier_id);
                    stmt = conn.prepareStatement(
                        """
                        BEGIN TRANSACTION;
                        DECLARE @productID INT = ?;
                        DECLARE @quantityVar INT = ?;
                        DECLARE @orderID INT = ?;
                        Insert into order_items (quantity,order_id,product_id) values (@quantityVar,@orderID,@productID);
                        DECLARE @oldQuantityVar INT = 0;
                        SELECT @oldQuantityVar=quantity FROM products where product_id = @productID;
                        UPDATE products set quantity = (@oldQuantityVar-@quantityVar) where product_id = @productID;
                        COMMIT TRANSACTION;""");

                        stmt.setInt(1, productID);
                        stmt.setInt(2, quantity);
                        stmt.setInt(3, orderID);

                        stmt.execute();

                        System.out.println("SSS");
                    } catch (SQLException ex) {
                        Logger.getLogger(OrderItemsInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    index++;
                }

                JOptionPane.showMessageDialog(null, "The order made successfully order id = "+orderID);

                CustomerListInternalFrame viewcustomersobj = new CustomerListInternalFrame();
                CashierPhase.jDesktopPane1.removeAll();
                CashierPhase.jDesktopPane1.updateUI();
                CashierPhase.jDesktopPane1.add(viewcustomersobj).setVisible(true);
                try {
                    stmt = conn.prepareStatement("delete from products where quantity = 0");
                } catch (SQLException ex) {
                    Logger.getLogger(OrderItemsInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Enter Products");
            }

    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void BillTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillTableMouseClicked

    }//GEN-LAST:event_BillTableMouseClicked

    private void RemoveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveButton1ActionPerformed
       int row = BillTable.getSelectedRow();
        if(row >= 0)
        {
            int productID = Integer.parseInt(BillTable.getValueAt(row, 0).toString());
            int quantity  = Integer.parseInt(BillTable.getValueAt(row, 3).toString());
            float price  = Float.parseFloat(BillTable.getValueAt(row, 2).toString());
            float discountOfProduct = Float.parseFloat(BillTable.getValueAt(row, 4).toString());

            DefaultTableModel rowToDelete=(DefaultTableModel)BillTable.getModel();
            rowToDelete.removeRow(row);

            int index = 0;
            while(index < ProductsTable.getRowCount())
            {
                if(productID == Integer.parseInt(ProductsTable.getValueAt(index, 0).toString()))
                {
                    break;
                }
                index++;
            }

            int oldQuantity = Integer.parseInt(ProductsTable.getValueAt(index, 4).toString());
            ProductsTable.setValueAt(oldQuantity + quantity, index, 4);

            total -= ((price - discountOfProduct) * quantity);
            System.out.println(price);
            System.out.println((price - discountOfProduct));
            System.out.println((price - discountOfProduct) * quantity);

            float subTotal = total - (total*discount);

            tot.setText(Float.toString(total));
            distot.setText(Float.toString(subTotal));
            Dis.setText(Float.toString(discount));
        }       
    }//GEN-LAST:event_RemoveButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BillTable;
    private javax.swing.JLabel Dis;
    private javax.swing.JTable ProductsTable;
    private javax.swing.JButton RemoveButton1;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JButton back;
    private javax.swing.JLabel disc;
    private javax.swing.JLabel disc1;
    private javax.swing.JLabel distot;
    private javax.swing.JButton find_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel searchLabel;
    private javax.swing.JTextField search_TextField;
    private javax.swing.JLabel tot;
    // End of variables declaration//GEN-END:variables
}
