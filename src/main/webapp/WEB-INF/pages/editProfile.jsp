<%-- 
    Document   : editProfile
    Created on : Aug 6, 2020, 6:13:19 PM
    Author     : remmi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit profile</title>
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
                bottom: 60px;
                font-size: 17px;
            }

            #snackbar.show {
                visibility: visible;
                -webkit-animation: fadein 0.5s, fadeout 0.5s 2.5s;
                animation: fadein 0.5s, fadeout 0.5s 2.5s;
            }

            @-webkit-keyframes fadein {
                from {bottom: 0; opacity: 0;} 
                to {bottom: 60px; opacity: 1;}
            }

            @keyframes fadein {
                from {bottom: 0; opacity: 0;}
                to {bottom: 60px; opacity: 1;}
            }

            @-webkit-keyframes fadeout {
                from {bottom: 60px; opacity: 1;} 
                to {bottom: 0; opacity: 0;}
            }

            @keyframes fadeout {
                from {bottom: 60px; opacity: 1;}
                to {bottom: 0; opacity: 0;}
            }
        </style>
    </head>
    <body>

        <div class="container">

            <div class="row ">
                <div class="col-md-3">
                </div>

                <div class="col-md-6" style="padding: 20px;">
                    <form action="<c:url value="/editProfile/save"/>" method="post">
                        <p/>
                        First name:
                        <input type="text" name="firstname" value="${loggedUser.firstname}" class="form-control" />
                        <p/>
                        Last name:
                        <input type="text" name="lastname" value="${loggedUser.lastname}" class="form-control"/>
                        <p/>
                        Email:
                        <input type="text" name="email" value="${loggedUser.email}" class="form-control"/>
                        <p/>
                        Username:
                        <input type="text" name="username" value="${loggedUser.username}" class="form-control"/>
                        <p/>
                        Password:
                        <input type="password" name="password" value="${loggedUser.password}" class="form-control"/>
                        <p/>
                        <input type="submit" value="Save changes" name="save" class="btn btn-outline-primary" onclick="myFunction()"/>
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
