<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <title>LOGIN PAGE</title>
        <style>
            div{
            text-align: left;
            font-weight:solid;
            font-family:sans-serif;
            border:2px solid black;
            width:300px;
            height:120px;
            border-radius: 20px;
            padding:30px;
            background-color: rgba(50,50,50,0.4);
            }
            #btn{
                background-color: black;
                color:white;
                size:20px;
            }
        </style>
     </head>

<body>
    <center>
        <h2> WELCOME TO LIBRARY MANAGEMENT </h2>
    <form action="loginAction">
        <h2>LOGIN</h2>
        <div>
            User id:
            <input type="text" name="userid" placeholder="userid"/>
              <br>
              <br>
         User Name:
         <input type="text" name="username" placeholder="username"/>
           <br>
            <br>
            User Password:
            <input type="password" name="password" placeholder="password"/>
            <br>
        <br>
        <input id="btn" type="submit" value="login" />
        <br>
        </div>
    </center>
        </form>
</body>
</html>