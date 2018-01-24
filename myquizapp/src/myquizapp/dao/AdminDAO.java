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
public class AdminDAO {
    public static boolean adminOptions(User u)throws SQLException{
        Connection conn=DBConnection.getConnection();
        PreparedStatement ps=conn.prepareStatement("Select * from Users where USERID=? AND PASSWORD=?");
    ps.setString(1,u.getUSERID());
    ps.setString(2,u.getPASSWORD());
      int x=ps.executeUpdate();
    if(x>0){
        
     return true;
    }
    else
        return false;
}
     public static boolean studentOptions(User u)throws SQLException{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select * from Users where USERID=? AND PASSWORD=?");
    ps.setString(1,u.getUSERID());
    ps.setString(2,u.getPASSWORD());
      int x=ps.executeUpdate();
    if(x>0)
        return true;
    else
        return false;
    }
 
}
