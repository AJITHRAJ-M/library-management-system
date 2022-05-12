<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>Add Student</title>
<body>
    <% if( session.getAttribute("role") == null  || !session.getAttribute("role").equals("admin")){
        response.sendRedirect("index.jsp");   
  }        
   %>
    <center>
    <form action="addstudentadmin" method="post">
        <h2>ADD STUDENT</h2>
        <table>
            <tr>
                <td>USER ID:</td>
                <td><input type="text" name="userid" /></td>
                </tr>
            <tr>
         <td>Student Name:</td>
         <td><input type="text" name="name" /></td>
           </tr>
            <tr>
                <td>Password:</td>
                <td><input type="text" name="password" /></td>
            </tr>
        </table>
        <input type="submit" value="save" />
        <br>
    </form>
    </center>

</body>
</html>
