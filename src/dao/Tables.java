/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;
/**
 *
 * @author alekh
 */
public class Tables {
    public static void main(String[] args){
        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
           //st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key,userRole varchar(200),email varchar(200), username varchar(200),password varchar(50))");
            st.executeUpdate("insert into appuser (userRole, email, username, password) values ('doctor','admin@email.com', 'admin', 'admin')");
            JOptionPane.showMessageDialog(null,"Table Create Successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
