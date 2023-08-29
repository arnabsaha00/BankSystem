/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Tran  extends JFrame implements ActionListener {
    JButton depo,Withdraw,Fastcash,Minis,Pinc,Bale,Exit;
    String Pins;
    Tran(String Pins)
    {
        this.Pins=Pins;
        setLayout(null);
       ImageIcon  img1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2= img1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);add(image);
         image.setBounds(0,0,900,900);
        JLabel text =new JLabel("Please Select Your Transaction");
        text.setBounds(210,300,700,35);text.setForeground(Color.WHITE);
        text.setFont (new Font("System",Font.BOLD,16));
image.add(text);
     depo= new JButton("Deposit");
    depo.setBounds(170,415,150,30);
    depo.addActionListener(this);
    image.add(depo);
    
         Withdraw= new JButton("Withdraw");
        Withdraw.setBounds(355,415,150,30);
        Withdraw.addActionListener(this);
        image.add(Withdraw);

         Fastcash= new JButton("FastCash");
        Fastcash.setBounds(170,455,150,30);
        Fastcash.addActionListener(this);
        image.add(Fastcash);

         Minis= new JButton("Mini Statement");
        Minis.setBounds(355,455,150,30);
        Minis.addActionListener(this);
        image.add(Minis);

         Pinc= new JButton("Pin Change");
        Pinc.setBounds(170,485,150,30);
        Pinc.addActionListener(this);
        image.add(Pinc);
        
         Bale= new JButton("Balance Enquirey");
        Bale.setBounds(355,485,150,30);
        Bale.addActionListener(this);
        image.add(Bale);

         Exit= new JButton(" Exit");
        Exit.setBounds(355,520,150,30);
        Exit.addActionListener(this);
        image.add(Exit);

      
        setSize(900,900);//fra me length and width1
        setVisible(true);//to see the frame on screen it's by default false
        setLocation(300,00);
        setUndecorated(true);
        

    }

    public static void main(String args[]){

        new Tran("");}

    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Exit){
            System.exit(0);}
           else if(e.getSource()==depo){setVisible(false);
            new Deposit(Pins).setVisible(true);}
            else if(e.getSource()==Withdraw){setVisible(false);
            new Withs(Pins).setVisible(true);}
      else  if(e.getSource()==Fastcash){setVisible(false);
            new Fastcash(Pins).setVisible(true);}
     else   if(e.getSource()==Pinc){setVisible(false);
            new Pinc(Pins).setVisible(true);}
      else   if(e.getSource()==Bale){setVisible(false);
            new Blnce(Pins).setVisible(true);}
        else   if(e.getSource()==Minis){setVisible(false);
            new Ministatement(Pins).setVisible(true);}
    }
}
