package com.example.android.reportcard;

/**
 * Created by gyh on 2016/10/10.
 */

public class ReportCard {
    private String mStudentNumber;
    private String mCourse;
    private float mScore;
    private String mYear = "2016";

    public ReportCard(String studentNumber,String course,float score){
        mStudentNumber = studentNumber;
        mCourse = course;
        mScore = score;
    }

    public String getStudentNumber(){
        return mStudentNumber;
    }
    public String getCourse(){
        return mCourse;
    }
    public String getYear(){
        return mYear;
    }
    public float getScore(){
        return mScore;
    }
    public void setScore(float score){
        mScore = score;
    }

    @Override
    public String toString() {
        return "ReportCard{" +
                "mStudentNumber='" + mStudentNumber + '\'' +
                ", mCourse='" + mCourse + '\'' +
                ", mScore=" + mScore +
                ", mYear='" + mYear + '\'' +
                '}';
    }
}
