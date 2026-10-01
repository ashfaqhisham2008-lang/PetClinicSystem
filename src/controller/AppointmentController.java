/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Appointment;
import java.sql.ResultSet;

/**
 *
 * @author ashfa
 */
public class AppointmentController {
    
    public boolean addAppointment(Appointment appointment) {
        
        try {
            
            Connection connection = DBConnection.getConnection();
            
            String sql = "INSERT INTO appointment (pet_ID, appointment_date, appointment_time, service_type) VALUES (?, ?, ?, ?)";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setInt(1, appointment.getPetID());
            pst.setString(2, appointment.getAppointmentDate());
            pst.setString(3, appointment.getAppointmentTime());
            pst.setString(4, appointment.getReason());
            
            return pst.executeUpdate() > 0;
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return false;
            
        }
        
    }
    
    public ResultSet getPetIDs() {
        
        try {
            
            Connection connection = DBConnection.getConnection();
            
            String sql = "SELECT pet_ID FROM pet";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            return pst.executeQuery();
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return null;
            
        }
        
    }
    
    public ResultSet getAllAppointments() {
        
        try {
            
            Connection connection = DBConnection.getConnection();
            
            String sql = "SELECT * FROM appointment";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            return pst.executeQuery();
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return null;
            
        }
        
    }
    
    public ResultSet searchAppointment(int appointmentID) {
        
        try {
            
            Connection connection = DBConnection.getConnection();
            
            String sql = "SELECT * FROM appointment WHERE appointment_ID = ?";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setInt(1, appointmentID);
            
            return pst.executeQuery();
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return null;
            
        }
        
    }
    
    public boolean updateAppointment(Appointment appointment) {
        
        try {
            
            Connection connection = DBConnection.getConnection();
            
            String sql = "UPDATE appointment SET pet_ID = ?, appointment_date = ?, appointment_time = ?, service_type = ? WHERE appointment_ID = ?";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setInt(1, appointment.getPetID());
            pst.setString(2, appointment.getAppointmentDate());
            pst.setString(3, appointment.getAppointmentTime());
            pst.setString(4, appointment.getReason());
            pst.setInt(5, appointment.getAppointmentID());    
            
            return pst.executeUpdate() > 0;
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return false;
            
        }
        
    }
    
    public boolean deleteAppointment(int appointmentID) {
        
        try {
            
            Connection connection = DBConnection.getConnection();
            
            String sql = "DELETE FROM appointment WHERE appointment_ID = ?";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setInt(1, appointmentID);
            
            return pst.executeUpdate() > 0;
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return false;
            
        }
        
    }
    
}
