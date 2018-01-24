/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myquizapp.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows
 */
public class DBConnection {
    private static Connection conn=null;
    static 
    {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//Gaurav:1521/xe","project","java");
            JOptionPane.showMessageDialog(null,"COnnection to database Successfull","Success",JOptionPane.INFORMATION_MESSAGE);
           }catch(ClassNotFoundException |SQLException e){
               JOptionPane.showMessageDialog(null,"Error Connecting to database "+e,"Error!!",JOptionPane.ERROR_MESSAGE);
           }
    }
    public static Connection getConnection(){
        return conn;
    }
    public static void closeConnection(){
        try{
            if(conn!=null)
            {    conn.close();
            
            }
         }catch(SQLException e)
         {
             JOptionPane.showMessageDialog(null, "Error Closing connection "+e, "Error!!",JOptionPane.ERROR_MESSAGE);
         }
            
      }
    }

