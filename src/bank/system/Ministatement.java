/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.system;



import java.sql.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Asus
 */
public class Ministatement extends JFrame implements ActionListener {
        JButton b1;
    JButton b2;
    JLabel l1;

    String Pins;
    Ministatement(String Pins)
    {
        
       
        super("Mini Statement");
         this.Pins=Pins;
        this.getContentPane().setBackground(Color.WHITE);
        this.setSize(400, 600);
        this.setLocation(20, 20);
        this.l1 = new JLabel();
        this.add(this.l1);
        JLabel l2 = new JLabel("Indian Bank");
        l2.setBounds(150, 20, 100, 20);
        this.add(l2);
        JLabel l3 = new JLabel();
        l3.setBounds(20, 80, 300, 20);
        this.add(l3);
        JLabel l4 = new JLabel();
        l4.setBounds(20, 400, 300, 20);
        this.add(l4);

        try {
            coonect c = new coonect();
            ResultSet rs = c.s.executeQuery("select * from login where pin = '" + Pins + "'");

            while(rs.next()) {
                l3.setText("Card Number:    " + rs.getString("cardno").substring(0, 4) + "XXXXXXXX" + rs.getString("cardno").substring(12));
            }
        } catch (Exception var9) {
        }

        try {
            int balance = 0;
             coonect c = new coonect();
            ResultSet rs = c.s.executeQuery("SELECT * FROM bank where pin = '" + Pins + "'");

            while(rs.next()) {
                this.l1.setText(this.l1.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("Amount") + "<br><br><html>");
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("Amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("Amount"));
                }
            }

            l4.setText("Your total Balance is Rs " + balance);
        } catch (Exception ae) {
           System.out.println(ae);
        }

        this.setLayout((LayoutManager)null);
        this.b1 = new JButton("Exit");
        this.add(this.b1);
        this.b1.addActionListener(this);
        this.l1.setBounds(20, 140, 400, 200);
        this.b1.setBounds(20, 500, 100, 25);
    }
     public static void main(String args[]){
    new Ministatement("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
   if(e.getSource()==b1){setVisible(false);
   new Tran(Pins).setVisible(true);}
    
    }
}
