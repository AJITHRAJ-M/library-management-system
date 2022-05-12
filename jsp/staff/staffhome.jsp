<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Staff Home</title>
     </head>

<body>
    <% if( session.getAttribute("role") == null  || !session.getAttribute("role").equals("staff")){
         response.sendRedirect("index.jsp");   
  }        
   %>
    <center>
        <h2>Staff Home</h2>
          <div>
              <h2>
          <a href="addStudentstaff">Add Student</a>
         </h2>
         <h2>
            <a href="addBookstaff">Add Book</a>
        </h2>
        <h2>
            <a href="liststudentstaff">List Student</a>      
        </h2>
        <h2>
            <a href="listbookstaff">List Book</a>      
        </h2>
         
        <h2>
            <a href="logout">LOGOUT</a>      
        </h2>


        <br>
        </div>
    </center>
</body>
</html>