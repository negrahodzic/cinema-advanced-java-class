<%-- 
    Document   : register
    Created on : Aug 5, 2020, 8:29:20 PM
    Author     : Negra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>This is register.jsp!</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <form action="register" method="POST">
            First name:
            <input type="text" name="firstname" value="" />
            <p/>
            Last name:
            <input type="text" name="lastname" value="" />
            <p/>
            Email:
            <input type="text" name="email" value="" />
            <p/>
            Username:
            <input type="text" name="username" value="" />
            <p/>
            Password:
            <input type="password" name="password" value="" />
           
            <p/>
            <input type="submit" value="Register" name="register" />
        </form>
    </body>
</html>
