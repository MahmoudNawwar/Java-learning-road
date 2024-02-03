package com.example.review;

public class ForLoop {
    
    public static void main(String args[]){
        
        for (int i = 0; i < 9;  i++ ){
            System.out.println("i: " + i);
        }
        
        
        //For each
        String[] names = {"Ahmed", "Ali", "Shady"};
        for (int i = 0; i < 3;  i++ ){
            System.out.println("name: " + names[i]);
        }
        for(String str:names){
            System.out.println(">>>"+str);
        }
        int i=0;
        int [] nums ={100,200,300};
        while(i<nums.length){
            System.out.println("@@@@@@@"+nums[i]);
            i++;
        }
        //////////3
        int x=0;
        do{
            System.out.println("##"+nums[x]);
            x++;
        }while(x<nums.length);
        
    }        
}
