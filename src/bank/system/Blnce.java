
package bank.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
public class Blnce extends JFrame implements ActionListener{
    String Pins;
    JButton back;
    Blnce(String Pins){
        
    this.Pins=Pins;
        setLayout(null);
         ImageIcon  img1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2= img1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);add(image);
         image.setBounds(0,0,900,900);

     back=new JButton("Back");
     back.setBounds(355,520,150,30);
      back.addActionListener(this);
      back.setForeground(Color.BLACK);
        image.add(back);
        
        coonect c = new coonect();  int bal=0;
        try{
             ResultSet rr= c.s.executeQuery("Select * from bank where pin='"+Pins+"'");
           
             while(rr.next()){
             if(rr.getString("type").equals("Deposit")){
             bal+=Integer.parseInt(rr.getString("Amount"));
             }
             else {
             bal-=Integer.parseInt(rr.getString("Amount"));}
             }}
        catch(Exception ae){System.out.println(ae);
        }
        JLabel text=new JLabel("Current Balance is Rs. "+bal);
        text.setForeground(Color.WHITE);
        text.setBounds(200,300,400,30);
        image.add(text);
        
        
        
         setSize(900,900);//fra me length and width1
        setVisible(true);//to see the frame on screen it's by default false
        setLocation(300,00);
        setUndecorated(true);
    
    }
    public static void main(String args[]){
    new Blnce("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    setVisible(false);
    new Tran(Pins).setVisible(true);
    }
}
