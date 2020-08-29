<%-- 
    Document   : landing
    Created on : Aug 5, 2020, 7:42:24 PM
    Author     : Negra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>This is landing page</title>
        <style>
            #snackbar {
                visibility: hidden;
                min-width: 250px;
                margin-left: -125px;
                background-color: #333;
                color: #fff;
                text-align: center;
                border-radius: 2px;
                padding: 16px;
                position: fixed;
                z-index: 1;
                left: 50%;
                bottom: 30px;
                font-size: 17px;
            }

            #snackbar.show {
                visibility: visible;
                -webkit-animation: fadein 0.5s, fadeout 0.5s 2.5s;
                animation: fadein 0.5s, fadeout 0.5s 2.5s;
            }

            @-webkit-keyframes fadein {
                from {bottom: 0; opacity: 0;} 
                to {bottom: 30px; opacity: 1;}
            }

            @keyframes fadein {
                from {bottom: 0; opacity: 0;}
                to {bottom: 30px; opacity: 1;}
            }

            @-webkit-keyframes fadeout {
                from {bottom: 30px; opacity: 1;} 
                to {bottom: 0; opacity: 0;}
            }

            @keyframes fadeout {
                from {bottom: 30px; opacity: 1;}
                to {bottom: 0; opacity: 0;}
            }
        </style>
    </head>
    <body>

        <div class="container" style="height: 100px; text-align: center; margin-top:  50px;">
            <h3>Welcome to our cinema page! Please login to continue.</h3>
        </div>

        <div class="container">
            <div class="row ">
                <div class="col-md-3">
                </div>
                <div class="col-md-6 border border-primary rounded" style="padding: 20px;">
                    <form action="${pageContext.request.contextPath}/login" method="post">
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
                        <div class="text-center">
                            <input type="submit" id="Login" value="Log in" class="btn btn-outline-primary" onclick="myFunction()"/>
                            <p/>
                            <p> Don't have account? <a href="<c:url value="/register"/>">Register</a>. </p>
                        </div>
                    </form>

                </div>
                <div class="col-md-3">    
                </div>
            </div>                             
        </div> 

        <div id="snackbar">${sessionScope.message}</div>

        <c:if test="${not empty sessionScope.message}">
            <script>
                var x = document.getElementById("snackbar");
                x.className = "show";
                setTimeout(function () {
                    x.className = x.className.replace("show", "");
                }, 3000);
            </script>
            <c:set var = "message" value = "" scope="session"/>
        </c:if>


    </body>
</html>
