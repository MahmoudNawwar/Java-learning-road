package com.example;

public class SingletonClass {
   private int x;
   private String name;
   private static final SingletonClass sl = new SingletonClass();
   private SingletonClass(){
       
   }
   public static SingletonClass getAnObject(){
       return sl;
   }

    
}