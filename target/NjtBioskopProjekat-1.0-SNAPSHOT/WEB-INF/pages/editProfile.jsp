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
        <link rel="stylesheet" href="/NJT/webjars/bootstrap/4.5.0/css/bootstrap.min.css">
    </head>
    <body>
        <%@include file="/WEB-INF/templates/menu.jsp" %>
        <div class="container">
            <h1>Edit profile</h1>
        <form action="<c:url value="/editProfile/save"/>" method="post">
            <p/>
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
            <input type="submit" value="Save changes" name="save" />
        </form>

        </div>
        <script type="text/javascript" src="/NJT/webjars/jquery/3.5.1/jquery.min.js"></script>
        <script type="text/javascript" src="/NJT/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>

    </body>
</html>
