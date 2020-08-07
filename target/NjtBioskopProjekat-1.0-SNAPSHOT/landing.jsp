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
        
        <div class="container" style="height: 100px; text-align: center; margin-top:  50px;">
            <h3>Welcome to our cinema page! Please login to continue.</h3>
        </div>
        <div class="container align-middle">
            <div class="row ">
                <div class="col-md-3">
                </div>
                <div class="col-md-6 border border-primary rounded" style="padding: 20px;">
                    <form action="/NJT/app/home" method="post">
                        <div class="form-group">
                            <label>Username</label>
                            <div> 
                                <input type="text" id="username" name="username" class="form-control"/> 
                            </div>
                        </div>
                        <div class="form-group">
                            <label>Password</label>
                            <div> 
                                <input type="password" id="password" name="password" class="form-control"/> 
                            </div>
                        </div>
                        <p/>
                        <input type="submit" id="Login" value="Log in" class="btn btn-outline-primary"/>
                        <p/>
                    </form>
                    <p> Don't have account? <a href="/NJT/app/register">Register</a>. </p>
                </div>
                <div class="col-md-3">    
                </div>
            </div>
            <script type="text/javascript" src="/NJT/webjars/jquery/3.5.1/jquery.min.js"></script>
            <script type="text/javascript" src="/NJT/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    </body>
</html>
