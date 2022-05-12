package main;

import java.sql.Connection;
import java.sql.Statement;

public class addbook{
    private String bookname;
    private String author ;
    private String bookid;


    public String getBookname() {
        return bookname;
    }
  
     public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
     public String getAuthor(){
         return author;
     }
     
     public void setAuthor(String author){
         this.author = author;
     }
    public String execute()  throws Exception {

        System.out.println("Debugging--------------- ADD Book");
        try
        {
            Connection con =  java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/lms5","root","root");
            Statement st =con.createStatement();
          
            st.executeUpdate("insert into book(bookid,bookName,author) values ('"+getBookid()+"','"+getBookname()+"','"+getAuthor()+"')");
            System.out.println("Book added Successfullly");
             return "success";
        }catch(Exception e){
            System.out.println("BOOK is AlREADY AVAILABLE");
        }
       return "failure";
}
}
      
 