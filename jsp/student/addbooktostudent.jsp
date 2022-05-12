<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>ADD BOOK TO STUDENT</title>
<body>
    <% if( session.getAttribute("role") == null  || !session.getAttribute("role").equals("student")){
        response.sendRedirect("index.jsp");   
  }        
   %>
    <center>
    <form action="addbooktostudent" method="post">
        <h2>ADD BOOK TO STUDENT </h2>
        <table><tr> 
         <td>Student name:</td>
         <td><input type="text" name="studentname" /></td>
           </tr>
           <td>user id:</td>
           <td><input type="text" name="userid" /></td>
             </tr>
            <tr>
                <td>Book name</td>
                <td><input type="text" name="bookname" /></td>
            </tr>
        </table>
        <input type="submit" value="addbook" />
        <br>
    </form>
    </center>

</body>
</html>