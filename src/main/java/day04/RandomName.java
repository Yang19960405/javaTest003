package day04;

import java.math.*;
import java.util.Scanner;
import java.util.Scanner.*;

public class RandomName {
    public static void main(String[] args) {
        String[] sList={
                "",
                "陈月芳",
                "刘立超",
                "邓超元",
                "赵明睿",
                "赵晨锦",
                "金谡",
                "杨斌",
                "杨恒",
                "李静雅",
                "王雅雯",
                "王强",
                "师尧",
                "吴凯平",
                "韩思远",
                "陈慧慧",
                "李欣",
                "王一茗",
                "李奕霖",
                "苏宏月",
                "赵灿"
        };
        System.out.println("开始点名 输入0结束");
        String a="";
        while (!a.equals("0"))
        {
            Scanner scanner=new Scanner(System.in);
            a=scanner.nextLine();
            if(a.length()==0)
            {
                String s=sList[(int)(Math.random()*19)];
                System.out.println(s);
            }

        }
        System.out.println("点名结束");
    }
}
