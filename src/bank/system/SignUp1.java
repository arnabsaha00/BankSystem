/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.system;

import java.awt.*;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
public class SignUp1 extends JFrame implements ActionListener{
   long random;
    JTextField nameTextField,fnameTextField,mailTextField,AddressTextField,CityTextField,StateTextField,PinTextField;
    JButton next;
    JRadioButton Male,Female,Married,UnMarried;
    JDateChooser dateChooser;
    SignUp1(){ setLayout(null);
        Random ran = new Random();
        random =Math.abs((ran.nextLong()%9000L)+1000L);
        
            JLabel formno = new JLabel("Application Form Number: "+random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
            JLabel PersonalD= new JLabel("Page 1:Personal Details");
        PersonalD.setFont(new Font("Raleway",Font.BOLD,14));
        PersonalD.setBounds(290,80,200,40);
        add(PersonalD);
            JLabel Name= new JLabel("Name: ");
        Name.setFont(new Font("Raleway",Font.BOLD,20));
        Name.setBounds(100,140,100,30);
        add(Name);
          nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        nameTextField.setBounds(300,140,400,30);
        add(nameTextField);
            JLabel Father= new JLabel(" Fathers Name: ");
        Father.setFont(new Font("Raleway",Font.BOLD,20));
        Father.setBounds(95,190,190,30);
        add(Father);
          fnameTextField = new JTextField();
       fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        fnameTextField.setBounds(300,190,400,30);
        add(fnameTextField);
              JLabel DOB= new JLabel(" Date Of Birth: ");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(95,240,190,30);
        add(DOB);
         dateChooser= new JDateChooser();
        dateChooser.setBounds(300,240,200,30);
        
        add(dateChooser);
         JLabel gen= new JLabel(" Gender: ");
        gen.setFont(new Font("Raleway",Font.BOLD,20));
        gen.setBounds(95,290,190,30);
        add(gen);
             Male = new JRadioButton("Male");
        Male.setBounds(300,290,60,30);
        add(Male);
     Female=new JRadioButton("Female");
    Female.setBounds(450,290,120,30);
    add(Female);
             ButtonGroup gender =new ButtonGroup();
    gender.add(Male);
    gender.add(Female);
         JLabel mail= new JLabel(" Email: ");
        mail.setFont(new Font("Raleway",Font.BOLD,20));
        mail.setBounds(95,330,190,30);
        add(mail);
         mailTextField = new JTextField();
        mailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        mailTextField.setBounds(300,330,400,30);
        add(mailTextField);
         JLabel mStatus= new JLabel(" Marital Status: ");
        mStatus.setFont(new Font("Raleway",Font.BOLD,20));
        mStatus.setBounds(95,370,190,30);
        add(mStatus);
          Married = new JRadioButton("Married");
        Married.setBounds(300,370,120,30);
        add(Married);
         UnMarried = new JRadioButton("UnMarried");
        UnMarried.setBounds(450,370,120,30);
        add(UnMarried);
        JRadioButton others = new JRadioButton("Others");
        others.setBounds(600,370,120,30);
        add(others);
         ButtonGroup marry =new ButtonGroup();
    marry.add(Married);
   marry.add(UnMarried);
   marry.add(others);
        
            JLabel Address= new JLabel(" Address: ");
        Address.setFont(new Font("Raleway",Font.BOLD,20));
        Address.setBounds(95,415,190,30);
        add(Address);
          AddressTextField = new JTextField();
       AddressTextField.setFont(new Font("Raleway",Font.BOLD,14));
        AddressTextField.setBounds(300,415,400,30);
        add(AddressTextField);
        
         JLabel City= new JLabel(" City: ");
         City.setFont(new Font("Raleway",Font.BOLD,20));
        City.setBounds(95,455,190,30);
        add(City);
         CityTextField = new JTextField();
       CityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        CityTextField.setBounds(300,455,400,30);
        add(CityTextField);
        
         
        
         JLabel State= new JLabel(" State: ");
        State.setFont(new Font("Raleway",Font.BOLD,20));
        State.setBounds(95,490,190,30);
        add(State);
          StateTextField = new JTextField();
       StateTextField.setFont(new Font("Raleway",Font.BOLD,14));
        StateTextField.setBounds(300,490,400,30);
        add(StateTextField);
        JLabel Pin= new JLabel(" Postal Code:");
        Pin.setFont(new Font("Raleway",Font.BOLD,20));
        Pin.setBounds(95,540,190,30);
        add(Pin);
           PinTextField = new JTextField();
       PinTextField.setFont(new Font("Raleway",Font.BOLD,14));
        PinTextField.setBounds(300,540,400,30);
        add(PinTextField);
         next= new JButton("Next");
        next.setBackground(Color.black);next.setForeground(Color.WHITE);
        next.setFont(new Font("White",Font.BOLD,16));
        next.setBounds(650 ,600,80,30);
        next.addActionListener(this);
        add(next);
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        String formno=null;//long 
        String name =nameTextField.getText();
        String fname =fnameTextField.getText();
        String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(Male.isSelected())gender="Male";
        else if(Female.isSelected())gender="Female";
        String email=mailTextField.getText();
        String maritial=null;
        if(UnMarried.isSelected())maritial="Unmarried";
        if(Married.isSelected())maritial="Married";
         String address=AddressTextField.getText();
         
         
       String city=  CityTextField.getText();
       String State=  StateTextField.getText();
      String pin= PinTextField.getText();
      
      try{
      if(name.equals(""))
          JOptionPane.showMessageDialog(null, "Name is required");
      else {
      coonect c=new coonect();
      String query="Insert into Signup Values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+maritial+"','"+address+"','"+city+"','"+State+"','"+pin+"')";
      c.s.executeUpdate(query);
      setVisible(false);
      new Signup2(formno).setVisible(true);
      
      }
         
          }
      catch(Exception e){
       System.out.println(e);}
    }
    public static void main(String args[]){
    new SignUp1();}
}
