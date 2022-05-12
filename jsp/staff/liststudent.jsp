<%@ taglib prefix = "s" uri = "/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student List</title>
    </head>
     <h1>  Student LIST </h1>
    <body>
        <s:iterator value = "student" status = "statusVar">
            <tr>
            <td><s:property/><br></td>
           </tr>
           </s:iterator>
    </body>
</html>

   