<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Student Home</title>
     </head>

<body>
    <% if( session.getAttribute("role") == null  || !session.getAttribute("role").equals("student")){
        response.sendRedirect("index.jsp");   
    }        
    %>
    <center>
        <h2>Student Home</h2>
          <div>
         <h2>
            <a href="addBooktostudent">Pick Book</a>
        </h2>
        <h2>
            <a href="removeBooktostudent">Remove Book</a>      
        </h2>

        <h2>
            <a href="logout">LOGOUT</a>      
        </h2>
        <br>
        </div>
    </center>
</body>
</html>