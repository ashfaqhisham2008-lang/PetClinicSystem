/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ashfa
 */
public class Pet {
    
    private int petID;
    private String petName;
    private String petType;
    private int petAge;
    private int customerID;
    
    public Pet() {
        
    }
    
    public Pet(int petID, String petName, String petType, int petAge, int customerID) {
        
        this.petID = petID;
        this.petName = petName;
        this.petType = petType;
        this.petAge = petAge;
        this.customerID = customerID;
        
    }
    
    public int getPetID() {
        
        return petID;
        
    }
    
    public void setPetID(int petID) {
        
        this.petID = petID;
        
    }
    
    public String getPetName() {
        
        return petName;
        
    }
    
    public void setPetName(String petName) {
        
        this.petName = petName;
        
    }
    
    public String getPetType() {
        
        return petType;
        
    }
    
    public void setPetType(String petType) {
        
        this.petType = petType;
        
    }
    
    public int getPetAge() {
        
        return petAge;
        
    }
    
    public void setPetAge(int petAge) {
        
        this.petAge = petAge;
        
    }
    
    public int getCustomerID() {
        
        return customerID;
        
    }
    
    public void setCustomerID(int customerID) {
        
        this.customerID = customerID;
        
    }
    
}
