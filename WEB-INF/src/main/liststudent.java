package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class liststudent {
    ArrayList<String> student = new ArrayList<>();

    public ArrayList<String> getStudent(){
        return student;
    }
    public void setStudent(ArrayList<String> student){
       this.student = student;
   }

   public String execute() throws Exception{
       try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con =  java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/lms5","root","root");
       Statement st =con.createStatement();
       System.out.println("debuggging");
       PreparedStatement ps = con.prepareStatement("select name from user where role ='student'");
       ResultSet rs =  ps.executeQuery();
       while(rs.next()){
           student.add(rs.getString("name"));
           System.out.println(student);
       }

       con.close();
   }catch(Exception e){
       e.printStackTrace();
   }


       return "success";
   }
  
}


