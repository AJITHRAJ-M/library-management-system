<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Admin Home</title>
     </head>

    <% if( session.getAttribute("role") == null  || !session.getAttribute("role").equals("admin")){
          response.sendRedirect("index.jsp");   
    }        
     %>
<body>
    <center>
        <h1>ADMIN Home</h1>
          <div>
              <h2>
          <a href="addstudentadmin">Add Student</a>
         </h2>
        <h2>
            <a href="addstaffadmin">Add Staff</a>      
        </h2>
        <h2>
            <a href="addBookadmin">Add Book</a>      
        </h2>
        <h2>
            <a href="liststudentadmin">List Student</a>      
        </h2>
        <h2>
            <a href="liststaffadmin">List Staff</a>      
        </h2>
        <h2>
            <a href="listbookadmin">List Book</a>      
        </h2>
        <h2>
            <a href="liststudentbybookadmin">List Student By holding book</a>      
        </h2>

        <h2>
            <a href="logout">LOGOUT</a>      
        </h2>
      
        <br>
        </div>
    </center>
</body>
</html>