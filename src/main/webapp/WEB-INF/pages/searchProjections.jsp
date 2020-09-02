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
            <form action="<c:url value="/searchProjections/search"/>" method="post">
                <br> <p/>
                <div class="row">
                    <div class="col-md-4">
                        <input class="form-control" type="text" placeholder="Search movie title" name="searchMovieTitle">
                    </div>
                    <div class="col-md-3">
                        <select name="selectedDate" class="browser-default custom-select">
                            <option>- Choose date -</option>
                            <c:forEach var="date" items="${dates}" >
                                <option>${date}</option>
                            </c:forEach>
                        </select></div>
                    <div class="col-md-5">
                        <input type="submit" id="Search" value="Search" class="btn btn-outline-primary" onclick="myFunction()"/>
                    </div>
                </div>
                <p/>

            </form>

            <br>

            <div class="row">
                <c:forEach var="projection" items="${projections}" varStatus="loop">
                    <div class="col-md-12">
                        <div class="card" style="width: 100%;">
                            <div class="card-body">
                                <div class="row">
                                    <div class="col-md-2 text-center align-items-center">
                                        <img src="${pageContext.request.contextPath}/resources/images/${projection.movie.image}.png" class="card-img-top" alt="Here goes image" style="height: 5rem; width: 5rem;">
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
                        <br>
                    </div>
                </c:forEach>
            </div>

        </div>


                <br>
                <br>
    </body>
</html>
