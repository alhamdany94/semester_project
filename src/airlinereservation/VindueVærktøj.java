/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airlinereservation;

/**
 *
 * @author hamza
 */
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import javax.swing.UIManager;

public class VindueVærktøj {
    public VindueVærktøj() {
    }

    public static void setNativeLookAndFeel() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception var1) {
            System.out.println("Error setting native LAF: " + var1);
        }

    }
}

