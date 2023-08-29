
package bank.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import java.util.Date;

public class Pinc extends JFrame implements ActionListener{
    JButton back,change;
    JPasswordField PIN,RRPIN;
    String Pins;
    Pinc(String Pins){
        this.Pins=Pins;
        setLayout(null);
         ImageIcon  img1= new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2= img1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image = new JLabel(i3);add(image);
         image.setBounds(0,0,900,900);
         
         JLabel Ptext =new JLabel("CHANGE YOUR PIN:");
        Ptext.setBounds(240,300,500,35);
        Ptext.setForeground(Color.WHITE);
        Ptext.setFont (new Font("System",Font.BOLD,16));
image.add(Ptext);
    
        JLabel repin =new JLabel("ENTER NEW PIN:");
        repin.setBounds(170,350,500,35);
        repin.setForeground(Color.WHITE);
        repin.setFont (new Font("System",Font.BOLD,19));
image.add(repin);
 JLabel rrepin =new JLabel("RE-ENTER NEW PIN:");
        rrepin.setBounds(170,390,500,35);
        rrepin.setForeground(Color.WHITE);
        rrepin.setFont (new Font("System",Font.BOLD,16));
image.add(rrepin);
          PIN = new JPasswordField();
        PIN.setFont(new Font("Raleway",Font.BOLD,14));
        
        PIN.setBounds(350,360,100,20);
        image.add(PIN);
        
             RRPIN = new JPasswordField ();
        RRPIN.setFont(new Font("Raleway",Font.BOLD,14));
       
        RRPIN.setBounds(350,400,100,20);
        image.add(RRPIN);
        change= new JButton("CHANGE");
        change.setBackground(Color.black);change.setForeground(Color.WHITE);
        change.setFont(new Font("BLACK",Font.BOLD,14));
        change.addActionListener(this);
        change.setBounds(155 ,520,100,30);
        
        image.add(change);
          back= new JButton("BACK");
        back.setBackground(Color.black);back.setForeground(Color.WHITE);
        back.setFont(new Font("BLACK",Font.BOLD,14));
        back.setBounds(420 ,520,100,30);
        back.addActionListener(this);
        image.add(back);
         
          setSize(900,900);//fra me length and width1
        setVisible(true);//to see the frame on screen it's by default false
        setLocation(300,00);
        setUndecorated(true);
                       }
   public static void main(String args[]){
       
      new Pinc("").setVisible(true);                                  
                                         } 

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==change){
       try{
        String newPin= PIN.getText();
        String Rpin=RRPIN.getText();
        if(!newPin.equals(Rpin)){
        JOptionPane.showMessageDialog(null, "Entered Pin DoesNot Match");}
        if(newPin.equals("")){
         JOptionPane.showMessageDialog(null, "Field can't be Empty");}
        
        else if(Rpin.equals("")){
         JOptionPane.showMessageDialog(null, "RE-Enter Field can't be Empty");}
        coonect c= new coonect();
        String query1="update bank set pin ='"+newPin+"'where pin='"+Pins+"'";
        String query2="update Signup3 set pin ='"+newPin+"'where pin='"+Pins+"'";
        String query3="update login set pin ='"+newPin+"'where pin='"+Pins+"'";
        c.s.executeUpdate(query1);
         c.s.executeUpdate(query2);
          c.s.executeUpdate(query3);
          JOptionPane.showMessageDialog(null,"PIN Changed Successfully");
          setVisible(false);
          new Tran(newPin).setVisible(true);
        }
       catch(Exception ae){
       System.out.println(ae);}}
        else {setVisible(false);
            new Tran(Pins).setVisible(true);
        }
    }
}
