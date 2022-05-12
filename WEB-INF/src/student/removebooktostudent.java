package student;
import java.lang.String;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;



public class removebooktostudent{
    private String studentname;
    private String bookname;
    private String userid;

    public String getUserid(){
        return userid;
    }
    public void setUserid(String userid){
        this.userid = userid;
    }

    public String getBookname() {
        return bookname;
    }
  
     public void setBookname(String bookname) {
        this.bookname = bookname;
    }
     public String getStudentname(){
         return studentname;
     }
     
     public void setStudentname(String studentname ){
         this.studentname = studentname;
     }
    public String execute()  throws Exception {
        try{
            System.out.println("Debugging ----1");
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =  java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/lms5","root","root");
            System.out.println("Debugging ----2");
            Statement st =con.createStatement();
             String query = "Select holdby from book where bookname = ? ";
             PreparedStatement ps = con.prepareStatement(query); 
            ps.setString(1,getBookname());
            java.sql.ResultSet rs  = ps.executeQuery();
            System.out.println(getBookname());

          
             System.out.println(getUserid());
             rs.next();
             String student_id = rs.getString("holdby");
           
             if(student_id.equals(getUserid())){
                   st.executeUpdate("update book set holdby = null  where bookname = '"+getBookname()+"'");
                  return "success";
            }
        }catch(Exception e){
            System.out.println(" you are not holding the book");
        }
        System.out.println(" you are not holding the book");
       return "failure";
 }
}
