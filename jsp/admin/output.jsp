<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>Output</title>
<body>
    <center>
      <% if( session.getAttribute("role") == null  || !session.getAttribute("role").equals("admin")){
        response.sendRedirect("index.jsp");   
  }        
   %>
      ADDED SUCCESSFULLY
      <h2>
        <a href="adminhome">home</a>      
     </h2>


      <h2>
        <a href="logout">LOGOUT</a>      
    </h2>
  
    </center>
    
</body>
</html>
