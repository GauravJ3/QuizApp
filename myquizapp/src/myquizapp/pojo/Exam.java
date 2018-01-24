/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myquizapp.pojo;

/**
 *
 * @author Windows
 */
public class Exam {
String EXAMID;

    public String getEXAMID() {
        return EXAMID;
    }

    public void setEXAMID(String EXAMID) {
        this.EXAMID = EXAMID;
    }

    public String getLANGUAGE() {
        return LANGUAGE;
    }

    public void setLANGUAGE(String LANGUAGE) {
        this.LANGUAGE = LANGUAGE;
    }

    public int getTOTAL_QUESTIONS() {
        return TOTAL_QUESTIONS;
    }

    public void setTOTAL_QUESTIONS(int TOTAL_QUESTIONS) {
        this.TOTAL_QUESTIONS = TOTAL_QUESTIONS;
    }
String LANGUAGE;
int TOTAL_QUESTIONS;

    public Exam(String EXAMID, String LANGUAGE, int TOTAL_QUESTIONS) {
        this.EXAMID = EXAMID;
        this.LANGUAGE = LANGUAGE;
        this.TOTAL_QUESTIONS = TOTAL_QUESTIONS;
    }


}
