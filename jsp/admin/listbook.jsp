<%@ taglib prefix = "s" uri = "/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Book List</title>
    </head>
     <h1>  BOOK LIST </h1>
    <body>
        <s:iterator value = "book" status = "statusVar">
            <tr>
            <td><s:property/><br></td>
           </tr>
           </s:iterator>
    </body>
</html>