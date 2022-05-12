<%@page import="java.sql.Connection"%>
<%@ taglib prefix = "s" uri = "/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student List</title>
    </head>
     <h1>  Student LIST </h1>
    <body>
        <s:iterator value = "map" status = "statusVar">
            <tr>
            <td><s:property value="key"/></td>
            <td><s:property value="value"/><br></td>
           </tr>
           </s:iterator>
    </body>
</html>
