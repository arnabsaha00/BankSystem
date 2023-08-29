/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.system;

/**
 *
 * @author Asus
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
/**
 *
 * @author Asus
 */
public class login extends JFrame implements ActionListener{
     JButton log1,Clear,log3,forgotpASSWORD;
        JTextField cardTextField;
         JPasswordField pinTextField;
  login(){
    setTitle("Virtual ATM");//it's will be the title of the frame
    setLayout(null);
        ImageIcon  img1= new ImageIcon(ClassLoader.getSystemResource("icons/icon3.jpg"));
Image img2= img1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
ImageIcon i3= new ImageIcon(img2);
      JLabel l= new JLabel(i3);
      l.setBounds(70,10,100,100);
       add(l);
       JLabel text1= new JLabel("Welcome to ATM");
       text1.setFont(new Font("Osward",Font.BOLD,26));
       text1.setBounds(250,40,400,40);
       add(text1);
       getContentPane().setBackground(Color.WHITE);
       
        JLabel Card_No= new JLabel("Card No:");
      Card_No.setFont(new Font("Osward",Font.BOLD,26));
      Card_No.setBounds(120,150,300,40);
       add(Card_No);
       getContentPane().setBackground(Color.WHITE);
       
        cardTextField=new JTextField();
        cardTextField.setBounds(300,160,250,30);
        add(cardTextField);
        JLabel Pin= new JLabel("Enter Your Pin:");
      Pin.setFont(new Font("Osward",Font.BOLD,26));
       Pin.setBounds(80,200,300,40);
       add(Pin);
       getContentPane().setBackground(Color.WHITE);
        pinTextField=new JPasswordField();
       pinTextField.setBounds(300,210,250,30);
        add(pinTextField);
           log1= new JButton("Sign In");
        log1.setBounds(300,250,100,30);
        log1.setBackground(Color.DARK_GRAY);
        log1.setForeground(Color.WHITE);
          log1.addActionListener(this);
        add(log1);
         Clear= new JButton("Clear");
        Clear.setBounds(450,250,100,30);
        Clear.setBackground(Color.DARK_GRAY);
        Clear.setForeground(Color.WHITE);
          Clear.addActionListener(this);
        add(Clear);
        
        
          log3= new JButton("Sign UP");
       log3.setBounds(300,300,230,30);
        log3.setBackground(Color.DARK_GRAY);
        log3.setForeground(Color.WHITE);
         log3.addActionListener(this);
        add(log3);
       
        setSize(800,400);//fra me length and width1
        setVisible(true);//to see the frame on screen it's by default false
        setLocation(400,310);//it's used to open not in the top left but where you want to open frame

    }
  public void actionPerformed (ActionEvent ae){
      if(ae.getSource()==Clear){
      cardTextField.setText("");
      pinTextField.setText("");}
      else  if(ae.getSource()==log3){
           setVisible (false);
      new SignUp1().setVisible(true);
      }
       else if(ae.getSource()==log1){
      coonect c=new coonect();
      String Card=cardTextField.getText();
      String Pins=pinTextField.getText();
      String query="Select * from login where cards='"+Card+"'and pin='"+Pins+"'";
      /*else if(ae.getSource()==forgotpASSWORD){
      coonect c=new coonect();
      String Card=cardTextField.getText();
      String Pins=pinTextField.getText();
      String query="Select * from login where cards='"+Card+"'and pin='"+Pins+"'";}*/
      try{
        ResultSet rs=  c.s.executeQuery(query);
        if(rs.next()){
        setVisible(false);
        new Tran(Pins).setVisible(true);}
        else {
            JOptionPane.showMessageDialog(null,"Incorrect Card No or Pin");
        }
      }
      catch(Exception e){
      System.out.println(e);}
      }
     
  }
  
    
    public static void main(String[] args) {
        new login();
    }
  }
