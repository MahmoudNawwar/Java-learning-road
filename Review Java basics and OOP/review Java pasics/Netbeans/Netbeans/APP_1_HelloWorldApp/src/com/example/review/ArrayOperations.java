package com.example.review;

public class ArrayOperations {
    
    public static void main(String args[]){
        
        String[] names = new String[3];
        
        names[0] = "Blue Shirt";
        names[1] = "Red Shirt";
        names[2] = "Black Shirt";
        for(String x:names)
            System.out.println(">>"+x);
    }
}
