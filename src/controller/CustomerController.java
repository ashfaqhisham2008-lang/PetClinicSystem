/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Customer;

/**
 *
 * @author ashfa
 */
public class CustomerController {
    
    public boolean addCustomer(Customer customer) {
        
        try {
            
            Connection connection = DBConnection.getConnection();
            
            String sql = "INSERT INTO customer (customer_name, phone, address) VALUES (?, ?, ?)";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setString(1, customer.getCustomerName());
            pst.setString(2, customer.getPhone());
            pst.setString(3, customer.getAddress());
            
            return pst.executeUpdate() > 0;
            
        } catch (Exception e) {
            
            e.printStackTrace();
            
            return false;
            
        }
        
    }
    
    public ResultSet getAllCustomers() {
        
        try {
            
            Connection connection = DBConnection.getConnection();
            
            String sql = "SELECT * FROM customer";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            return pst.executeQuery();
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return null;
            
        }
        
    }
    
    public ResultSet searchCustomer(int customerID) {
        
        try {
            
            Connection connection = DBConnection.getConnection();
            
            String sql = "SELECT * FROM customer WHERE customer_ID = ?";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setInt(1, customerID);
            
            return pst.executeQuery();
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return null;
            
        }
        
    }
    
    public boolean updateCustomer(Customer customer) {
        
        try {
            
            Connection connection = DBConnection.getConnection();
            
            String sql = "UPDATE customer SET customer_name=?, phone=?, address=? WHERE customer_ID=?";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setString(1, customer.getCustomerName());
            pst.setString(2, customer.getPhone());
            pst.setString(3, customer.getAddress());
            pst.setInt(4, customer.getCustomerID());
            
            return pst.executeUpdate() > 0;
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return false;
            
        }
        
    }
    
    public boolean deleteCustomer(int customerID) {
        
        try {
            
            Connection connection = DBConnection.getConnection();
            
            String sql = "DELETE FROM customer WHERE customer_ID=?";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setInt(1, customerID);
            
            return pst.executeUpdate() > 0;
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return false;
            
        }
        
    }
    
}
