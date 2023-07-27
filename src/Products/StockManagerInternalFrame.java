/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Products;

import billing_system_project.login;
import com.formdev.flatlaf.FlatDarkLaf;
import db_connection.db_connection;
import java.awt.Color;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import manager.ViewEmployeesInternalFrame;

import net.proteanit.sql.DbUtils;

public class StockManagerInternalFrame extends javax.swing.JInternalFrame {

  public void fetch_products(){

        try{ 
     
     db_connection c= new db_connection();
     Connection conn=c.connect();
       String query = "SELECT product_id as Id,name as Name,price AS Price,discount AS Discount,quantity AS Quantity,brand_name AS Brand,category_name AS Category FROM  products,brands,categories "
               + "where categories.id=products.category_id and brands.id = products.brand_id";
        PreparedStatement stmt = conn.prepareStatement(query);
         ResultSet rs = stmt.executeQuery();
         products_Table.setModel(DbUtils.resultSetToTableModel(rs));
         conn.close();
         stmt.close();
            }
            
            catch (SQLException ee){
            
            ee.getMessage();
        }
    }
    //check if the brand isn't in the database it insert it and add it to the combobox
    public int check_brand(String brand){
        try{ 
     
     db_connection c= new db_connection();
            Connection conn=c.connect();
           String query = "SELECT id FROM  brands where brand_name = ? ";
           PreparedStatement stmt = conn.prepareStatement(query);
           stmt.setString(1, brand);
         ResultSet rs = stmt.executeQuery();
         if(!rs.next()){
              query = "insert into brands (brand_name) output inserted.id values(?) ";
             stmt = conn.prepareStatement(query);
             stmt.setString(1, brand);
           ResultSet rss = stmt.executeQuery();
          //stmt.execute();
            brand_ComboBox.addItem(brand);
             System.out.println("New brand added");
             message_Label.setText("New brand added");
             rss.next();
             int id = Integer.parseInt( rss.getString("id"));
             System.out.println(id);
              conn.close();
         stmt.close();
             return id;
         }
          else  {
             int id =Integer.parseInt( rs.getString("id"));
             System.out.println(id);
              conn.close();
         stmt.close();
             return id;
         }  
        
            }
            
            catch (SQLException ee){
                
                System.out.println("errrrrrror");
            ee.getMessage();
        }
        return 0;
    } 
    //check if the category isn't in the database it insert it and add it to the combobox
    public int check_category(String category){
          try{ 
     
     db_connection c= new db_connection();
            Connection conn=c.connect();
           String query = "SELECT id FROM  categories where category_name = ? ";
           PreparedStatement stmt = conn.prepareStatement(query);
           stmt.setString(1, category);
         ResultSet rs = stmt.executeQuery();
         if(!rs.next()){
              query = "insert into categories (category_name) output inserted.id values(?) ";
             stmt = conn.prepareStatement(query);
             stmt.setString(1, category);
           ResultSet rss = stmt.executeQuery();
             category_ComboBox.addItem(category);
             System.out.println("new category category");
              if("New brand added".equals(message_Label.getText())){
                 message_Label.setText("New brand and category added");
             }
             else
              {message_Label.setText("New category added");}
               rss.next();
             int id = Integer.parseInt( rss.getString("id"));
             System.out.println(id);
              conn.close();
         stmt.close();
             return id;
             
         }
         else{
         int id =Integer.parseInt( rs.getString("id"));
             System.out.println(id);
              conn.close();
         stmt.close();
             return id;
            }
          
          }
            
            catch (SQLException ee){
            
            ee.getMessage();
        }
        return 0;
    }
   
    public StockManagerInternalFrame() {
        initComponents();
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

        kGradientPanel4 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        products_Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        search_TextField = new javax.swing.JTextField();
        find_Button = new javax.swing.JButton();
        category_ComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cat_filter_Button = new javax.swing.JButton();
        brand_ComboBox = new javax.swing.JComboBox<>();
        brand_filter_Button = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        price_TextField = new javax.swing.JTextField();
        discount_TextField = new javax.swing.JTextField();
        quantity_TextField = new javax.swing.JTextField();
        brand_TextField = new javax.swing.JTextField();
        category_TextField = new javax.swing.JTextField();
        add_Button = new javax.swing.JButton();
        edit_Button = new javax.swing.JButton();
        delete_Button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        AddressLabel3 = new javax.swing.JLabel();
        message_Label = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kGradientPanel4.setkEndColor(new java.awt.Color(0, 153, 204));
        kGradientPanel4.setkStartColor(new java.awt.Color(0, 153, 255));
        kGradientPanel4.setPreferredSize(new java.awt.Dimension(1076, 588));
        kGradientPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        products_Table.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        products_Table.setForeground(new java.awt.Color(255, 255, 255));
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        products_Table.setSelectionBackground(new java.awt.Color(26, 226, 141));
        products_Table.setSelectionForeground(new java.awt.Color(255, 255, 255));
        products_Table.getTableHeader().setReorderingAllowed(false);
        products_Table.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                products_TableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        products_Table.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                products_TableFocusGained(evt);
            }
        });
        products_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                products_TableMouseClicked(evt);
            }
        });
        products_Table.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                products_TablePropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(products_Table);

        kGradientPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 890, 300));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Search");
        kGradientPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 100, -1));

        search_TextField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        search_TextField.setToolTipText("product name");
        search_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_TextFieldActionPerformed(evt);
            }
        });
        kGradientPanel4.add(search_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 115, 30));

        find_Button.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        find_Button.setForeground(new java.awt.Color(255, 255, 255));
        find_Button.setText("Find");
        find_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        find_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                find_ButtonActionPerformed(evt);
            }
        });
        kGradientPanel4.add(find_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 130, 30));

        category_ComboBox.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        category_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        category_ComboBox.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                category_ComboBoxComponentAdded(evt);
            }
        });
        category_ComboBox.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                category_ComboBoxHierarchyChanged(evt);
            }
        });
        category_ComboBox.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                category_ComboBoxAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        category_ComboBox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                category_ComboBoxFocusGained(evt);
            }
        });
        category_ComboBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
                category_ComboBoxPopupMenuCanceled(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                category_ComboBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                category_ComboBoxPopupMenuWillBecomeVisible(evt);
            }
        });
        category_ComboBox.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                category_ComboBoxComponentShown(evt);
            }
        });
        category_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                category_ComboBoxActionPerformed(evt);
            }
        });
        category_ComboBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                category_ComboBoxPropertyChange(evt);
            }
        });
        category_ComboBox.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                category_ComboBoxVetoableChange(evt);
            }
        });
        kGradientPanel4.add(category_ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 440, 120, 30));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Category");
        kGradientPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 400, 110, -1));

        cat_filter_Button.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        cat_filter_Button.setForeground(new java.awt.Color(255, 255, 255));
        cat_filter_Button.setText("Filter");
        cat_filter_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cat_filter_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cat_filter_ButtonActionPerformed(evt);
            }
        });
        kGradientPanel4.add(cat_filter_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, 120, 30));

        brand_ComboBox.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        brand_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        brand_ComboBox.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                brand_ComboBoxAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        brand_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand_ComboBoxActionPerformed(evt);
            }
        });
        kGradientPanel4.add(brand_ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 120, 30));

        brand_filter_Button.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        brand_filter_Button.setForeground(new java.awt.Color(255, 255, 255));
        brand_filter_Button.setText("Filter");
        brand_filter_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        brand_filter_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brand_filter_ButtonActionPerformed(evt);
            }
        });
        kGradientPanel4.add(brand_filter_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 440, 120, 30));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Brand");
        kGradientPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 60, 40));

        nameTextField.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        kGradientPanel4.add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 140, 30));

        price_TextField.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        price_TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                price_TextFieldKeyPressed(evt);
            }
        });
        kGradientPanel4.add(price_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, 140, 30));

        discount_TextField.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        discount_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discount_TextFieldActionPerformed(evt);
            }
        });
        discount_TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                discount_TextFieldKeyPressed(evt);
            }
        });
        kGradientPanel4.add(discount_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 630, 140, 30));

        quantity_TextField.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        quantity_TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantity_TextFieldActionPerformed(evt);
            }
        });
        quantity_TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quantity_TextFieldKeyPressed(evt);
            }
        });
        kGradientPanel4.add(quantity_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 560, 140, 30));

        brand_TextField.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        kGradientPanel4.add(brand_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 630, 140, 30));

        category_TextField.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        kGradientPanel4.add(category_TextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 630, 140, 30));

        add_Button.setBackground(new java.awt.Color(102, 255, 102));
        add_Button.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        add_Button.setForeground(new java.awt.Color(255, 255, 255));
        add_Button.setText("ADD");
        add_Button.setBorder(null);
        add_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_ButtonActionPerformed(evt);
            }
        });
        kGradientPanel4.add(add_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 540, 220, 40));

        edit_Button.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        edit_Button.setForeground(new java.awt.Color(255, 255, 255));
        edit_Button.setText("EDIT");
        edit_Button.setBorder(null);
        edit_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_ButtonActionPerformed(evt);
            }
        });
        kGradientPanel4.add(edit_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 590, 220, 40));

        delete_Button.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        delete_Button.setForeground(new java.awt.Color(255, 255, 255));
        delete_Button.setText("DELETE");
        delete_Button.setBorder(null);
        delete_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_ButtonActionPerformed(evt);
            }
        });
        kGradientPanel4.add(delete_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 640, 220, 40));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        kGradientPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 60, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price");
        kGradientPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 60, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Discount");
        kGradientPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 600, 90, -1));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Quantity");
        kGradientPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 90, -1));

        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Brand");
        kGradientPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 600, 60, -1));

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Category");
        kGradientPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 110, -1));

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/ready-stock (1).png"))); // NOI18N
        kGradientPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 80, 60));

        jLabel11.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("STOCK INFORMATION");
        kGradientPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 380, 50));

        AddressLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 28)); // NOI18N
        AddressLabel3.setForeground(new java.awt.Color(51, 255, 102));
        AddressLabel3.setText("------------------------ Data Edit --------------------------");
        kGradientPanel4.add(AddressLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 640, 40));

        message_Label.setFont(new java.awt.Font("Teen-Poem", 1, 18)); // NOI18N
        message_Label.setForeground(javax.swing.UIManager.getDefaults().getColor("Actions.Red"));
        kGradientPanel4.add(message_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 500, 20));

        getContentPane().add(kGradientPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void products_TableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_products_TableAncestorAdded
        fetch_products();
    }//GEN-LAST:event_products_TableAncestorAdded

    private void products_TableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_products_TableFocusGained

    }//GEN-LAST:event_products_TableFocusGained

    private void products_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_products_TableMouseClicked
        int row =products_Table.getSelectedRow();
        String name =    products_Table.getValueAt(row, 1).toString();
        String price =    products_Table.getValueAt(row, 2).toString();
        String discount =   products_Table.getValueAt(row, 3).toString();
        String quantity = products_Table.getValueAt(row, 4).toString();
        String brand =  products_Table.getValueAt(row, 5).toString();
        String category =  products_Table.getValueAt(row, 6).toString();

        nameTextField.setText(name);
        price_TextField.setText(price);
        discount_TextField.setText(discount);
        quantity_TextField.setText(quantity);
        brand_TextField.setText(brand);
        category_TextField.setText(category);

    }//GEN-LAST:event_products_TableMouseClicked

    private void products_TablePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_products_TablePropertyChange

    }//GEN-LAST:event_products_TablePropertyChange

    private void search_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_TextFieldActionPerformed

    private void find_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_find_ButtonActionPerformed

        try{

            db_connection c= new db_connection();
            String product_name = search_TextField.getText();
            Connection conn=c.connect();
            String query = "SELECT product_id as Id,name as Name,price AS Price,discount AS Discount,quantity AS Quantity,brand_name AS Brand,category_name AS Category FROM  products,brands,categories "
            + "where categories.id=products.category_id and brands.id = products.brand_id and name like ? ";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, "%"+product_name+"%");
            ResultSet rs = stmt.executeQuery();
            products_Table.setModel(DbUtils.resultSetToTableModel(rs));
            conn.close();
            stmt.close();
        }

        catch (SQLException ee){

            ee.getMessage();
        }
    }//GEN-LAST:event_find_ButtonActionPerformed

    private void category_ComboBoxComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_category_ComboBoxComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_category_ComboBoxComponentAdded

    private void category_ComboBoxHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_category_ComboBoxHierarchyChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_category_ComboBoxHierarchyChanged

    private void category_ComboBoxAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_category_ComboBoxAncestorAdded
        try{ //add all the categories from the database into the combobox when the frame is opened

            db_connection c= new db_connection();
            Connection conn=c.connect();
            String query = "SELECT category_name FROM  categories";
            PreparedStatement stmt =  conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                String name =rs.getString("category_name");
                category_ComboBox.addItem(name);
            }
            conn.close();
            stmt.close();
        }

        catch (SQLException ee){

            ee.getMessage();}
    }//GEN-LAST:event_category_ComboBoxAncestorAdded

    private void category_ComboBoxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_category_ComboBoxFocusGained
        
    }//GEN-LAST:event_category_ComboBoxFocusGained

    private void category_ComboBoxPopupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_category_ComboBoxPopupMenuCanceled
        // TODO add your handling code here:
    }//GEN-LAST:event_category_ComboBoxPopupMenuCanceled

    private void category_ComboBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_category_ComboBoxPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
    }//GEN-LAST:event_category_ComboBoxPopupMenuWillBecomeInvisible

    private void category_ComboBoxPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_category_ComboBoxPopupMenuWillBecomeVisible
        // TODO add your handling code here:
    }//GEN-LAST:event_category_ComboBoxPopupMenuWillBecomeVisible

    private void category_ComboBoxComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_category_ComboBoxComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_category_ComboBoxComponentShown

    private void category_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_category_ComboBoxActionPerformed

    }//GEN-LAST:event_category_ComboBoxActionPerformed

    private void category_ComboBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_category_ComboBoxPropertyChange

    }//GEN-LAST:event_category_ComboBoxPropertyChange

    private void category_ComboBoxVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_category_ComboBoxVetoableChange
        // TODO add your handling code here:
    }//GEN-LAST:event_category_ComboBoxVetoableChange

    private void cat_filter_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cat_filter_ButtonActionPerformed

        if(category_ComboBox.getSelectedIndex()==0){

            fetch_products();
        }

        else{
            try{

                String cat_name= category_ComboBox.getSelectedItem().toString();
                db_connection c= new db_connection();
                Connection conn=c.connect();
                String query ="SELECT product_id as Id,name as Name,price AS Price,discount AS Discount,quantity AS Quantity,brand_name AS Brand,category_name AS Category FROM  products,brands,categories "
                + "where categories.id=products.category_id and brands.id = products.brand_id and category_name = ? " ;
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, cat_name);
                ResultSet rs = stmt.executeQuery();
                products_Table.setModel(DbUtils.resultSetToTableModel(rs));
                conn.close();
                stmt.close();
            }

            catch (SQLException ee){

                ee.getMessage();
            }

        }
    }//GEN-LAST:event_cat_filter_ButtonActionPerformed

    private void brand_ComboBoxAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_brand_ComboBoxAncestorAdded
        try{ //add all the brands from the database into the combobox when the frame is opened

            db_connection c= new db_connection();
            Connection conn=c.connect();
            String query = "SELECT brand_name FROM  brands";
            PreparedStatement stmt =  conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                String name =rs.getString("brand_name");
                brand_ComboBox.addItem(name);
                System.out.println(name);
            }
            conn.close();
            stmt.close();
        }

        catch (SQLException ee){

            ee.getMessage();}
    }//GEN-LAST:event_brand_ComboBoxAncestorAdded

    private void brand_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brand_ComboBoxActionPerformed

    private void brand_filter_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brand_filter_ButtonActionPerformed
        if(brand_ComboBox.getSelectedIndex()==0){

            fetch_products();
        }

        else{
            try{

                String brand_name= brand_ComboBox.getSelectedItem().toString();
                db_connection c= new db_connection();
                Connection conn=c.connect();
                String query ="SELECT product_id as Id,name as Name,price AS Price,discount AS Discount,quantity AS Quantity,brand_name AS Brand,category_name AS Category FROM  products,brands,categories "
                + "where categories.id=products.category_id and brands.id = products.brand_id and brand_name = ? " ;
                PreparedStatement stmt = conn.prepareStatement(query);
                stmt.setString(1, brand_name);
                ResultSet rs = stmt.executeQuery();
                products_Table.setModel(DbUtils.resultSetToTableModel(rs));
                conn.close();
                stmt.close();
            }

            catch (SQLException ee){

                ee.getMessage();
            }}
    }//GEN-LAST:event_brand_filter_ButtonActionPerformed

    private void price_TextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_price_TextFieldKeyPressed
        char c= evt.getKeyChar();
        if(Character.isLetter(c)){
            price_TextField.setEditable(false);
            message_Label.setText("Please Enter number only");
        }
        else{
            price_TextField.setEditable(true);
            message_Label.setText("");

        }

    }//GEN-LAST:event_price_TextFieldKeyPressed

    private void discount_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discount_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discount_TextFieldActionPerformed

    private void discount_TextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_discount_TextFieldKeyPressed
        char c= evt.getKeyChar();
        if(Character.isLetter(c)){
            discount_TextField.setEditable(false);
            message_Label.setText("Please Enter number only");
        }
        else{
            discount_TextField.setEditable(true);
            message_Label.setText("");

        }
    }//GEN-LAST:event_discount_TextFieldKeyPressed

    private void quantity_TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantity_TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantity_TextFieldActionPerformed

    private void quantity_TextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantity_TextFieldKeyPressed
        char c= evt.getKeyChar();
        if(Character.isLetter(c)){
            quantity_TextField.setEditable(false);
            message_Label.setText("Please Enter number only");
        }
        else{
            quantity_TextField.setEditable(true);
            message_Label.setText("");

        }
    }//GEN-LAST:event_quantity_TextFieldKeyPressed

    private void add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_ButtonActionPerformed
        String name=nameTextField.getText();
        String price=price_TextField.getText();
        String discount =discount_TextField.getText();
        String quantity= quantity_TextField.getText();
        String brand=brand_TextField.getText();
        String category=category_TextField.getText();

        if(name.isEmpty()||price.isEmpty()||discount.isEmpty()||quantity.isEmpty()|| brand.isEmpty()||category.isEmpty()){
            JOptionPane.showMessageDialog(this, "Enter all the fields");
        }
        else{
            try{
                db_connection c=new db_connection();
                Connection conn= c.connect() ;
                int brand_id= check_brand(brand);
                int cat_id=check_category(category);
                String query ="INSERT INTO products values (?,?,?,?,?,?)";
                PreparedStatement stmt =conn.prepareStatement(query);
                stmt.setString(1,name );
                stmt.setDouble(2, Double.parseDouble(price));
                stmt.setDouble(3,Double.parseDouble( discount));
                stmt.setInt(4, Integer.parseUnsignedInt(quantity));
                stmt.setInt(5,brand_id);
                stmt.setInt(6, cat_id);
                stmt.execute();
                fetch_products();
                JOptionPane.showMessageDialog(this, "Item Added ");
                conn.close();
                stmt.close();
                nameTextField.setText("");
                price_TextField.setText("");
                discount_TextField.setText("");
                quantity_TextField.setText("");
                brand_TextField.setText("");
                category_TextField.setText("");

            }

            catch (SQLException ee){

                ee.getMessage();
                System.out.println("error");
            }

        }
    }//GEN-LAST:event_add_ButtonActionPerformed

    private void edit_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_ButtonActionPerformed
        String name=nameTextField.getText();
        String price=price_TextField.getText();
        String discount =discount_TextField.getText();
        String quantity= quantity_TextField.getText();
        String brand=brand_TextField.getText();
        String category=category_TextField.getText();

        if(name.isEmpty()||price.isEmpty()||discount.isEmpty()||quantity.isEmpty()|| brand.isEmpty()||category.isEmpty()){
            JOptionPane.showMessageDialog(this, "Select an item");
        }

        else{
            int yes=JOptionPane.showConfirmDialog(this,"Are you sure you want to Update this item ?!");
            if(yes==0){
                try{
                    db_connection c=new db_connection();
                    Connection conn= c.connect() ;
                    int brand_id= check_brand(brand);
                    int cat_id=check_category(category);
                    int row = products_Table.getSelectedRow();
                    int id=  Integer.parseInt(products_Table.getValueAt(row, 0).toString());
                    String query ="UPDATE products SET name =? ,price=? , discount =?, quantity=?, brand_id =? , category_id=? WHERE product_id = ?";
                    PreparedStatement stmt =conn.prepareStatement(query);
                    stmt.setString(1,name );
                    stmt.setDouble(2, Double.parseDouble(price));
                    stmt.setDouble(3,Double.parseDouble( discount));
                    stmt.setInt(4, Integer.parseUnsignedInt(quantity));
                    stmt.setInt(5, brand_id);
                    stmt.setInt(6, cat_id);
                    stmt.setInt(7,id );
                    stmt.execute();
                    System.out.println("7777777777777777777777777777");
                    fetch_products();
                    JOptionPane.showMessageDialog(this, "Item is updated");
                    conn.close();
                    stmt.close();
                    nameTextField.setText("");
                    price_TextField.setText("");
                    discount_TextField.setText("");
                    quantity_TextField.setText("");
                    brand_TextField.setText("");
                    category_TextField.setText("");

                }
                catch (SQLException ee){

                    ee.getMessage();
                    System.out.println("error");
                }}

            }
    }//GEN-LAST:event_edit_ButtonActionPerformed

    private void delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_ButtonActionPerformed

        String name=nameTextField.getText();
        String price=price_TextField.getText();
        String discount =discount_TextField.getText();
        String quantity= quantity_TextField.getText();
        String brand=brand_TextField.getText();
        String category=category_TextField.getText();

        if(name.isEmpty()||price.isEmpty()||discount.isEmpty()||quantity.isEmpty()|| brand.isEmpty()||category.isEmpty()){
            JOptionPane.showMessageDialog(this, "Select an item");
        }

        else{
            int yes=JOptionPane.showConfirmDialog(this,"Are you sure you want to delete this item ?!");
            if(yes==0){
                try{
                    db_connection c=new db_connection();
                    Connection conn= c.connect() ;
                    int row = products_Table.getSelectedRow();
                    int id=  Integer.parseInt(products_Table.getValueAt(row, 0).toString());
                    String query ="DELETE FROM products WHERE product_id = ?";
                    PreparedStatement stmt =conn.prepareStatement(query);
                    stmt.setInt(1,id );
                    stmt.execute();
                    fetch_products();
                    JOptionPane.showMessageDialog(this, "Item is deleted");
                    conn.close();
                    stmt.close();
                    nameTextField.setText("");
                    price_TextField.setText("");
                    discount_TextField.setText("");
                    quantity_TextField.setText("");
                    brand_TextField.setText("");
                    category_TextField.setText("");

                }
                catch (SQLException ee){

                    ee.getMessage();
                    System.out.println("error");
                }}

            }

    }//GEN-LAST:event_delete_ButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddressLabel3;
    private javax.swing.JButton add_Button;
    private javax.swing.JComboBox<String> brand_ComboBox;
    private javax.swing.JTextField brand_TextField;
    private javax.swing.JButton brand_filter_Button;
    private javax.swing.JButton cat_filter_Button;
    private javax.swing.JComboBox<String> category_ComboBox;
    private javax.swing.JTextField category_TextField;
    private javax.swing.JButton delete_Button;
    private javax.swing.JTextField discount_TextField;
    private javax.swing.JButton edit_Button;
    private javax.swing.JButton find_Button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private keeptoo.KGradientPanel kGradientPanel4;
    private javax.swing.JLabel message_Label;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField price_TextField;
    private javax.swing.JTable products_Table;
    private javax.swing.JTextField quantity_TextField;
    private javax.swing.JTextField search_TextField;
    // End of variables declaration//GEN-END:variables
}
