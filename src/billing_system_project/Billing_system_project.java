/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package billing_system_project;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author abdoa
 */
public class Billing_system_project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Billing_system_db;integratedSecurity=true;encrypt=false";
            Connection con=DriverManager.getConnection(url);
            System.out.println("yes");
        }
      
        catch(SQLException e){
                        System.out.println("no");
                        e.printStackTrace();

        }


    }
    
}
