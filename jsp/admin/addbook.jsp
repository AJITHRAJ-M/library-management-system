<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>ADD BOOK</title>
<body>
    <% if( session.getAttribute("role") == null  || !session.getAttribute("role").equals("admin")){
        response.sendRedirect("index.jsp");   
  }        
   %>

    <center>
    <form action="addbookadmin" method="post">
        <h2>ADD BOOK</h2>
        <table>
            <tr>
                <td>BOOk ID:</td>
                <td><input type="text" name="bookid" /></td>
                </tr>
            <tr>
         <td>BOOK Name:</td>
         <td><input type="text" name="bookname" /></td>
           </tr>
            <tr>
                <td>Author:</td>
                <td><input type="text" name="author" /></td>
            </tr>
        </table>
        <input type="submit" value="save" />
        <br>
    </form>
        <br>
    </form>
    </center>

</body>
</html>
