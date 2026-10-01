/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ashfa
 */
public class Appointment {
    
    private int appointmentID;
    private int petID;
    private String appointmentDate;
    private String appointmentTime;
    private String reason;
    
    public Appointment() {
        
    }
    
    public Appointment(int appointmentID, int petID, String appointmentDate, String appointmentTime, String reason) {
        
        this.appointmentID = appointmentID;
        this.petID = petID;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.reason = reason;
        
    }
    
    public int getAppointmentID() {
        
        return appointmentID;
        
    }
    
    public void setAppointmentID(int appointmentID) {
        
        this.appointmentID = appointmentID;
        
    }
    
    public int getPetID() {
        
        return petID;
    
    }
    
    public void setPetID(int petID) {
        
        this.petID = petID;
        
    }
    
    public String getAppointmentDate() {
        
        return appointmentDate;
        
    }
    
    public void setAppointmentDate(String appointmentDate) {
        
        this.appointmentDate = appointmentDate;
        
    }
    
    public String getAppointmentTime() {
        
        return appointmentTime;
        
    }
    
    public void setAppointmentTime(String appointmentTime) {
        
        this.appointmentTime = appointmentTime;
        
    }
    
    public String getReason() {
        
        return reason;
        
    }
    
    public void setReason(String reason) {
        
        this.reason = reason;
        
    }
    
}
