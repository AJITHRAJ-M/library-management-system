package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.lang.Exception;


public class listbook {
    ArrayList<String> book = new ArrayList<>();

     public ArrayList<String> getBook(){
         return book;
     }
     public void setBook(ArrayList<String> book){
        this.book = book;
    }

    public String execute() throws Exception{

        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con =  java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/lms5","root","root");
        Statement st =con.createStatement();
        System.out.println("debuggging");
        PreparedStatement ps = con.prepareStatement("select bookName from book ");
        ResultSet rs =  ps.executeQuery();
        while(rs.next()){
            book.add(rs.getString("bookName"));
            System.out.println(book);
        }

        con.close();
    }catch(Exception e){
        e.printStackTrace();
    }


        return "success";
    }
   
}
