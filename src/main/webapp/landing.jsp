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
        <link rel="stylesheet" href="/NJT/webjars/bootstrap/4.5.0/css/bootstrap.min.css">
    </head>
    <body>
        <h1>Hello landing!</h1>
        <div class="container">
            <form action="/NJT/app/landing" method="post">
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
<!--            <form action="/NJT/app/register" method="post">
                <input type="submit" id="Register" value="Register"/>
            </form>-->
        </div>
        <script type="text/javascript" src="/NJT/webjars/jquery/3.5.1/jquery.min.js"></script>
        <script type="text/javascript" src="/NJT/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    </body>
</html>
