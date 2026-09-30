/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ashfa
 */

public class DBConnection {
    
    private static Connection connection;

    private DBConnection() {
        
    }
    
    public static Connection getConnection() {
        
        try {
            
            if(connection == null || connection.isClosed()) {
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pet_clinic_db", "root", "");
                
            }
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
        }
        
        return connection;
        
    }
    
}
