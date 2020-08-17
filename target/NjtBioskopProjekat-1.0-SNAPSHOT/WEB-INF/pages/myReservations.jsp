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
        
    </head>
    <body>
        
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
                    <c:forEach var="reservation" items="${reservations}">  
                    <tr>
                        <td>${reservation.projection.movie.title}</td>
                        <td>${reservation.projection.dateTimeOfProjection}</td>
                        <td>${reservation.projection.room.roomName}</td>
                        <td>${reservation.user.username}</td>
                        <td><a href="<c:url value="/myReservations/${reservation.reservationId}/delete"/>" class="card-link">Delete</a></td>
                    </tr>
                    </c:forEach>

                </tbody>
            </table>
        </div>

        
    </body>
</html>
