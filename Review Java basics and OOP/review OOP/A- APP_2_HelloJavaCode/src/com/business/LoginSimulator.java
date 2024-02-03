/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.business;

import javax.swing.JOptionPane;

/**
 *
 * @author S.T.M
 */
public class LoginSimulator {
    String [][] database = new String [3][2];
    public LoginSimulator(){
        database[0][0] = "shady"; database[0][1] = "shady@123";
        database[1][0] = "belal"; database[1][1] = "belal@123";
        database[2][0] = "mokhtar"; database[2][1] = "mokhtar@123";
    } 
    public boolean authenticate(String name, String password){
        //search for the user in the array
        for(int index = 0; index<database.length;index++){
            if(database[index][0].equalsIgnoreCase(name) 
            && database[index][1].equals(password))
                return true;
        }
        return false;
    }
    public static void main(String []a){
        LoginSimulator ls = new LoginSimulator();
        String name     = JOptionPane.showInputDialog(null, "Enter your name:");
        String password = JOptionPane.showInputDialog(null, "Enter your Password:");
        boolean result = ls.authenticate(name, password);
        if(result){
            JOptionPane.showMessageDialog(null, "Nice (Y)");
        }else{
            JOptionPane.showMessageDialog(null,"Wrong name / pssword","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
