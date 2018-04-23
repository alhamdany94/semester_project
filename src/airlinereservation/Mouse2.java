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

import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class Mouse2 extends MouseAdapter {
    LoginFelt type;
    boolean bCheck;

    public Mouse2(LoginFelt var1, boolean var2) {
        this.type = var1;
        this.bCheck = var2;
    }

   Mouse2(LoginFelt aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void MouseEntered(MouseEvent var1) {
        this.type.LEconomic1.setCursor(Cursor.getPredefinedCursor(12));
        this.type.LBusiness1.setCursor(Cursor.getPredefinedCursor(12));
    }

    public void MouseClicked(MouseEvent var1) {
        if (this.type.bCheck) {
            if (this.bCheck) {
                this.type.LBusiness1.setVisible(false);
                this.type.LBusiness.setVisible(true);
                this.type.LEconomic.setVisible(false);
                this.type.LEconomic1.setVisible(true);
                this.type.JSP1.setVisible(false);
                this.type.JSP2.setVisible(false);
                this.type.JSP3.setVisible(true);
                this.type.JSP4.setVisible(false);
            } else {
                this.type.LEconomic1.setVisible(false);
                this.type.LBusiness.setVisible(false);
                this.type.LBusiness1.setVisible(true);
                this.type.LEconomic.setVisible(true);
                this.type.JSP1.setVisible(true);
                this.type.JSP2.setVisible(false);
                this.type.JSP3.setVisible(true);
                this.type.JSP4.setVisible(false);
            }
        } else if (this.bCheck) {
            this.type.LBusiness1.setVisible(false);
            this.type.LBusiness.setVisible(true);
            this.type.LEconomic.setVisible(false);
            this.type.LEconomic1.setVisible(true);
            this.type.JSP1.setVisible(false);
            this.type.JSP2.setVisible(false);
            this.type.JSP3.setVisible(false);
            this.type.JSP4.setVisible(true);
        } else {
            this.type.LEconomic1.setVisible(false);
            this.type.LBusiness.setVisible(false);
            this.type.LBusiness1.setVisible(true);
            this.type.LEconomic.setVisible(true);
            this.type.JSP1.setVisible(false);
            this.type.JSP2.setVisible(true);
            this.type.JSP3.setVisible(false);
            this.type.JSP4.setVisible(false);
        }

    }
}

