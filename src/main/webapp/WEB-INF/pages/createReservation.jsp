<%-- 
    Document   : createReservation
    Created on : Aug 6, 2020, 6:11:17 PM
    Author     : remmi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create reservation</title>
        
    </head>
    <body>
        
       <div class="container">
        
            <div class="row ">
                <div class="col-md-3">
                </div>
            
            <div class="col-md-6" style="padding: 20px;">
                <form action="<c:url value="/myReservations/save"/>" method="post">
                    <p/>
                    Projection ID:
                    <input type="text" name="projectionId" value="${projectionDto.projectionId}" class="form-control" readonly/>
                    <p/>
                    Date and time:
                    <input type="text" name="dateTimeOfProjection" value="${projectionDto.dateTimeOfProjection}" class="form-control" readonly/>
                    <p/>
                    Movie title:
                    <input type="text" name="movie" value="${projectionDto.movie.title}" class="form-control" readonly/>
                    <p/>
                    Technology:
                    <input type="text" name="technology" value="${projectionDto.technology}" class="form-control" readonly/>
                    <p/>
                    Edited:
                    <input type="text" name="edited" value="${projectionDto.edited}" class="form-control" readonly/>
                    <p/>
                    Room:
                    <input type="text" name="room" value="${projectionDto.room.roomName}" class="form-control" readonly/>
                    <p/>
                    Ticket quantity:
                    <input type="text" name="tickets" value="" class="form-control"/>
                    <p/>
                    <input type="submit" value="Confirm reservation" name="save" class="btn btn-outline-primary"/>
                </form>
            </div>
            <div class="col-md-3">
            </div>
            </div>
        </div>
        
    </body>
</html>
