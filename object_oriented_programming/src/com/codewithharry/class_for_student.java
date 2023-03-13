package com.codewithharry;
class student{
    public String roll;
    public String name;
    public String course;
    public double m1,m2,m3;
    public double total(){
        return m1+m2+m3;
    }public double average(){
        return total()/3;
    }public String  grade(){
        if (average()>90) return "A++";
        else if (average()>=70) return "A";
        else if (average()>=60) return "B";
        else if (average()>=50)return "c";
        else if (average()>=40)return "D";
        else return "fail";
    }
    public String toString()
    {
        return "Roll No:"+roll+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
    }
}
public class class_for_student {
    public static void main(String []args){
        student s=new student();
        s.roll="20BHI10047";
        s.name="Sudhir Kumar Patel";
        s.course="math";
        s.m1=67;
        s.m2=56;
        s.m3=78;
        System.out.println("Details:\n"+s );
        System.out.println(s.total());
        System.out.println(s.average());
        System.out.println(s.grade());


    }
}
