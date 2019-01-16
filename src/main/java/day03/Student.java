package day03;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private static volatile Student student;
    private String name;
    private String pass;
    private String rode;
    private static ArrayList<Achievement> achievementList=new ArrayList<Achievement>();

    private Student ()
    {

    }

    private Student(String name,String pass,String rode){
        this.name=name;
        this.pass=pass;
        this.rode=rode;
    }

    public static Student getStudent(){
        synchronized (Student.class){
            if(student==null)
            {
                student=new Student();
            }
        }
        return student;
    }

    public static Student getStudent(String name,String pass,String rode){
        synchronized (Student.class){
            if(student==null)
            {
                student=new Student(name,pass,rode);
            }
        }
        return student;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getRode() {
        return rode;
    }

    public void setRode(String rode) {
        this.rode = rode;
    }

    public void addAchievement(Achievement achievement){
        if(!rode.equals("老师")){
            System.out.println("不是老师，无权限录入成绩");
        }
        else {
            achievementList.add(achievement);
        }
    }

    public void toStudent(){
        System.out.println("欢迎"+this.name+"\t您的角色是"+this.rode+"\t您的密码是"+this.pass);
    }

    public ArrayList<Achievement> allAchievement(){
        if(!rode.equals("老师")){
            System.out.println("不是老师，无权查询所有人成绩");
            return null;
        }
        else {
            return achievementList;
        }
    }

    public Achievement selectMe(){
        if(!rode.equals("学生")){
            System.out.println("不是学生，无成绩");
            return null;
        }
        for(Achievement a:achievementList){
            if(a.getName().equals(this.name)){
                return a;
            }
        }
        System.out.println("无成绩");
        return null;
    }
}


class  Achievement{
    private String name;
    private Double math;
    private Double chinese;
    private Double english;

    public Achievement(){

    }

    public Achievement(String name, Double math,Double chinese,Double english){
        this.chinese=chinese;
        this.english=english;
        this.math=math;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMath() {
        return math;
    }

    public void setMath(Double math) {
        this.math = math;
    }

    public Double getChinese() {
        return chinese;
    }

    public void setChinese(Double chinese) {
        this.chinese = chinese;
    }

    public Double getEnglish() {
        return english;
    }

    public void setEnglish(Double english) {
        this.english = english;
    }
}
