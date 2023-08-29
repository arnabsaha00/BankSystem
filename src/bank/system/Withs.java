package bank.system;

import javax.swing.*;
import java .awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class Withs extends JFrame implements ActionListener {
    
   JButton Withdraw,back;
    JTextField Amount;
    String Pins;
    Withs(String Pins){
        this.Pins=Pins;
        setLayout(null);
        ImageIcon  img1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2= img1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);add(image);
        JLabel text= new JLabel("Enter The Amount you want to Withdraw");
        text.setForeground(Color.WHITE);
        text.setBounds(170,300,400,20);
        text.setFont(new Font("System",Font.BOLD,16));image.add(text);
         Amount= new JTextField();
        Amount.setFont(new Font("Raleway",Font.BOLD,22));
       
        Amount.setBounds(170,350,320,25);
        image.add(Amount);
        
        
         Withdraw= new JButton("Withdrawal");
        Withdraw.setBounds(355,485,150,30);
         Withdraw.addActionListener(this);
        image.add(Withdraw);
         back= new JButton("Back");
        back.setBounds(355,520,150,30);
      back.addActionListener(this);
        image.add(back);

        setSize(900,900);//fra me length and width1
        setVisible(true);//to see the frame on screen it's by default false
        setLocation(300,00);
        setUndecorated(true);

    }
    public void actionPerformed(ActionEvent e) {
if(e.getSource()==Withdraw){
String number=Amount.getText();
Date date=new Date();
if(number.equals("")){
JOptionPane.showMessageDialog(null, "Please Select or Enter the Amount");
}else {
    try{
    coonect c=new coonect();
String query= "Insert into bank values('"+Pins+"','"+date+"','Withdraw','"+number+"')";
c.s.executeUpdate(query);
JOptionPane.showMessageDialog(null, "Rs "+number+" Deducted    Succesfully");
    setVisible(false);
    new Tran(Pins).setVisible(true);
    }
catch(Exception s){
        System.out.println(s);}}
}
else if(e.getSource()==back){
    setVisible(false);
    new Tran(Pins).setVisible(true);
System.exit(0);
}
    }
    public static void main(String args[]){
        new Withs("");
    }



}
