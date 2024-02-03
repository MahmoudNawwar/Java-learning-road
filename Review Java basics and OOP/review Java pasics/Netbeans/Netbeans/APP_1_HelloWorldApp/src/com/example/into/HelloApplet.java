/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.into;

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author PhD
 */
public class HelloApplet extends Applet {

    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    public void paint(Graphics g){
       g.drawString("Hello Java World", 100, 150);
    }
   
}
