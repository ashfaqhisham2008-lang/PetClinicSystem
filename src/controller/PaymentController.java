/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Payment;

/**
 *
 * @author ashfa
 */
public class PaymentController {
    
    public boolean addPayment(Payment payment) {
        
        try {
            
            Connection connection = DBConnection.getConnection();
            
            String sql = "INSERT INTO payment (appointment_ID, amount, payment_date, payment_method) VALUES (?, ?, ?, ?)";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setInt(1, payment.getAppointmentID());
            pst.setDouble(2, payment.getAmount());
            pst.setString(3, payment.getPaymentDate());
            pst.setString(4, payment.getPaymentMethod());
            
            return pst.executeUpdate() > 0;
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return false;
            
        }
        
    }
    
    public ResultSet getAppointmentIDs() {
        
        try {
            
            Connection connection = DBConnection.getConnection();
            
            String sql = "SELECT appointment_ID FROM appointment";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            return pst.executeQuery();
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return null;
            
        }
        
    }
    
    public ResultSet getAllPayments() {
        
        try {
            
            Connection connection = DBConnection.getConnection();
            
            String sql = "SELECT * FROM payment";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            return pst.executeQuery();
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return null;
            
        }
        
    }
    
    public ResultSet searchPayment(int paymentID) {
        
        try {
            
            Connection connection = DBConnection.getConnection();
            
            String sql = "SELECT * FROM payment WHERE payment_ID = ?";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setInt(1, paymentID);
            
            return pst.executeQuery();
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return null;
            
        }
        
    }
    
    public boolean updatePayment(Payment payment) {
        
        try {
            
            Connection connection = DBConnection.getConnection();
            
            String sql = "UPDATE payment SET appointment_ID = ?, amount = ?, payment_date = ?, payment_method = ? WHERE payment_ID = ?";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setInt(1, payment.getAppointmentID());
            pst.setDouble(2, payment.getAmount());
            pst.setString(3, payment.getPaymentDate());
            pst.setString(4, payment.getPaymentMethod());
            pst.setInt(5, payment.getPaymentID());
            
            return pst.executeUpdate() > 0;
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return false;
            
        }
        
    }
    
    public boolean deletePayment(int paymentID) {
        
        try {
            
            Connection connection = DBConnection.getConnection();
            
            String sql = "DELETE FROM payment WHERE payment_ID = ?";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setInt(1, paymentID);
            
            return pst.executeUpdate() > 0;
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return false;
            
        }
        
    }
    
}
