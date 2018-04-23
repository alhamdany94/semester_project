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

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class LoginFelt extends JFrame {
    Container c = this.getContentPane();
    JPanel PFlightTypes = new JPanel((LayoutManager)null);
    JPanel PLogin = new JPanel((LayoutManager)null);
    JPanel PFlightDetails = new JPanel((LayoutManager)null);
    public boolean bCheck = true;
    JLabel LIndenlandskeRejser = new JLabel("<html><B>Indenlandske Rejser</B></html>");
    JLabel LUdenlandskeRejser = new JLabel("<html><B>Udenlandske Rejser</B></html>");
    JLabel LBrugernavn;
    JLabel LAdgangskode;
    JLabel LIndenlandskeRejser1 = new JLabel("<html><B>Booking Af Indelandske Flyveture</B></html>");
    JLabel LUdenlandskeRejser1 = new JLabel("<html><B>Booking Af Udenlandske Flyveture</B></html>");
    JTextField TFBrugernavn;
    JPasswordField TPAdgangskode;
    JButton BLogin;
    final Object[] col1 = new Object[]{"fra", "Til", "Pris", "Tidspunkt"};
    final Object[] col2 = new Object[]{"fra", "Til", "Pris", "Tidspunkt"};
    final Object[] col3 = new Object[]{"fra", "Til", "Pris", "Tidspunkt"};
    final Object[][] row1 = new Object[][]{{"Kastrup", "Tokyo", "2499,-", "16:30"}, {"Kastrup", "Chennai ", "3225", "19:00"}, {"Kastrup", "Delhi", "1425 ", "08:30"}, {"Kastrup", "Goa", "1025 ", "09:50"}, {"Kastrup", "Hyderabad", "1525", "11:00"}, {"Kastrup", "Kolkata", "3825 ", "05:30"}, {"Kastrup", "Lucknow", "3025 ", "05:30"}, {"Kastrup", "Mumbai", "1725", "12:00"}, {"Kastrup", "Vishakapatnam", "3725", "19:00"}};
    final Object[][] row2 = new Object[][]{{"Billund", "Bali", "21485", "06:20"}, {"Billund", "Bangkok", "9000", "20:45"}, {"Billund", "Cairo", "22975", "10:25"}, {"Billund", "CapeTown", "42500", "16:45"}, {"Billund", "Chicago", "35000", "06:30"}, {"Billund", "Dubai", "12000", "08:15"}, {"Billund", "Frankfurt", "18500", "06:50"}, {"Billund", "HongKong", "20845", "12:00"}, {"Billund", "Istanbul", "22000", "10:45"}, {"Billund", "London", "22600", "14:35"}, {"Billund", "LosAngeles", "35000", "22:00"}, {"Billund", "Melbourne", "27800", "21:15"}, {"Billund", "New York", "32000", "08:50"}, {"Billund", "Paris", "18500", "18:45"}, {"Billund", "Rome", "19900", "20:00"}, {"Billund", "SanFrancisco", "35000", "12:00"}, {"Billund", "shanghai", "24430", "10:15"}, {"Billund", "Singapore", "9000", "21:10"}, {"Billund", "Sydney", "27800", "12:00"}, {"Billund", "Toronto", "35000", "17:00 "}};
    final Object[][] row3 = new Object[][]{{"Aalborg", "Bangalore", "9375", "16:30"}, {"Aalborg", "Chennai ", "9675", "19:00"}, {"Aalborg", "Delhi", "4275", "08:30"}, {"Aalborg", "Goa", "3075", "09:50"}, {"Aalborg", "Hyderabad", "4575", "11:00"}, {"Aalborg", "Kolkata", "11475", "05:30"}, {"Aalborg", "Lucknow", "9075", "05:30"}, {"Aalborg", "Mumbai", "5175", "12:00"}, {"Aalborg", "Vishakapatnam", "11175", "19:00"}};
    final Object[][] row4 = new Object[][]{{"Esbjerg", "Bali", "64455", "06:20"}, {"Esbjerg", "Bangkok", "27000", "20:45"}, {"Esbjerg", "Cairo", "68925", "10:25"}, {"Esbjerg", "CapeTown", "37500", "16:45"}, {"Esbjerg", "Chicago", "105000", "06:30"}, {"Esbjerg", "Dubai", "36000", "08:15"}, {"Esbjerg", "Frankfurt", "55500", "06:50"}, {"Esbjerg", "HongKong", "62535", "12:00"}, {"Esbjerg", "Istanbul", "66000", "10:45"}, {"Esbjerg", "London", "67800", "14:35"}, {"Esbjerg", "LosAngeles", "105000", "22:00"}, {"Esbjerg", "Melbourne", "83400", "21:15"}, {"Esbjerg", "New York", "96000", "08:50"}, {"Esbjerg", "Paris", "55500", "18:45"}, {"Esbjerg", "Rome", "59700", "20:00"}, {"Esbjerg", "SanFrancisco", "105000", "12:00"}, {"Esbjerg", "shanghai", "73290", "10:15"}, {"Esbjerg", "Singapore", "27000", "21:10"}, {"Esbjerg", "Sydney", "83400", "12:00"}, {"Esbjerg", "Toronto", "105000", "17:00"}};
    JTable TDomesticFlight;
    JTable TInternationalFlight;
    JTable TDomesticFlight1;
    JTable TInternationalFlight1;
    JScrollPane JSP1;
    JScrollPane JSP2;
    JScrollPane JSP3;
    JScrollPane JSP4;
    Icon img1;
    Icon img2;
    Icon img3;
    Icon img4;
    JLabel LEconomic;
    JLabel LBusiness;
    JLabel LEconomic1;
    JLabel LBusiness1;

    public LoginFelt() {
        this.TDomesticFlight = new JTable(this.row1, this.col1);
        this.TInternationalFlight = new JTable(this.row2, this.col2);
        this.TDomesticFlight1 = new JTable(this.row3, this.col3);
        this.TInternationalFlight1 = new JTable(this.row4, this.col2);
        this.JSP1 = new JScrollPane(this.TDomesticFlight, 20, 30);
        this.JSP2 = new JScrollPane(this.TInternationalFlight, 20, 30);
        this.JSP3 = new JScrollPane(this.TDomesticFlight1, 20, 30);
        this.JSP4 = new JScrollPane(this.TInternationalFlight1, 20, 30);
        this.img1 = new ImageIcon("img/economic.jpg");
        this.img2 = new ImageIcon("img/business.jpg");
        this.img3 = new ImageIcon("img/economic1.jpg");
        this.img4 = new ImageIcon("img/business1.jpg");
        this.LEconomic = new JLabel("Economic", this.img1, 2);
        this.LBusiness = new JLabel("Business", this.img2, 2);
        this.LEconomic1 = new JLabel("Economic", this.img3, 2);
        this.LBusiness1 = new JLabel("Business", this.img4, 2);
        VindueVærktøj.setNativeLookAndFeel();
        this.setPreferredSize(new Dimension(796, 572));
        this.PFlightTypes.setBackground(Color.white);
        this.PLogin.setBackground(Color.white);
        this.PFlightDetails.setBackground(Color.white);
        this.JSP1.setBounds(0, 340, 790, 200);
        this.JSP2.setBounds(0, 340, 790, 200);
        this.JSP3.setBounds(0, 340, 790, 200);
        this.JSP4.setBounds(0, 340, 790, 200);
        this.PFlightTypes.setBounds(0, 0, 500, 340);
        this.PLogin.setBounds(500, 0, 350, 340);
        this.PFlightDetails.setBounds(0, 340, 790, 200);
        this.LBrugernavn = new JLabel("         Brugernavn ");
        this.LAdgangskode = new JLabel("         Adgangskode ");
        this.TFBrugernavn = new JTextField(10);
        this.TPAdgangskode = new JPasswordField(10);
        this.BLogin = new JButton("Log Ind");
        this.LBrugernavn.setBounds(40, 100, 100, 21);
        this.LAdgangskode.setBounds(40, 140, 100, 21);
        this.TFBrugernavn.setBounds(160, 100, 100, 21);
        this.TPAdgangskode.setBounds(160, 140, 100, 21);
        this.BLogin.setBounds(160, 200, 100, 25);
        this.LIndenlandskeRejser1.setBounds(60, 60, 138, 20);
        this.LUdenlandskeRejser1.setBounds(60, 100, 153, 20);
        this.PLogin.add(this.LBrugernavn);
        this.PLogin.add(this.TFBrugernavn);
        this.PLogin.add(this.LAdgangskode);
        this.PLogin.add(this.TPAdgangskode);
        this.PLogin.add(this.BLogin);
        this.PFlightDetails.add(this.JSP1);
        this.PFlightDetails.add(this.JSP2);
        this.PFlightDetails.add(this.JSP3);
        this.PFlightDetails.add(this.JSP4);
        this.JSP1.setVisible(true);
        this.JSP2.setVisible(false);
        this.JSP3.setVisible(false);
        this.JSP4.setVisible(false);
        this.LBusiness.setBounds(265, 170, 300, 125);
        this.LEconomic.setBounds(0, 170, 250, 125);
        this.LBusiness1.setBounds(280, 200, 135, 60);
        this.LEconomic1.setBounds(50, 200, 147, 60);
        this.PFlightTypes.add(this.LEconomic);
        this.PFlightTypes.add(this.LBusiness);
        this.PFlightTypes.add(this.LEconomic1);
        this.PFlightTypes.add(this.LBusiness1);
        this.LBusiness.setVisible(false);
        this.LEconomic1.setVisible(false);
        this.LBusiness1.setVisible(true);
        this.LEconomic.setVisible(true);
        this.LIndenlandskeRejser.setBounds(60, 60, 100, 25);
        this.LUdenlandskeRejser.setBounds(60, 100, 120, 25);
        this.c.add(this.PFlightTypes);
        this.c.add(this.PLogin);
        this.c.add(this.PFlightDetails);
        this.PFlightTypes.add(this.LIndenlandskeRejser);
        this.PFlightTypes.add(this.LIndenlandskeRejser);
        this.pack();
        this.setVisible(true);
        this.addWindowListener(new Udgang());
        this.LIndenlandskeRejser.addMouseListener(new Mouse1(this, true));
        this.LUdenlandskeRejser.addMouseListener(new Mouse1(this, false));
        this.LIndenlandskeRejser1.addMouseListener(new Mouse3(this, true));
        this.LUdenlandskeRejser.addMouseListener(new Mouse3(this, false));
        this.LBusiness1.addMouseListener(new Mouse2(this, true));
        this.LEconomic1.addMouseListener(new Mouse2(this, false));
        this.BLogin.addActionListener(new Knap1(this));
    }

    public static void main(String[] var0) {
        new LoginFelt();
    }
}
