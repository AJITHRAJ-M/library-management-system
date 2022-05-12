package main;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Map;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

public class loginAction extends ActionSupport implements SessionAware{
      private String userid;
      private String username;
      private String password;
      private Map<String,Object> session;

  
     
      public String getUserid() {
        return userid;
      }
      public void setUserid(String userid) {
        this.userid = userid;
      }

     
       public String getUsername() {
        return username;
      }
      public void setUsername(String username) {
        this.username = username;
      }
      public String getPassword() {
        return password;
      }
      public void setPassword(String password) {
        this.password = password;
      }
      
      public void setSession(Map<String,Object> session){
        this.session = session;
      }
    

      public String execute() throws Exception{
        System.out.println("DEbugging");
        session.put("userid", getUserid());
        String role = findUser();
        session.put("role", role);
       
        if(findUser().equals("admin")) 
        { 
          System.out.println("ajith");
          session.put("username", "admin");
          return "admin";
          }
        else if(findUser().equals("student")) {
          session.put("username", "student");
          return "student";
        }
        else  if(findUser().equals("staff")) {
          session.put("username", "staff");
          return "staff";
        }
           
         return "failure";
   }
  public String findUser() throws Exception {
    String role = "";

    Class.forName("com.mysql.cj.jdbc.Driver");
   
    Connection con =  java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/lms5","root","root");

    String query = "SELECT * FROM user WHERE name = ? and password = ?";
   
    PreparedStatement ps = con.prepareStatement(query);
    ps.setString(1, getUsername());
    ps.setString(2, getPassword());
    ResultSet rs = ps.executeQuery();


    try{
        rs.next();
        role = rs.getString("role");
    }
    catch (Exception e) {
        role = "failure";
    }


      rs.close();
      con.close();

       return role;
  }
  }