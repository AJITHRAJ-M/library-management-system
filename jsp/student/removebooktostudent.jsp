<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>REMOVE BOOK TO STUDENT</title>
<body>
    <% if( session.getAttribute("role") == null  || !session.getAttribute("role").equals("student")){
        response.sendRedirect("index.jsp");   
    }        
    %>
    <center>
    <form action="removebooktostudent" method="post">
        <h2>REMOVE BOOK TO STUDENT </h2>
        <table><tr> 
         <td>Student Name:</td>
         <td><input type="text" name="studentname" /></td>
           </tr>
           <tr>
            <td>User id:</td>
            <td><input type="text" name="userid" /></td>
        </tr>
            <tr>
                <td>Book Name:</td>
                <td><input type="text" name="bookname" /></td>
            </tr>
        </table>
        <input type="submit" value="removebook" />
        <br>
    </form>
    </center>

</body>
</html>