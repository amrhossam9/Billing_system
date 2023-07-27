/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package test;



import com.formdev.flatlaf.FlatDarkLaf;
import db_connection.db_connection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import manager.ViewEmployeesInternalFrame;
import raven.chart.CurveLineChart;
import raven.chart.ModelChart;
import raven.chart.blankchart.BlankPlotChart;
import raven.chart.ModelChart;

public class ViewAnalysisInternalFrame extends javax.swing.JInternalFrame { 

    public int year=2023;
    public String product_name ="";


    public ViewAnalysisInternalFrame() {
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
        
        
        
         chart.setTitle("Chart Data");
        chart.addLegend("Amount", Color.decode("#7b4397"), Color.decode("#dc2430"));
        chart.addLegend("Sales", Color.decode("#e65c00"), Color.decode("#F9D423"));
        chart.addLegend("Profit", Color.decode("#0099F7"), Color.decode("#F11712"));
        combobox_years();
        combobox_products();
        show_data();
    }

   private void combobox_years() {//fetch into combobox vlues from db for years
        try{

            db_connection c= new db_connection();
            Connection conn=c.connect();
            String query = "select distinct year(date)as year from orders";
            PreparedStatement stmt =  conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                String name =rs.getString("year");
                years_ComboBox.addItem(name);
                System.out.println(name);
            }
            conn.close();
            stmt.close();
        }

        catch (SQLException ee){

            ee.getMessage();}
      
    }
    private void combobox_products() {//fetch into combobox vlues from db for products
        try{

            db_connection c= new db_connection();
            Connection conn=c.connect();
            String query = "select products.name as name from products";
            PreparedStatement stmt =  conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                String name =rs.getString("name");
                products_ComboBox.addItem(name);
                System.out.println(name);
            }
            conn.close();
            stmt.close();
        }

        catch (SQLException ee){

            ee.getMessage();}
      
    }

    private void show_data() {
       
        try {
            List<ModelData> lists = new ArrayList<>();
        Connection con;
            db_connection c= new db_connection();
            con= c.connect();
             chart.clear();
       String query = "select month(date) as Month, sum(o.quantity) as Amount,sum(p.price* o.quantity)as sales ,0.03*sum(p.price* o.quantity)as profit from orders ,products as p,order_items as o\n" +
"where o.order_id =orders.order_id \n" +
"and p.product_id=o.product_id and p.name=? and year(date)=? group by month(date)order by month desc ";
       
        PreparedStatement stmt = con.prepareStatement(query);
        stmt.setInt(2, year);
         stmt.setString(1, product_name);

         ResultSet r = stmt.executeQuery();
    
            while (r.next()) {
                int month =r.getInt("Month");
                String monthName="abdo";
                    switch (month) {
        case 1:
            monthName = "Jan";
            break;
        case 2:
            monthName = "Feb";
            break;
        case 3:
            monthName = "Mar";
            break;
        case 4:
            monthName = "Apr";
            break;
        case 5:
            monthName = "May";
            break;
        case 6:
            monthName = "Jun";
            break;
        case 7:
            monthName = "Jul";
            break;
        case 8:
            monthName = "Aug";
            break;
        case 9:
            monthName = "Sep";
            break;
        case 10:
            monthName = "Oct";
            break;
        case 11:
            monthName = "Nov";
            break;
        case 12:
            monthName = "Dec";
            break;
    }
      double amount = r.getDouble("Amount");
      double sales =r.getDouble("sales");
      double profit=r.getDouble("profit");
              
                lists.add(new ModelData(monthName, amount,sales,profit));
               

            }
            r.close();
            //  Add Data to chart
            for (int i = lists.size() - 1; i >= 0; i--) {
                ModelData d = lists.get(i);
                chart.addData(new ModelChart(d.getMonth(), new double[]{d.getAmount(), d.getCost(), d.getProfit()}));
            }
            //  Start to show data with animation
            chart.start();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
    }
public boolean check_data(String name){
     try {
        Connection con;
            db_connection c= new db_connection();
            con= c.connect();
       String query = "select name from products";
     PreparedStatement stmt = con.prepareStatement(query);
         ResultSet r = stmt.executeQuery();
         while(r.next()){
             if(name.equals(r.getString("name"))){
             return true;}
         }
         return false;
     
     }
     
     catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);
        }
     return false;
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelShadow1 = new raven.panel.PanelShadow();
        chart = new raven.chart.CurveLineChart();
        years_ComboBox = new javax.swing.JComboBox<>();
        products_ComboBox = new javax.swing.JComboBox<>();
        search_textfield = new javax.swing.JTextField();
        search_button = new javax.swing.JButton();

        panelShadow1.setBackground(new java.awt.Color(34, 59, 69));
        panelShadow1.setColorGradient(new java.awt.Color(0, 102, 102));
        panelShadow1.setFont(new java.awt.Font("SansSerif", 0, 8)); // NOI18N
        panelShadow1.setShadowType(null);
        panelShadow1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chart.setForeground(new java.awt.Color(237, 237, 237));
        chart.setFillColor(true);
        chart.setFont(new java.awt.Font("SansSerif", 0, 20)); // NOI18N
        panelShadow1.add(chart, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 850, 570));

        years_ComboBox.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        years_ComboBox.setForeground(new java.awt.Color(102, 255, 0));
        years_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                years_ComboBoxActionPerformed(evt);
            }
        });
        panelShadow1.add(years_ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, 200, 40));

        products_ComboBox.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        products_ComboBox.setForeground(new java.awt.Color(102, 255, 0));
        products_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                products_ComboBoxActionPerformed(evt);
            }
        });
        panelShadow1.add(products_ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 640, 200, 40));

        search_textfield.setFont(new java.awt.Font("Tw Cen MT", 0, 20)); // NOI18N
        search_textfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_textfieldActionPerformed(evt);
            }
        });
        panelShadow1.add(search_textfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 620, 170, 30));

        search_button.setFont(new java.awt.Font("Tw Cen MT", 0, 24)); // NOI18N
        search_button.setText("Search");
        search_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_buttonActionPerformed(evt);
            }
        });
        panelShadow1.add(search_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 660, 170, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, 918, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void years_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_years_ComboBoxActionPerformed
        if(years_ComboBox.getSelectedIndex()>=0){
            year=Integer.valueOf(years_ComboBox.getSelectedItem().toString());
            show_data();
        }
    }//GEN-LAST:event_years_ComboBoxActionPerformed

    private void products_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_products_ComboBoxActionPerformed
        if(products_ComboBox.getSelectedIndex()>=0)
            product_name=(products_ComboBox.getSelectedItem().toString());
         show_data();
    }//GEN-LAST:event_products_ComboBoxActionPerformed

    private void search_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_textfieldActionPerformed
     
    }//GEN-LAST:event_search_textfieldActionPerformed

    private void search_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_buttonActionPerformed
        String temp =search_textfield.getText();
        if(check_data(temp)){
            product_name=temp;
            show_data();
        }
        else{
            JOptionPane.showMessageDialog(this, "Enter valied name");
        }
    }//GEN-LAST:event_search_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private raven.chart.CurveLineChart chart;
    private raven.panel.PanelShadow panelShadow1;
    private javax.swing.JComboBox<String> products_ComboBox;
    private javax.swing.JButton search_button;
    private javax.swing.JTextField search_textfield;
    private javax.swing.JComboBox<String> years_ComboBox;
    // End of variables declaration//GEN-END:variables
}
