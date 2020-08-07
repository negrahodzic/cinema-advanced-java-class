<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : myReservations
    Created on : Aug 6, 2020, 6:11:52 PM
    Author     : remmi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My reservations</title>
        <link rel="stylesheet" href="/NJT/webjars/bootstrap/4.5.0/css/bootstrap.min.css">
    </head>
    <body>
        <%@include file="/WEB-INF/templates/menu.jsp" %>
        <div class="container">
            <h1>My reservations</h1>
            <table border="0">
                <thead>
                    <tr>
                        <th>Movie</th>
                        <th>Date</th>
                        <th>Room</th>
                        <th>User</th>
                        <th>Cancel reservation</th>
                    </tr>
                </thead>
                <tbody>
                    <%--<c:forEach var="" items="">--%>  
                    <tr>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                    <%--</c:forEach>--%>

                </tbody>
            </table>
        </div>

        <script type="text/javascript" src="/NJT/webjars/jquery/3.5.1/jquery.min.js"></script>
        <script type="text/javascript" src="/NJT/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>

    </body>
</html>
