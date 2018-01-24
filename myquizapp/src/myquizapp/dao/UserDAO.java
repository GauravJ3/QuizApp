/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myquizapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import myquizapp.dbutil.DBConnection;
import myquizapp.pojo.User;

/**
 *
 * @author Windows
 */
public class UserDAO {
   public static boolean addStudent(User user)throws SQLException
   {
       //usersdao
       boolean status=true;
       Connection conn=DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("Select * from users where userid=?");
       ps.setString(1,user.getUSERID());
       ResultSet rs=ps.executeQuery();
       if(rs.next())
        status=false;
       else{
           String qry="Insert into users values(?,?,?)";
           ps=conn.prepareStatement(qry);
           ps.setString(1,user.getUSERID());
           ps.setString(2,user.getPASSWORD());
           ps.setString(3,user.getUSERTYPE());
           ps.executeUpdate();
            }
       return status;
   }
   public static boolean validateUser(User user)throws SQLException{
   Connection conn=DBConnection.getConnection();
   PreparedStatement ps=conn.prepareStatement("select usertype from users where userid=? and password=?");
   ps.setString(1,user.getUSERID());
   ps.setString(2,user.getPASSWORD());
   ResultSet rs=ps.executeQuery();
   if(rs.next()){
       return true;
   }
   else
       return false;
   }
   public static boolean updatePassword(User user)throws SQLException{
   Connection conn=DBConnection.getConnection();
   PreparedStatement ps=conn.prepareStatement("update users set password=? where userid=? and usertype=?");
   ps.setString(1,user.getPASSWORD());
   ps.setString(2,user.getUSERID());
   ps.setString(3,user.getUSERTYPE());
   ResultSet rs=ps.executeQuery();
   if(rs.next())
       return true;
   else
       return false;
   
   }
}
