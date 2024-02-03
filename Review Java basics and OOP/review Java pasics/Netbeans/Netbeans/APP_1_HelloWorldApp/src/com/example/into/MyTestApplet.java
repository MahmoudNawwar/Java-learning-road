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
 * @author S.T.M
 */
public class MyTestApplet extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    public void paint(Graphics g){
       g.drawString("Hii", 100, 100);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
