/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.system;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
/**
 *
 * @author Asus
 */
public class Signup3  extends JFrame  implements ActionListener{
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
Signup3(String formno){
setLayout(null);
 JLabel li= new JLabel("Page3: Account Details ");
 li.setFont(new Font("Raleway",Font.BOLD,21));
 li.setBounds(280,40,400,40);add(li);
 
 JLabel Type= new JLabel("Account Type ");
 Type.setFont(new Font("Raleway",Font.BOLD,21));
 Type.setBounds(120,120,200,40);add(Type);
 
 r1= new JRadioButton(" Savings Accunt");
 r1.setFont(new Font("Raleway",Font.BOLD,16));
 r1.setBackground(Color.WHITE);
 r1.setBounds(100,180,150,20);
 add(r1);
 
 r2= new JRadioButton(" Current Account");
 r2.setFont(new Font("Raleway",Font.BOLD,16));
 r2.setBackground(Color.WHITE);
 r2.setBounds(350,180,180,20);
 add(r2);
 
 r3= new JRadioButton(" Fixed Deposit Account");
 r3.setFont(new Font("Raleway",Font.BOLD,16));
 r3.setBackground(Color.WHITE);
 r3.setBounds(100,220,210,20);
 add(r3);
 r4= new JRadioButton(" Recurring Deposit Account");
 r4.setFont(new Font("Raleway",Font.BOLD,16));
 r4.setBackground(Color.WHITE);
 r4.setBounds(350,220,240,20);
 add(r4);
 
 JLabel card= new JLabel("Card Number: ");
 card.setFont(new Font("Raleway",Font.BOLD,21));
 card.setBounds(120,270,200,40);add(card);
 
 JLabel num= new JLabel("XXXX-XXXX-XXXX-4184 ");
 num.setFont(new Font("Raleway",Font.BOLD,21));
 num.setBounds(300,272,300,40);add(num);
 
 JLabel cards= new JLabel("Your 16 Digit Card Number: ");
 cards.setFont(new Font("Raleway",Font.BOLD,11));
 cards.setBounds(120,310,300,40);add(cards);
 
 JLabel pin= new JLabel("PIN: ");
 pin.setFont(new Font("Raleway",Font.BOLD,21));
 pin.setBounds(120,350,200,40);add(pin);
 
 JLabel pnum= new JLabel("XXXX ");
 pnum.setFont(new Font("Raleway",Font.BOLD,21));
 pnum.setBounds(300,350,300,40);add(pnum);
 
 JLabel ps= new JLabel("Your 4 Digit Password: ");
 ps.setFont(new Font("Raleway",Font.BOLD,11));
 ps.setBounds(120,390,300,40);add(ps);
 
 JLabel serv= new JLabel("Services Required: ");
 serv.setFont(new Font("Raleway",Font.BOLD,21));
 serv.setBounds(120,440,300,40);add(serv);
 
 c1=new JCheckBox("ATM CARD");
 c1.setBackground(Color.WHITE);
 c1.setFont(new Font("Raleway",Font.BOLD,16 ));
 c1.setBounds(120,500,200,30);
 add(c1);
 
        c2=new JCheckBox("Pin Change");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,16 ));
        c2.setBounds(350,500,200,30);
        add(c2);
 
 c3=new JCheckBox("Net Banking");
 c3.setBackground(Color.WHITE);
 c3.setFont(new Font("Raleway",Font.BOLD,16 ));
 c3.setBounds(120,550,200,30);
 add(c3);
 
        c4=new JCheckBox("Mobile Banking");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,16 ));
        c4.setBounds(350,550,200,30);
        add(c4);
 
 c5=new JCheckBox("Email & Sms Alearts");
 c5.setBackground(Color.WHITE);
 c5.setFont(new Font("Raleway",Font.BOLD,16 ));
 c5.setBounds(120,600,200,30);
 add(c5);
 
        c6=new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,16 ));
        c6.setBounds(350,600,200,30);
        add(c6);
        c7=new JCheckBox("I hereby Notify that the above entered details are correct.");
 c7.setBackground(Color.WHITE);
  c7.setFont(new Font("Raleway",Font.BOLD,16 ));
 c7.setBounds(200,650,600,30);add(c7);add(c7);
 submit =new JButton("Submit");
 submit.setBackground(Color.GRAY);
 submit.setForeground(Color.WHITE);
 submit.setFont(new Font("Raleway",Font.BOLD,14));
 submit.setBounds(220,700,150,30);
 submit.addActionListener(this);
 add(submit);
 
 cancel =new JButton("Cancel");
 cancel.setBackground(Color.GRAY); cancel.setForeground(Color.WHITE);
 cancel.setFont(new Font("Raleway",Font.BOLD,14));cancel.setBounds(400,700,150,30);
 cancel.addActionListener(this);
 add(cancel);
 
 setSize(850,820);
 setLocation(350,0);
 setVisible(true);
 

}
    @SuppressWarnings("empty-statement")
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==submit){
String ac=null;
if(r1.isSelected())
        {
            ac="Savings Account";
        }
if(r2.isSelected())
        {
            ac="Current Account";
        }
if(r3.isSelected())
        {
            ac="Fixed Deposit Accunt";
        }
if(r4.isSelected())
        {
            ac="Recurring Deposit Account";
        }
Random ran= new Random();
String cards=""+Math.abs((ran.nextLong()%90000000L)+4000000000000000L);
String Pin=""+Math.abs((ran.nextLong()%9000L)+1000L);
String facality="";
if(c1.isSelected())
{
    facality=facality+" ATM CARD";
}
else if(c2.isSelected())
{
    facality=facality+" Pin Change";
}
    if(c3.isSelected())
{
    facality=facality+" Net Banking";
}if(c4.isSelected())
{
    facality=facality+" Mobile Banking";
}
if(c5.isSelected())
{
    facality=facality+" Email & Sms Alearts";
}
if(c6.isSelected())
{
    facality=facality+" E-Statement";
}
try{
if(ac.equals("")){
JOptionPane.showMessageDialog(null, "Account Type is Required!");}
else 
{
coonect c=new coonect();
      String query1= "insert into Signup3 Values('"+formno+"','"+ac+"','"+cards+"','"+Pin+"','"+facality+"')";
      String query2= "insert into login Values('"+formno+"','"+cards+"','"+Pin+"')";
      c.s.executeUpdate(query1);c.s.executeUpdate(query2);
      JOptionPane.showMessageDialog(null, "Card Number: "+cards+"\n Pin: "+Pin);
      setVisible(false);
      new Deposit(Pin).setVisible(true);
      
} 
    }
catch(Exception E){System.out.println(E);}

}


else if(e.getSource()==cancel){

setVisible(false);
new login().setVisible(true);
}
    }

   
    public static void main(String args[]){
        new Signup3("");
    }

   

  
   
}
