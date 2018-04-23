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

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PrintBillet extends JFrame {
    public PrintBillet(String var1, String var2, String var3, Integer var4, Integer var5, Integer var6, String var7, Integer var8, String var9) {
        Container var10 = this.getContentPane();
        var10.setLayout(new BorderLayout());
        JPanel var11 = new JPanel((LayoutManager)null);
        var11.setPreferredSize(new Dimension(500, 200));
        JLabel var12 = new JLabel("<html><b><font color=\"#C71585\",size=\"7\">AirLine Ticket</font></b></html>");
        JLabel var13 = new JLabel("<html><b><font color=\"#000000\">From &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font></b><font color=\"#778899\">" + var1 + "</font></html>");
        JLabel var14 = new JLabel("<html><font color=\"#000000\">To &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">" + var2 + "</font></html>");
        JLabel var15 = new JLabel("<html><font color=\"#000000\">Class &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">" + var3 + "</font></html>");
        JLabel var16 = new JLabel("<html><font color=\"#000000\">Traveling Date &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#778899\">" + var7 + "</font></html>");
        JLabel var17 = new JLabel("<html><font color=\"#000000\">Total Price &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#778899\">" + var8 + "</font></html>");
        JLabel var18 = new JLabel("<html><font color=\"#000000\">DepatureTime  &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;:&nbsp;</font><font color=\"#778899\">" + var9 + "</font></html>");
        JLabel var19 = new JLabel("<html><font color=\"#000000\">Adult &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">" + var4 + "</font></html>");
        JLabel var20 = new JLabel("<html><font color=\"#000000\">Children &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; : &nbsp;</font><font color=\"#778899\">" + var5 + "</font></html>");
        JLabel var21 = new JLabel("<html><font color=\"#000000\">Infant &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font><font color=\"#778899\">" + var6 + "</font></html>");
        JLabel var22 = new JLabel("<html><body><I><font color=\"#D2B48C\">Wish you a happy journy</font></I></body></html>");
        JLabel var23 = new JLabel("<html><font color=\"#000000\">TicketNumber &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font></html>");
        JLabel var24 = new JLabel("<html><font color=\"#000000\">BookedBy &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;: &nbsp;</font></html>");
        JLabel var25 = new JLabel("---------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        JLabel var26 = new JLabel("<html><U><font color=\"#8FBC8F\">AirLine-Project Developed By</font></U></html>");
        JLabel var27 = new JLabel("<html><I><font color=\"#8FBC8F\">R Franklin Bourgia Singh</font></I></html>");
        JLabel var28 = new JLabel("<html><I><font color=\"#8FBC8F\">V.R Ravi Sankar</font></I></html>");
        JLabel var29 = new JLabel("<html><I><font color=\"#8FBC8F\">B Mayuran</font></I></html>");
        JLabel var30 = new JLabel("<html><I><font color=\"#8FBC8F\">Sathyaraj</font></I></html>");
        var12.setBounds(170, 15, 500, 45);
        var13.setBounds(20, 80, 300, 20);
        var14.setBounds(20, 125, 300, 20);
        var15.setBounds(20, 170, 300, 20);
        var16.setBounds(20, 215, 300, 20);
        var17.setBounds(20, 260, 300, 20);
        var18.setBounds(20, 305, 300, 20);
        var19.setBounds(20, 345, 300, 20);
        var20.setBounds(20, 385, 300, 20);
        var21.setBounds(20, 430, 300, 20);
        var22.setBounds(530, 435, 300, 20);
        var23.setBounds(320, 80, 300, 20);
        var24.setBounds(320, 125, 300, 20);
        var25.setBounds(3, 445, 1000, 20);
        var26.setBounds(280, 465, 300, 20);
        var27.setBounds(285, 485, 300, 20);
        var28.setBounds(285, 505, 300, 20);
        var29.setBounds(285, 525, 300, 20);
        var30.setBounds(285, 545, 300, 20);
        var11.add(var12);
        var11.add(var13);
        var11.add(var14);
        var11.add(var15);
        var11.add(var16);
        var11.add(var19);
        var11.add(var20);
        var11.add(var21);
        var11.add(var17);
        var11.add(var18);
        var11.add(var22);
        var11.add(var23);
        var11.add(var24);
        var11.add(var25);
        var11.add(var26);
        var11.add(var27);
        var11.add(var28);
        var11.add(var29);
        var11.add(var30);
        var11.setBackground(Color.white);
        var10.add(var11, "Center");
        this.setSize(700, 650);
        this.setVisible(true);
    }
}

