/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ashfa
 */
public class Payment {
    
    private int paymentID;
    private int appointmentID;
    private double amount;
    private String paymentDate;
    private String paymentMethod;
    
    public Payment() {
        
    }
    
    public Payment(int paymentID, int appointmentID, double amount, String paymentDate, String paymentMethod) {
        
        this.paymentID = paymentID;
        this.appointmentID = appointmentID;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
        
    }
    
    public int getPaymentID() {
        
        return paymentID;
        
    }
    
    public void setPaymentID(int paymentID) {
        
        this.paymentID = paymentID;
        
    }
    
    public int getAppointmentID() {
        
        return appointmentID;
        
    }
    
    public void setAppointmentID(int appointmentID) {
        
        this.appointmentID = appointmentID;
        
    }
    
    public double getAmount() {
        
        return amount;
        
    }
    
    public void setAmount(double amount) {
        
        this.amount = amount;
        
    }
    
    public String getPaymentDate() {
        
        return paymentDate;
        
    }
    
    public void setPaymentDate(String paymentDate) {
        
        this.paymentDate = paymentDate;
        
    }
    
    public String getPaymentMethod() {
        
        return paymentMethod;
        
    }
    
    public void setPaymentMethod(String paymentMethod) {
        
        this.paymentMethod = paymentMethod;
        
    }
    
}
