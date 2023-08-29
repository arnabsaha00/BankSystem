/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package bank.system;
import java.sql.*;
/**
 *
 * @author Asus
 */
public class coonect {
    Connection c;Statement s;
    
    public coonect(){
    try{
    
    c=DriverManager.getConnection("jdbc:mysql:///BankManagement","root","Arnab@123");
    s=c.createStatement();
    
    
    }catch(Exception e){ }
    }
}
