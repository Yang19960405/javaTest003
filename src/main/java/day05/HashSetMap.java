package day05;

import java.util.HashMap;
import java.util.HashMap.*;
import java.util.HashSet.*;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Scanner.*;

public class HashSetMap {

    static public void main(String[] args){
        HashMap hashMap=new HashMap();
        Scanner scanner=new Scanner(System.in);
        for (int i=0;i<5;i++){
            System.out.println("第"+(i+1)+"个");
            System.out.print("Key:");
            String key=scanner.next();
            System.out.print("value:");
            String value=scanner.next();
            hashMap.put(key,value);
        }

        Iterator iterator=hashMap.keySet().iterator();
        while (iterator.hasNext()){
            Object key=iterator.next();
            System.out.println("key:"+key+"\tvalue:"+hashMap.get(key));
        }
    }
}
