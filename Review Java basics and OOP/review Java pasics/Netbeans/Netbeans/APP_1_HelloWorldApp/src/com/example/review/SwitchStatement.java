package com.example.review;

public class SwitchStatement {

    public static void main(String args[]){
        
        int color = 1;
        String shirt = " Shirt";
        
        switch (color){
            case 1:
                shirt = "Blue" + shirt;
                
            case 2:
                shirt = "Red" + shirt;
                
            case 3: 
                shirt = "Tan" + shirt;
                
            default:
                shirt = "White" + shirt;
        }
        
        System.out.println("Shirt type: " + shirt);
    }
}
