
import java.sql.*;
import javax.swing.*;

public class MysqlConnect {
    Connection conn = null;
    public static Connection ConnectDB(){
        try{
            
            Class.forName("com.mysql.jdbc.Driver"); //Loading the driver
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/empdb","root",""); 
           // JOptionPane.showMessageDialog(null,"Connection Successful");
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
