package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.lang.Exception;

public class liststaff {
    ArrayList<String> staff = new ArrayList<>();

     public ArrayList<String> getStaff(){
         return staff;
     }
     public void setBook(ArrayList<String> staff){
        this.staff = staff;
    }

    public String execute() throws Exception{

        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con =  java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/lms5","root","root");
        Statement st =con.createStatement();
        System.out.println("debuggging");
        PreparedStatement ps = con.prepareStatement("select name from user where role = 'staff' ");
        ResultSet rs =  ps.executeQuery();
        while(rs.next()){
            staff.add(rs.getString("name"));
            System.out.println(staff);
        }

        con.close();
    }catch(Exception e){
        e.printStackTrace();
    }


        return "success";
    }
   
}

