package student;
import java.lang.String;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;



public class addbooktostudent{
    private String studentname;
    private String bookname ;
    private String userid;
    
    public String getBookname()
    {
        return bookname;
    }
  
     public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
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
         
            //Connection con = connectionprovider.getCon();
            //Statement st =con.createStatement();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =  java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/lms5","root","root");
            Statement st =con.createStatement();
            String query = "Select holdby from book where bookName=?";
            PreparedStatement ps = con.prepareStatement(query); 
            ps.setString(1,getBookname());
            java.sql.ResultSet rs  = ps.executeQuery();
            if(rs.next()){
                String student_id = rs.getString("holdby");
                if(student_id == null){
                    st.executeUpdate("update book set holdby ='"+getUserid()+"' where bookName = '"+getBookname()+"'");
                      return "success";
                }   
            }
        }catch(Exception e){
            System.out.println("BOOk is not Available");
        }
        System.out.println("BOOk is not Available");       
       return "failure";
 }
}
