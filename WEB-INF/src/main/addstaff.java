package main;

import java.sql.Connection;
import java.sql.Statement;

public class addstaff{
    private String name;
    private String password;
    private String userid;

    public String getName() {
        return name;
    }
  
     public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setName(String name ) {
        this.name = name;
    }
     public String getPassword(){
         return password;
     }
     
     public void setPassword(String password){
         this.password = password;
     }
    public String execute()  throws Exception {
        System.out.println("Debugging--------------- ADD STAFF");
        String role = "staff";
        try
        {
         
            Connection con =  java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/lms5","root","root");
            Statement st =con.createStatement();
           
            st.executeUpdate("insert into user(id,name , password ,role) values ('"+getUserid()+"','"+getName()+"','"+getPassword()+"','"+role+"')");
            System.out.println("Staff is Successfully inserted");
               
             return "success";
        }catch(Exception e){
            System.out.println("StaffName is Already present");
        }
       return "failure";
    }
}
    


      
