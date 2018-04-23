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
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UdenlandskeRejser extends JFrame {
    JComboBox CBFrom;
    JComboBox CBTo;
    JComboBox CBClass;
    JComboBox CBAdult;
    JComboBox CBChildren;
    JComboBox CBInfant;
    JLabel LFrom;
    JLabel LTo;
    JLabel LBookingDate;
    JLabel LClass;
    JLabel LAdult;
    JLabel LChildren;
    JLabel LInfant;
    JLabel LBookingDetails;
    JLabel LPassengerDetails;
    JLabel LDate;
    JLabel LImg1;
    JLabel LImg2;
    JLabel LNotes;
    JTextField TFBookingDate;
    Icon img1;
    Icon img2;
    JButton BFindFlight;
    JPanel PPanel1;
    JPanel PPanel2;
    LoginFelt type1;

    public UdenlandskeRejser(LoginFelt var1) {
        Container var2 = this.getContentPane();
        var2.setLayout(new BorderLayout());
        String[] var3 = new String[]{"Kastrup","Billund", "Aalborg","Esbjerg"};
        String[] var4 = new String[]{"Tokyo", "Madrid", "Hurghada", "Johannesburg", "LosAngeles", "Abu Dhabi", "Stutgart", "Beijing", "Antalya", "Birmingham", "Mecca", "Guantanama", "New Jersey", "Torino", "Stockholm", "Singapore", "Dublin", "Moskva", "Sydney", "Monaco", "Oslo", "Jerusalem"};
        String[] var5 = new String[]{"Economic", "Business"};
        this.type1 = var1;
        this.PPanel1 = new JPanel((LayoutManager)null);
        this.PPanel1.setPreferredSize(new Dimension(500, 200));
        this.LBookingDetails = new JLabel("<html><b><font color=\"#C71585\">Booking Oplysninger</font></b></html>");
        this.LFrom = new JLabel("Fra          :");
        this.LTo = new JLabel("Til               :");
        this.LBookingDate = new JLabel("Booking Dato:");
        this.LClass = new JLabel("Class         :");
        this.CBFrom = new JComboBox(var3);
        this.CBTo = new JComboBox(var4);
        this.CBClass = new JComboBox(var5);
        this.TFBookingDate = new JTextField(10);
        this.LDate = new JLabel("(DD/MM/ÅÅÅÅ)");
        this.LDate.setForeground(Color.red);
        this.img1 = new ImageIcon("map1.jpg");
        this.LImg1 = new JLabel(this.img1);
        this.BFindFlight = new JButton("Find Flytur");
        this.LBookingDetails.setBounds(20, 3, 100, 20);
        this.LFrom.setBounds(20, 40, 100, 20);
        this.CBFrom.setBounds(100, 40, 100, 20);
        this.LTo.setBounds(20, 100, 100, 20);
        this.CBTo.setBounds(100, 100, 100, 20);
        this.LBookingDate.setBounds(14, 160, 100, 20);
        this.TFBookingDate.setBounds(100, 160, 100, 20);
        this.LDate.setBounds(210, 160, 100, 20);
        this.LClass.setBounds(20, 220, 100, 20);
        this.CBClass.setBounds(100, 220, 100, 20);
        this.BFindFlight.setBounds(50, 270, 100, 25);
        this.LImg1.setBounds(0, 290, 495, 260);
        this.PPanel1.add(this.LBookingDetails);
        this.PPanel1.add(this.LFrom);
        this.PPanel1.add(this.CBFrom);
        this.PPanel1.add(this.LTo);
        this.PPanel1.add(this.CBTo);
        this.PPanel1.add(this.LBookingDate);
        this.PPanel1.add(this.TFBookingDate);
        this.PPanel1.add(this.LDate);
        this.PPanel1.add(this.LClass);
        this.PPanel1.add(this.CBClass);
        this.PPanel1.add(this.BFindFlight);
        this.PPanel1.add(this.LImg1);
        this.PPanel1.setBackground(Color.white);
        var2.add(this.PPanel1, "West");
        this.PPanel2 = new JPanel((LayoutManager)null);
        this.PPanel2.setPreferredSize(new Dimension(320, 160));
        this.LPassengerDetails = new JLabel("<html><b><font color=\"#C71585\">PassagerOplysninger</font></b></html>");
        this.LAdult = new JLabel("Voksen(12+)");
        this.LChildren = new JLabel("Barn(2-11)");
        this.LInfant = new JLabel("Spedbarn(under 2)");
        String[] var6 = new String[]{"1", "2", "3", "4", "5", "6"};
        this.CBAdult = new JComboBox(var6);
        String[] var7 = new String[]{"0", "1", "2", "3", "4"};
        this.CBChildren = new JComboBox(var7);
        String[] var8 = new String[]{"0", "1", "2", "3"};
        this.CBInfant = new JComboBox(var8);
        this.img2 = new ImageIcon("note_bg.gif");
        this.LImg2 = new JLabel(this.img2);
        this.LNotes = new JLabel("<html><body><p>NOTE: Bookings with International Credit Cards <p> have temporarily been suspended.This Service<p> will resume shortly and we will have a notice<p> posted on our website.We regret any <p>inconvenience caused to our passengers.</body></html>");
        this.LPassengerDetails.setBounds(40, 3, 100, 20);
        this.LAdult.setBounds(40, 40, 100, 20);
        this.CBAdult.setBounds(140, 40, 100, 20);
        this.LChildren.setBounds(40, 105, 100, 20);
        this.CBChildren.setBounds(140, 105, 100, 20);
        this.LInfant.setBounds(40, 170, 100, 20);
        this.CBInfant.setBounds(140, 170, 100, 20);
        this.LImg2.setBounds(16, 220, 320, 200);
        this.LNotes.setBounds(55, 240, 380, 180);
        this.PPanel2.add(this.LPassengerDetails);
        this.PPanel2.add(this.LAdult);
        this.PPanel2.add(this.LChildren);
        this.PPanel2.add(this.LInfant);
        this.PPanel2.add(this.CBAdult);
        this.PPanel2.add(this.CBChildren);
        this.PPanel2.add(this.CBInfant);
        this.PPanel2.add(this.LNotes);
        this.PPanel2.add(this.LImg2);
        this.PPanel2.setBackground(Color.white);
        var2.add(this.PPanel2, "East");
        this.setSize(795, 580);
        this.setVisible(true);
        this.BFindFlight.addActionListener(new Knap2(this, var1));
    }

    public static void main(String[] var0) {
        Object var1 = null;
        new UdenlandskeRejser((LoginFelt)var1);
    }
}

