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

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class Knap1 implements ActionListener {
    LoginFelt type;
    char[] cCheck;
    char[] cPassword = new char[]{'a', 'd', 'm', 'i', 'n', '\u0000'};
    JFrame f;
    String sCheck;
    String sCheck1 = "admin";

    public Knap1(LoginFelt var1) {
        this.type = var1;
    }

    Knap1(LoginFelt aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void actionPerformed(ActionEvent var1) {
        this.cCheck = this.type.TPPassword.getPassword();
        this.sCheck = this.type.TFUserName.getText();
        if (this.sCheck1.equals(this.sCheck) && this.check()) {
            this.type.PLogin.add(this.type.LIndenlandskeRejser1);
            this.type.PLogin.add(this.type.LInternationaleRejser1);
            this.type.PLogin.remove(this.type.LUserName);
            this.type.PLogin.remove(this.type.TFUserName);
            this.type.PLogin.remove(this.type.LPassword);
            this.type.PLogin.remove(this.type.TPPassword);
            this.type.PLogin.remove(this.type.BLogin);
            this.type.c.repaint();
        } else {
            JOptionPane.showMessageDialog((Component)null, "Invalid username or password. Try again");
        }

    }

    public boolean check() {
        if (this.cCheck.length < 6 && this.cCheck.length >= 4) {
            for(int var1 = 0; var1 <= 4; ++var1) {
                if (this.cCheck[var1] != this.cPassword[var1]) {
                    return false;
                }
            }

            return true;
        } else {
            return false;
        }
    }
}

