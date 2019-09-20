package com.lambton;

public class CollegeExample {
    public static void main(String[]args)

    {
        Student s1= new Student();
        s1.setFirst_name("tajinder");
        s1.setLast_name("singh");
        s1.setMarks1(56);
        s1.setMarks2(44);
        s1.setMarks3(33);
        s1.setMarks4(33);
        s1.setMarks5(76);
        System.out.println("FIRST NAME :"+s1.getFirst_name());
        System.out.println("LAST NAME :"+s1.getLast_name());
        System.out.println("FULL NAME :"+s1.getFull_name());
        System.out.println("MARKS 1:"+s1.getMarks1());
        System.out.println("MARKS 2:"+s1.getMarks2());
        System.out.println("MARKS 3:"+s1.getMarks3());
        System.out.println("MARKS 4:"+s1.getMarks4());
        System.out.println("MARKS 5:"+s1.getMarks5());



    }
}
