<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : searchProjections
    Created on : Aug 6, 2020, 6:10:44 PM
    Author     : remmi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search projections</title>
        <link rel="stylesheet" href="/NJT/webjars/bootstrap/4.5.0/css/bootstrap.min.css">
    </head>
    <body>
        <%@include file="/WEB-INF/templates/menu.jsp" %>
        <div class="container">
            <h1>search projections</h1>
            Search movie title:
            <input type="text" name="searchMovieTitle" value="" />
            Date:
            <select name="dateProjection">
                <option>10.10.2020</option>
                <option>12.10.2020</option>
                <option>13.2.2021</option>
            </select>
            <p/>
            <table border="0">
                <thead>
                    <tr>
                        <th>Date</th>
                        <th>Technology</th>
                        <th>Subtitle</th>
                        <th>Reservation</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="projection" items="${applicationScope.projections}">
                        <tr>
                            <td>${projection.dateOfProjection}</td>
                            <td>${projection.technology}</td>
                            <td>${projection.subtitle}</td>
                            <td><a href="/NJT/app/createReservation">Create reservation</a></td>
                        </tr>
                    </c:forEach>

                </tbody>
            </table>
        </div>


        <script type="text/javascript" src="/NJT/webjars/jquery/3.5.1/jquery.min.js"></script>
        <script type="text/javascript" src="/NJT/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>

    </body>
</html>
