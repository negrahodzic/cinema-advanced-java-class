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
        
    </head>
    <body>
       
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

            <div class="row">
                <c:forEach var="projection" items="${projections}" varStatus="loop">
                    <div class="col-md-12">
                        <div class="card" style="width: 100%;">
                            <div class="card-body">
                                <div class="row">
                                    <div class="col-md-2 text-center align-items-center">
                                        <img src="../star.png" class="card-img-top" alt="Here goes image" style="height: 5rem; width: 5rem;">
                                    </div>
                                    <div class="col-md-10">
                                        <ul class="list-group list-group-horizontal justify-content-around align-items-center" >                                   
                                            <li class="list-group-item" style="border: 0 none;">${projection.movie.title}</li>
                                            <li class="list-group-item" style="border: 0 none;">${projection.dateTimeOfProjection}</li>
                                            <li class="list-group-item" style="border: 0 none;">${projection.technology}</li>
                                            <li class="list-group-item" style="border: 0 none;">${projection.edited}</li>  
                                            <li class="list-group-item" style="border: 0 none;">${projection.room.roomName}</li>  
                                            <li class="list-group-item" style="border: 0 none;"><a href="<c:url value="/searchProjections/${projection.projectionId}/createReservation"/>" class="btn btn-outline-primary">Create reservation</a></li>   
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>

        </div>


        
    </body>
</html>
