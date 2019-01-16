package day06;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Connection.*;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.PreparedStatement.*;
import com.mysql.jdbc.Driver;


public class JDBCTest {




    static public void main(String[] ages){
        Connection connection = getConnection();
        ArrayList<UserModel> userModels=new ArrayList<UserModel>();
        for (int i=0;i<10;i++){
            UserModel userModel=new UserModel("TestName"+i,"TestPass"+i,"TureName"+i,"学生");
            userModels.add(userModel);
        }
        Iterator iterator=userModels.iterator();
        while (iterator.hasNext()){
            UserModel userModel = (UserModel) iterator.next();
            String sql = "INSERT INTO user (UserName,UserPass,TureName,Rode) VALUES ('" + userModel.getUserName() + "','" + userModel.getUserPass() + "','" + userModel.getTureName() + "','" + userModel.getRode() + "')";
            addUser(sql,connection);
        }
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        String url="jdbc:mysql://127.0.0.1:3306/smn?useUnicode=true&characterEncoding=UTF-8";
        String name="root";
        String pass="root";
        String driver="com.mysql.jdbc.Driver";
        Connection connection=null;
        try {

            Class.forName(driver);//指定连接类型
            connection=(Connection) DriverManager.getConnection(url,name,pass);//获取连接
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return connection;
    }

    public static void addUser(String sql,Connection connection){
        try {
            PreparedStatement preparedStatement=(com.mysql.jdbc.PreparedStatement)connection.prepareStatement(sql);//准备执行语句
            preparedStatement.execute();
            System.out.println("添加成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


}
