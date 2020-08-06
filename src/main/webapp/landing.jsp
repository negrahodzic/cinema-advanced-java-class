<%-- 
    Document   : landing
    Created on : Aug 5, 2020, 7:42:24 PM
    Author     : Negra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>This is landing page</title>
        <link rel="stylesheet" href="/NJT/webjars/bootstrap/4.4.1/css/bootstrap.min.css">
    </head>
    <body>
        <h1>Hello landing!</h1>

        <form action="/NJT/app/home" method="post">
            Username:
            <div> 
                <input type="text" id="username" name="username"/> 
            </div>

            Password: 
            <div> 
                <input type="password" id="password" name="password"/> 
            </div>

            <p/>
            <input type="submit" id="Login" value="Log in"/>
            <p/>

        </form>
        <form action="/NJT/app/register" method="post">
            <input type="submit" id="Register" value="Register"/>
        </form>
        <script type="text/javascript" src="/NJT/webjars/jquery/3.0.0/jquery.min.js"></script>
        <script type="text/javascript" src="/NJT/webjars/bootstrap/4.4.1/js/bootstrap.min.js"></script>
    </body>
</html>
