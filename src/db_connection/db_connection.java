package db_connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abdoa
 */
public class db_connection {
     Connection con;
       public Connection connect (){
           try{
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Billing_system_db;integratedSecurity=true;encrypt=false";
            con =DriverManager.getConnection(url);
            System.out.println("Connection stablished");
       
       }
       
        catch (SQLException ee){
            
            ee.getMessage();
        }
       return con; 
       }

    
}
