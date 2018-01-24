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
import java.sql.Statement;
import java.util.ArrayList;
import myquizapp.dbutil.DBConnection;
import myquizapp.pojo.Performance;
import myquizapp.pojo.StudentScore;

/**
 *
 * @author Windows @Master Gaurav
 */
public class PerformanceDAO {//leelark nair

public static ArrayList<String> getAllStudentId()throws SQLException{

    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs =st.executeQuery("select distinct userid from Performance");
    ArrayList<String> uid=new ArrayList<>();
    while(rs.next())
    {
        uid.add(rs.getString(1));
    }
    return uid;
}   
public static ArrayList<String> getAllExamId(String str)throws SQLException
{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("select examid from performance where userid=?");
    ArrayList<String> examIdList=new ArrayList<>();
    ps.setString(1,str);
    ResultSet rs = ps.executeQuery();
    while(rs.next())
    {
    String id=rs.getString(1);
    examIdList.add(id);
    }
    return examIdList;
}
public static StudentScore getScore(String studentId,String examId)throws SQLException{
    String qry="select language,per from Performance where userid=? and examid=?";
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement(qry);
    ps.setString(1,studentId);
    ps.setString(2,examId);
    ResultSet rs=ps.executeQuery();
    rs.next();
    StudentScore scoreObj=new StudentScore();
    scoreObj.setLanguage(rs.getString(1));
    scoreObj.setPer(rs.getDouble(2));
    return scoreObj;
}
public static ArrayList<Performance> getAllData()throws SQLException{
    String qry="select * from Performance";
    ArrayList<Performance> performanceList =new ArrayList<Performance>();
    Connection conn=DBConnection.getConnection();
    Statement st=conn.createStatement();
    ResultSet rs=st.executeQuery(qry);
    while(rs.next()){
    String userId=rs.getString("userid");
    String examId=rs.getString("examid");
    String language=rs.getString("language");
    int right =rs.getInt("right");
    int wrong =rs.getInt("wrong");
    int unattempted =rs.getInt("unattempted");
    double per=rs.getDouble("per");
    Performance p=new Performance(userId,examId,right,wrong,unattempted,per,language);
    performanceList.add(p);
    }
     return performanceList;

}
public static void addPerformance(Performance p) throws SQLException{

    
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Insert into performance values(?,?,?,?,?,?,?)");
    ps.setString(1,p.getUserid());
    ps.setString(2, p.getExamid());
    ps.setInt(3, p.getRight());
    ps.setInt(4, p.getWrong());
    ps.setInt(5,p.getUnattempted());
    ps.setDouble(6, p.getPer());
    ps.setString(7,p.getLanguage());
    ps.executeUpdate();
    
    
    
}

}
