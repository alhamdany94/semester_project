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

import java.io.Serializable;

class Save2 implements Serializable {
    String sFrom;
    String sTo;
    String sClass;
    String sBookingDate;
    String sTime;
    Integer iPrice;
    Integer iAdult;
    Integer iChildren;
    Integer iInfant;

    public Save2(String var1, String var2, String var3, Integer var4, Integer var5, Integer var6, String var7, Integer var8, String var9) {
        this.sFrom = var1;
        this.sTo = var2;
        this.sClass = var3;
        this.iAdult = var4;
        this.iChildren = var5;
        this.iInfant = var6;
        this.sBookingDate = var7;
        this.iPrice = var8;
        this.sTime = var9;
    }

    public String toString() {
        return this.sFrom + " " + this.sTo + " " + this.sClass + " " + this.iAdult + " " + this.iChildren + " " + this.iInfant + " " + this.sBookingDate + " " + this.iPrice + " " + this.sTime;
    }
}

