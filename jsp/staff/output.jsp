<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<title>Output</title>
<body>
  <% if( session.getAttribute("role") == null  || !session.getAttribute("role").equals("staff")){
    response.sendRedirect("index.jsp");   
}        
%>
    <center>
      ADDED SUCCESSFULLY

      <h2>
        <a href="staffhome">home</a>      
     </h2>


      <h2>
        <a href="logout">LOGOUT</a>      
    </h2>
    </center>
     
</body>
</html>
