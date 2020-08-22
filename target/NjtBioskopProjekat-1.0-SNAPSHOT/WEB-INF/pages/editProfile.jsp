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
                    <input type="submit" value="Save changes" name="save" class="btn btn-outline-primary"/>
                </form>
            </div>
            <div class="col-md-3">
            </div>
            </div>
        </div>
        
    </body>
</html>
