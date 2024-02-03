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
public class CalculatorUsingSwitch {
    /**
     * Calculator
     * mathod to simulate a calculator
     */
    public static void main(String[]a){
        float x = 0f, y=0;
        char op = ' ';
        float result = -1 ;
        char cont = 'y';
        do{
            String temp = JOptionPane.showInputDialog(null,"X = ");
        x = Integer.parseInt(temp);
        
        temp = JOptionPane.showInputDialog(null,"Y = ");
        y = Integer.parseInt(temp);
        
        temp = JOptionPane.showInputDialog(null," Operator= ");
        
        op = temp.charAt(0);
        
        
        switch (op){
            case '+':
                System.out.println("Addition Operation");
                result = x+y;
                break;
            case '-':
                System.out.println("Subtraction Operation");
                result = x - y;
                break;
            case '/':
                System.out.println("Addition Operation");
                result = x/y;
                break;
            case '*':
                System.out.println("Subtraction Operation");
                result = x * y;
                break;
            default:
                System.out.println("ERROR");
        }
        System.out.println("result = "+ result);
        JOptionPane.showMessageDialog(null, x +" "+ op +" "+ y +" = "+ result);
        cont = JOptionPane.showInputDialog(null, "To continue press <Y>").charAt(0);
        //we may make the string to upper and compare only with Y
        }while(cont == 'y' || cont == 'Y');
        
    }
    
}
