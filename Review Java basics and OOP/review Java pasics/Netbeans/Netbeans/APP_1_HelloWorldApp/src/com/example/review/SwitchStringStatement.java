package com.example.review;

import java.util.*;

public class SwitchStringStatement {
    
    public static void main(String args[]){
        Date bd = new Date();
        String color = "Blue";
        String shirt = " Shirt";
        
        switch (color){
            case "Blue":
                shirt = "Blue" + shirt;
                break;
            case "Red":
                shirt = "Red" + shirt;
                break;
            default:
                shirt = "White" + shirt;
        }
        
        System.out.println("Shirt type: " + shirt);
    }
}
