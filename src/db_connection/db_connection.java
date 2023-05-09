package db_connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
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
      ResultSet rs;
       public Connection connect (){
           try{
        String url = "jdbc:sqlserver://localhost:1433;databaseName=Billing_system_db;integratedSecurity=true;encrypt=false";
            con =DriverManager.getConnection(url);
            System.out.println("Connection stablished");
       
       }
       
        catch (SQLException ee){
            System.out.println("failed to connect");
            ee.getMessage();
        }
       return con; 
       }

       public ResultSet fetch(String table_name){
            try{ db_connection c= new db_connection();
           Connection conn=c.connect();
           String query = "SELECT * FROM ('"+table_name+"')";
           PreparedStatement stmt = conn.prepareStatement(query);
          rs = stmt.executeQuery();
            
            }
            
            catch (SQLException ee){
            
            ee.getMessage();
        }
            return rs;
       }
    
}
