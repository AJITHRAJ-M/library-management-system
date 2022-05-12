package main;

import java.sql.*;
/**
 *
 * @author Harish
 */
public class connectionprovider {
    public static Connection getCon(){
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms5","root","root");
          return con;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
}