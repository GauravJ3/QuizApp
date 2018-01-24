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
import myquizapp.pojo.Exam;

/**
 *
 * @author Windows
 */
public class ExamDAO {
public static String getExamId()throws SQLException
{
    int rowCount=0;
    Connection conn=DBConnection.getConnection();
     Statement st= conn.createStatement();
    ResultSet rs=st.executeQuery("Select count(*) as totalrows from Exam");
    if(rs.next())
        rowCount=rs.getInt(1);
    String newId="EX "+(rowCount+1);
    return newId;
}
public static void addExam(Exam newExam) throws SQLException
{
    int rowCount=0;
    
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Insert into exam values(?,?,?)");
    ps.setString(1, newExam.getEXAMID());
    ps.setString(2,newExam.getLANGUAGE());
    ps.setInt(3, newExam.getTOTAL_QUESTIONS());
    int x=ps.executeUpdate();   
}
public static ArrayList<String> getExamIdBySubject(String subject)throws SQLException
{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select examid from exam where language=?");
    ps.setString(1, subject+" ");
    ResultSet rs=ps.executeQuery();
    ArrayList<String> examList=new ArrayList<>();
    while(rs.next()){
        examList.add(rs.getString(1));
    }
    return examList;
}
public static int getQuestionCountByExam(String examId) throws SQLException
{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("select total_questions from Exam where examid=?");
    ps.setString(1, examId);
    ResultSet rs=ps.executeQuery();
    rs.next();
    int rowCount= rs.getInt(1);
      return rowCount;
}
}
