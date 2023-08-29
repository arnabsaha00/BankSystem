/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.system;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import java.util.Date;

public class Fastcash  extends JFrame implements ActionListener {
    JButton depo,Withdraw,Fastcash,Minis,Pinc,Bale,Exit;
    String Pins;
    Fastcash(String Pins)
    {
        this.Pins=Pins;
        setLayout(null);
       ImageIcon  img1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2= img1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);add(image);
         image.setBounds(0,0,900,900);
        JLabel text =new JLabel("Select Withdrawl Amount");
        text.setBounds(210,300,700,35);text.setForeground(Color.WHITE);
        text.setFont (new Font("System",Font.BOLD,16));
image.add(text);
     depo= new JButton("Rs 100");
    depo.setBounds(160,420,150,30);
    depo.addActionListener(this);
    image.add(depo);
    
         Withdraw= new JButton("Rs 500");
        Withdraw.setBounds(365,420,150,30);
        Withdraw.addActionListener(this);
        image.add(Withdraw);

         Fastcash= new JButton("Rs 200");
        Fastcash.setBounds(160,455,150,30);
        Fastcash.addActionListener(this);
        image.add(Fastcash);

         Minis= new JButton("Rs 1000");
        Minis.setBounds(365,455,150,30);
        Minis.addActionListener(this);
        image.add(Minis);

         Pinc= new JButton("Rs 1500");
        Pinc.setBounds(160,485,150,30);
        Pinc.addActionListener(this);
        image.add(Pinc);
        
         Bale= new JButton("Rs 2000");
        Bale.setBounds(365,485,150,30);
        Bale.addActionListener(this);
        image.add(Bale);

         Exit= new JButton(" Back");
        Exit.setBounds(365,520,150,30);
        Exit.addActionListener(this);
        image.add(Exit);

      
        setSize(900,900);//fra me length and width1
        setVisible(true);//to see the frame on screen it's by default false
        setLocation(300,00);
        setUndecorated(true);
        

    }

    public static void main(String args[]){

    new Fastcash("");
    }

    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Exit){
            setVisible(false);
        new Tran(Pins).setVisible(true);}
            else{
             String am=((JButton)e.getSource()).getText().substring(3);
             coonect c = new coonect();
             try{
             ResultSet rr= c.s.executeQuery("Select * from bank where pin='"+Pins+"'");
             int bal=0;
             while(rr.next()){
             if(rr.getString("type").equals("Deposit")){
             bal+=Integer.parseInt(rr.getString("Amount"));
             }
             else {
             bal-=Integer.parseInt(rr.getString("Amount"));}
             }
             
             if(e.getSource()!=Exit && bal<Integer.parseInt(am)){
             JOptionPane.showMessageDialog(null, "Insuficient Balance");
           return;  }
             Date date=new Date();
             String query="insert into bank values('"+Pins+"','"+date+"','Withdraw','"+am+"')";
             c.s.executeUpdate(query);
              JOptionPane.showMessageDialog(null, "Rs "+am+" Debited successfully");
              
              setVisible(false);
              new Tran(Pins).setVisible(true);
             }
              
             catch(Exception ae){
             System.out.println(ae);
             }
            }
        
    }
}

