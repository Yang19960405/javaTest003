package day06;

import java.util.ArrayList;
import java.util.Iterator;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class MySqlUtil {
    static private MySqlUtil mySqlUtil;
    private Connection connection=null;
    private PreparedStatement preparedStatement=null;
    private String url="";
    private String name="root";
    private String pass="root";
}
