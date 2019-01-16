package day03;


import java.util.Scanner;
import java.util.Scanner.*;

public class Test {
    static String rode="";
    public static void main(String[] args) {
        System.out.println("-------------------------学生管理系统--------------------------");
        Scanner sc=new Scanner(System.in);
        String s="未登录";
        String rode="";
        do {
            Student student=Student.getStudent();
            if(s=="未登录"){
                System.out.print("输入账号：");
                String name=sc.next();
                System.out.print("输入密码：");
                String pass=sc.next();
                System.out.print("输入角色：");
                rode=sc.next();
                while (!rode.equals("老师")&&!rode.equals("学生")){
                    System.out.println("没有该角色");
                    rode=sc.next();
                }
                student.setName(name);
                student.setPass(pass);
                student.setRode(rode);
                System.out.println("登陆成功");
                s="以登录";
            }
            System.out.println("请选择操作");
            if (rode.equals("老师")) {
                System.out.println("1.查询所有学生成绩");
                System.out.println("2.添加学生成绩");
                System.out.println("3.切换用户");
                System.out.println("4.获取自身信息");
                System.out.println("0.退出");
                s=sc.next();
                switch (s)
                {
                    case "4":student.toStudent();break;
                    case "3":s="未登录";break;
                    default:System.out.println("未知操作");break;
                    case "0":s="0";break;
                    case "1":
                        if(student.allAchievement()!=null){
                            for(Achievement a:student.allAchievement()){
                                System.out.println("姓名:"+a.getName()+"\t数学成绩:"+a.getMath()+"\t语文成绩:"+a.getChinese()+"\t英语成绩:"+a.getEnglish());
                            }
                        }
                        else {
                            System.out.println("没有学生信息");
                        }
                        break;
                    case "2":
                        try{
                            System.out.println("输入学生姓名：");
                            String name=sc.next();
                            System.out.println("输入数学成绩：");
                            Double math=sc.nextDouble();
                            System.out.println("输入语文成绩：");
                            Double chinese=sc.nextDouble();
                            System.out.println("输入英语成绩：");
                            Double english=sc.nextDouble();
                            student.addAchievement(new Achievement(name,math,chinese,english));
                            System.out.println("添加成功");
                            break;
                        }
                        catch (Exception e){
                            System.out.println("请输入数字格式");
                            break;
                        }


                }
            }
            else
            {
                System.out.println("1.查询自己成绩");
                System.out.println("2.切换用户");
                System.out.println("3.获取自身信息");
                System.out.println("0.退出");
                s=sc.next();
                switch (s)
                {
                    case "3":student.toStudent();break;
                    case "2":s="未登录";break;
                    default:System.out.println("未知操作");break;
                    case "0":s="0";break;
                    case "1":
                        if(student.selectMe()!=null){
                            Achievement a=student.selectMe();
                            System.out.println("姓名:"+a.getName()+"\t数学成绩:"+a.getMath()+"\t语文成绩:"+a.getChinese()+"\t英语成绩:"+a.getEnglish());

                        }
                        else {
                            System.out.println("没有学生信息");
                        }
                        break;

                }
            }
        }while (s!="0");
        System.out.println("程序退出");

    }
}
