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
import java.util.ArrayList;
import myquizapp.dbutil.DBConnection;
import myquizapp.pojo.Question;
import myquizapp.pojo.QuestionStore;

/**
 *
 * @author Windows
 */
public class QuestionDAO {
public static void addQuestions(QuestionStore qstore) throws SQLException{
String qry= "Insert into Question values(?,?,?,?,?,?,?,?,?)";
ArrayList<Question> questionList =qstore.getAllQuestions();
Connection conn=DBConnection.getConnection();
PreparedStatement ps= conn.prepareStatement(qry);
    for(Question obj:questionList){
            ps.setString(1,obj.getExamId());
            ps.setInt(2,obj.getQno());
            ps.setString(3,obj.getQuestion());
            ps.setString(4,obj.getAnswer1());
            ps.setString(5,obj.getAnswer2());
            ps.setString(6,obj.getAnswer3());
            ps.setString(7,obj.getAnswer4());
            ps.setString(8,obj.getCorrectAnswer());
            ps.setString(9,obj.getLanguage());
            ps.executeUpdate();
              
    }
}    
public static ArrayList<Question> getQuestionsByExamId(String examId)throws SQLException
{
    Connection conn=DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement("Select * from Question where examid=? order by qno");
    ArrayList<Question> questionList=new ArrayList<>();
    ps.setString(1,examId);
    ResultSet rs=ps.executeQuery();
    System.out.println("Query execute ho gyi");
    while(rs.next())
    {
        System.out.println("inside While loop");
        int qno= rs.getInt(2);
        String question= rs.getString(3);
        String answer1=rs.getString(4);
        String answer2=rs.getString(5);
        String answer3=rs.getString(6);
        String answer4=rs.getString(7);
        String correctAnswer=rs.getString(8);
        String language =rs.getString(9);
        //String
        Question obj=new Question(examId,qno,question,answer1,answer2,answer3,answer4,correctAnswer,language);//change here
        questionList.add(obj);   
    }
    return questionList;
}
public static void updateQuestions(QuestionStore qstore)throws SQLException
{
    String qry= "update question set question=?,answer1=?,answer2=?,answer3=?,answer4=?,correct_answer=? where examid=? and qno=?";
    ArrayList<Question> questionList=qstore.getAllQuestions();
    Connection conn = DBConnection.getConnection();
    PreparedStatement ps=conn.prepareStatement(qry);
    for(Question obj:questionList)
    {
        ps.setString(1,obj.getQuestion());
        ps.setString(2,obj.getAnswer1());
        ps.setString(3,obj.getAnswer2());
        ps.setString(4,obj.getAnswer3());
        ps.setString(5,obj.getAnswer4());
        ps.setString(6,obj.getCorrectAnswer());
        ps.setString(7,obj.getExamId());
        ps.setInt(8,obj.getQno());
        ps.executeQuery();
    }
}
}
