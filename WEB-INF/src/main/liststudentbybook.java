package main;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

public class liststudentbybook {
    HashMap<String,String> map = new HashMap<>();


    public  HashMap<String,String>  getMap(){
        return map;
    }
    public void setStudent( HashMap<String,String> map ){
       this.map = map;
   }

   public String execute() throws Exception{
       try{
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con =  java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/lms5","root","root");
       Statement st =con.createStatement();
       System.out.println("debuggging");
       PreparedStatement ps = con.prepareStatement(" select user.name as name,count(book.bookid) as count from user left join book on user.id = book.holdby where role = 'student' group by user.name order by count desc;");
       ResultSet rs =  ps.executeQuery();
       while(rs.next()){
        map.put(rs.getString("name"),rs.getString("count"));
           System.out.println(map);
       }
       con.close();
   }catch(Exception e){
       e.printStackTrace();
   }
       return "success";
   }
  
}

