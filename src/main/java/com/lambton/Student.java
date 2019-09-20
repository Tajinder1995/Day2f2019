package com.lambton;

public class Student {
    private int student_id;
    private String first_name;
    private String last_name;
    private int marks1;
    private int marks2;
    private int marks3;
    private int marks4;
    private int marks5;
    private int total;
    private float per;
    private int result;
    public int getStudent_id() {
        return student_id;
    }
    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getFull_name()
    {
        return(first_name + last_name);
    }
    public int getMarks1() {
        return marks1;
    }
    public void setMarks1(int marks1) {
        this.marks1 = marks1;
    }
    public int getMarks2() {
        return marks2;
    }
    public void setMarks2(int marks2) {
        this.marks2 = marks2;
    }
    public int getMarks3() {
        return marks3;
    }
    public void setMarks3(int marks3) {
        this.marks3 = marks3;
    }
    public int getMarks4() {
        return marks4;
    }
    public void setMarks4(int marks4) {
        this.marks4 = marks4;
    }
    public int getMarks5() {
        return marks5;
    }
    public void setMarks5(int marks5) {
        this.marks5 = marks5;
    }


}
