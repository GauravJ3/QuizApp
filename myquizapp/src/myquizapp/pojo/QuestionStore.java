/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myquizapp.pojo;

import java.util.ArrayList;

/**
 *
 * @author Windows
 */
public class QuestionStore {
ArrayList<Question> questionList;
public QuestionStore()
{
    questionList = new ArrayList<Question>();
}
public void addQuestion(Question q){
questionList.add(q);
}
public Question getQuestion(int pos){
    System.out.println("in get question method");
return questionList.get(pos);

}
public void removeQuestion(int pos){
    questionList.remove(pos);
}
public void setQuestionAt(int pos,Question obj){
questionList.add(pos,obj);
}
public ArrayList<Question> getAllQuestions(){
return questionList;
} 
public int getCount(){
    return questionList.size();
}
}
