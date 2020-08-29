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
        
        <div class="container">
            <br>
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
                        <td><a href="<c:url value="/myReservations/${reservation.reservationId}/delete"/>" class="card-link" onclick="myFunction()">Delete</a></td>
                    </tr>
                    </c:forEach>

                </tbody>
            </table>
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
