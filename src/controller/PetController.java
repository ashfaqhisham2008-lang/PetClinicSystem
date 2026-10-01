/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import database.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Pet;

/**
 *
 * @author ashfa
 */
public class PetController {
    
    public boolean addPet(Pet pet) {
        
        try {
            
            Connection connection = DBConnection.getConnection();
            
            String sql = "INSERT INTO pet (pet_name, pet_type, pet_age, customer_ID) VALUES (?, ?, ?, ?)";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setString(1, pet.getPetName());
            pst.setString(2, pet.getPetType());
            pst.setInt(3, pet.getPetAge());
            pst.setInt(4, pet.getCustomerID());
            
            return pst.executeUpdate() > 0;
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return false;
            
        }
        
    }
    
    public ResultSet getCustomerIDs() {
        
        try {
            
            Connection connection = DBConnection.getConnection();
            
            String sql = "SELECT customer_ID FROM customer";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            return pst.executeQuery();
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return null;
            
        }
        
    }
    
    public ResultSet getAllPets() {
        
        try {
            
            Connection connection = DBConnection.getConnection();
            
            String sql = "SELECT * FROM pet";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            return pst.executeQuery();
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return null;
            
        }
        
    }
    
    public ResultSet searchPet(int petID) {
        
        try {
            
            Connection connection = DBConnection.getConnection();
            
            String sql = "SELECT * FROM pet WHERE pet_ID = ?";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setInt(1, petID);
            
            return pst.executeQuery();
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return null;
            
        }
        
    }
    
    public boolean updatePet(Pet pet) {
        
        try {
            
            Connection connection = DBConnection.getConnection();
            
            String sql = "UPDATE pet SET pet_name=?, pet_type=?, pet_age=?, customer_ID=? WHERE pet_ID=?";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setString(1, pet.getPetName());
            pst.setString(2, pet.getPetType());
            pst.setInt(3, pet.getPetAge());
            pst.setInt(4, pet.getCustomerID());
            pst.setInt(5, pet.getPetID());
            
            return pst.executeUpdate() > 0;
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return false;
            
        }
        
    }
    
    public boolean deletePet(int petID) {
        
        try {
            
            Connection connection = DBConnection.getConnection();
            
            String sql = "DELETE FROM pet WHERE pet_ID=?";
            
            PreparedStatement pst = connection.prepareStatement(sql);
            
            pst.setInt(1, petID);
            
            return pst.executeUpdate() > 0;
            
        } catch (Exception e) {
            
            e.printStackTrace();
            return false;
            
        }
        
    }
    
}
