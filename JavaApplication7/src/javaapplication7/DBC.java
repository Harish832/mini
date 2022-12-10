//Run this code to access connection methods and tables in created database!!!
package javaapplication7;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBC{
    public static Statement stmt;
    public static Connection conn;
    public static ResultSet rs;
    
    public static void connect()
    {       
       try{
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "root", "");
           stmt = conn.createStatement();                                    
       }
       catch(SQLException e){
           System.out.println(e);
       } 
    }

    public static void STATE(String a)
    {
        try {
            stmt.execute(a);
        } catch (SQLException e) {
           System.out.println(e);
        }
    }
    
    public static void STATEEXEUP(String a)
    {
        try{
            stmt.executeUpdate(a);
        }
        catch(SQLException e){
           System.out.println(e);
    }
    }
    
    public static ResultSet RSEXEQUE(String a,ResultSet b)
    {
        try{
            rs=stmt.executeQuery(a);
            b=rs;
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
        return b;
    }
    
    public static void main(String[] args) {
       DBC.connect();
       //DBC.STATE("CREATE TABLE books(Id int,Title VARCHAR(50),Author VARCHAR(50),Category VARCHAR(50),Quantity int,Price float)");
       //DBC.STATE("CREATE TABLE user(Name VARCHAR(50),Username VARCHAR(50),Email VARCHAR(50),Password VARCHAR(50),Phone int)");
//       DBC.STATE("CREATE TABLE admin(Id int,Name VARCHAR(50),DOB VARCHAR(50),Email VARCHAR(50),Password VARCHAR(50),Phone int)");
//       DBC.STATEEXEUP("INSERT INTO admin VALUES('1001','Pradeep','10-10-2000','pradeep@gmail.com','12345','987654321')");
//       DBC.STATEEXEUP("INSERT INTO admin VALUES('1002','Jashwanth','10-10-2000','jashwanth@gmail.com','1234','987654321')");
//       DBC.STATEEXEUP("INSERT INTO admin VALUES('1003','Krishna','10-10-2000','Krishna@gmail.com','123','987654321')");
       //DBC.STATEEXEUP("INSERT INTO admin VALUES('Nithish','Nit123','Nithish@gmail.com','143','987654321')");
       //DBC.STATEEXEUP("INSERT INTO admin VALUES('Himal','psg123','Himal@gmail.com','1111','987654321')");
      // DBC.STATEEXEUP("INSERT INTO admin VALUES('Rajesh','raj123','rajesh@gmail.com','2222','987654321')");
       //DBC.STATEEXEUP("INSERT INTO admin VALUES('Bharath','vaj123','bharath@gmail.com','12311','987654321')");
       System.out.println("Store Database created successfully...");
    }    
}