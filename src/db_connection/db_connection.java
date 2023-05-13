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
    private static Connection con;
    ResultSet rs;
     private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=Billing_system_db;integratedSecurity=true;encrypt=false";

       public static Connection connect (){
           try{
            con =DriverManager.getConnection(URL);
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
           Connection conn=db_connection.connect();
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
