/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author S.T.M
 */
public class MyTest {
    public static void main(String []a){
        SingletonClass ref1 = SingletonClass.getAnObject();
        SingletonClass ref2 = SingletonClass.getAnObject();
        if(ref1 == ref2){
            System.out.println("yessssssss");
        }else{
            System.out.println("Nooooooooo");
        }
    }
}
