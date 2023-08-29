/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank.system;

/**
 *
 * @author Asus
 */
import com.toedter.calendar.JDateChooser;
import java.awt.Color;

import java.awt.Font;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
public class Signup2 extends JFrame implements ActionListener
{
    long random;
      JTextField nameTextField,fnameTextField,mailTextField,AddressTextField,CityTextField,StateTextField,PinTextField,pan,Aadhar;
    JButton next;
    JRadioButton Male,Female,Married,UnMarried;
     JDateChooser dateChooser;
     JRadioButton Eyes,ENo,pNo,pyes;
     JComboBox rel,cat,incomes,edus,occus;String formno;
    Signup2(String formno)
    {
         
        this.formno=formno;setLayout(null);
              setTitle("NEW ACCOUNT APPLICATION FORM -PAGE 2");
       JLabel AdditionallD= new JLabel("Page 2:Additional  Details");
        AdditionallD.setFont(new Font("Raleway",Font.BOLD,23));
        AdditionallD.setBounds(290,80,350,40);
        add(AdditionallD);
            JLabel Name= new JLabel("Religion: ");
        Name.setFont(new Font("Raleway",Font.BOLD,20));
        Name.setBounds(95,140,100,30);
        add(Name);
        String valrig[]={"Hindu","Muslim","Christian","Sikh","Other"};
         rel=new JComboBox(valrig);
          rel.setBounds(300,140,400,30);
          rel.setBackground(Color.WHITE);
        add(rel);
          JLabel fName= new JLabel("Category: ");
        fName.setFont(new Font("Raleway",Font.BOLD,20));
        fName.setBounds(95,190,100,30);
        add(fName);
      String vCae[]={"General","SC","ST","OBC"};
          cat=new JComboBox(vCae);
        cat.setBounds(95,190,190,30);
        cat.setBackground(Color.WHITE);
        add(cat);
         
        cat.setBounds(300,190,400,30);
        add(cat);
              JLabel DOB= new JLabel("Income: ");
        DOB.setFont(new Font("Raleway",Font.BOLD,20));
        DOB.setBounds(95,240,190,30);
        add(DOB);
          String ins[]={" Below 200000","200000-500000","500000-700000",">700000"};
          incomes=new JComboBox(ins);
        incomes.setBounds(300,240,400,30);
        incomes.setBackground(Color.WHITE);
        add(incomes);
         JLabel gen= new JLabel("Educational ");
        gen.setFont(new Font("Raleway",Font.BOLD,20));
        gen.setBounds(95,290,190,30);
        add(gen);
            
         JLabel mail= new JLabel("Qualification: ");
        mail.setFont(new Font("Raleway",Font.BOLD,20));
        mail.setBounds(95,315,190,30);
        add(mail);
        
        String Educav[]={"10'th Pass","12'th Pass","Graduation","Post-Graduation","Others"};
          edus=new JComboBox(Educav);
        edus.setFont(new Font("Raleway",Font.BOLD,14));
         edus.setBackground(Color.WHITE);
        edus.setBounds(300,305,400,30);
        add(edus);
         JLabel mStatus= new JLabel("Occupation: ");
        mStatus.setFont(new Font("Raleway",Font.BOLD,20));
        mStatus.setBounds(95,370,190,30);
        add(mStatus);
           String Occu[]={"Un-Employed","House Wife","Business Man","Service","Others"};
          occus=new JComboBox(Occu);
         occus.setFont(new Font("Raleway",Font.BOLD,14));
         occus.setBackground(Color.WHITE);
        occus.setBounds(300,370,400,30);
        add(occus);
        
            JLabel Address= new JLabel("Pan Number: ");
        Address.setFont(new Font("Raleway",Font.BOLD,20));
        Address.setBounds(95,415,190,30);
        add(Address);
          pan = new JTextField();
       pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,415,400,30);
        add(pan);
        
         JLabel City= new JLabel("Aaddhar Number: ");
         City.setFont(new Font("Raleway",Font.BOLD,20));
        City.setBounds(95,455,190,30);
        add(City);
         Aadhar = new JTextField();
       Aadhar.setFont(new Font("Raleway",Font.BOLD,14));
        Aadhar.setBounds(300,455,400,30);
        add(Aadhar);
        
         
        
         JLabel State= new JLabel("Senior citizen: ");
        State.setFont(new Font("Raleway",Font.BOLD,20));
        State.setBounds(95,490,190,30);
        add(State);
        Eyes=new JRadioButton("Yes");
        Eyes.setBounds(355,490,100,30);
        Eyes.setBackground(Color.WHITE);
        add(Eyes);
        ENo=new JRadioButton("N0");
        ENo.setBounds(450,490,100,30);
        ENo.setBackground(Color.WHITE);
        add(ENo);
        ButtonGroup sc=new ButtonGroup();
        sc.add(Eyes);
        sc.add(ENo);
         
        JLabel Pin= new JLabel("Existing account:");
        Pin.setFont(new Font("Raleway",Font.BOLD,20));
        Pin.setBounds(95,540,190,30);
        add(Pin);
            pyes=new JRadioButton("Yes");
        pyes.setBounds(355,540,100,30);
        pyes.setBackground(Color.WHITE);
        add(pyes);
        pNo=new JRadioButton("N0");
        pNo.setBounds(450,540,100,30);
        pNo.setBackground(Color.WHITE);
        add(pNo);
        ButtonGroup exist=new ButtonGroup();
        exist.add(pyes);
        exist.add(pNo);
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
      //long 
      String formno=""+random;
        String Relig =(String)rel.getSelectedItem();
        String Cata =(String)cat.getSelectedItem();
        String Inc=(String)incomes.getSelectedItem();
        String ed=(String)edus.getSelectedItem();
        String Oc=(String)occus.getSelectedItem();
                
        String Seniorc=null;
        
        if(Eyes.isSelected()){Seniorc="Yes";}
        else if(ENo.isSelected()) {Seniorc="No";}
        String Pan=pan.getText();
        
        String Exac=null;
        if(pyes.isSelected()){
            Exac="Yes";}
        if(pNo.isSelected()){Exac="No";}
         
         
         
       String aadhar=  Aadhar.getText();
      
      
      try{
      
      coonect c=new coonect();
      String query="Insert into Signup2 Values('"+formno+"','"+Relig+"','"+Cata+"','"+Inc+"','"+ed+"','"+Oc+"','"+Seniorc+"','"+aadhar+"','"+Exac+"','"+Pan+"')";
      c.s.executeUpdate(query);
      setVisible(false);
      new Signup3(formno).setVisible(true);
         
          }
      catch(Exception e){
       System.out.println(e);}
    }
    
    public static void main(String[] args) {
        new Signup2("");
    }
   
}
