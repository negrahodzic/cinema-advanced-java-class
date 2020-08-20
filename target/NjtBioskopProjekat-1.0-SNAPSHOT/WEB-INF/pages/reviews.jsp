<%-- 
    Document   : reviews
    Created on : Aug 6, 2020, 6:12:28 PM
    Author     : remmi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reviews</title>

    </head>
    <body>

        <div class="container">
            <br>
            <div class="jumbotron jumbotron-fluid">
                <div class="container" style="padding-left: 60px; padding-right: 60px;">
                    <h1 class="display-4">Reviews: ${movieDto.title}  
                        <div class="text-center">
                            <a href="<c:url value="/reviews/${movieDto.movieId}/add"/>" class="btn btn-outline-primary">Add Review</a>
                        </div>
                        <h6 class="card-subtitle mb-2 text-muted">${movieDto.duration} min, <span class="badge badge-dark">${movieDto.genre.genreName}</span></h6>
                    </h1>                    
                    <p class="lead">${movieDto.description}</p>
                </div>

                <div class="row" style="padding: 30px;">
                    <c:forEach var="review" items="${movieDto.reviews}"> 
                        <div class="col-md-4">
                            <div class="card" style="width: 20rem;">
                                <div class="card-body">
                                    <h5 class="card-title">Grade: ${review.grade}</h5>
                                    <h6 class="card-subtitle mb-2 text-muted">${review.user.username}</h6>
                                    <p class="card-text">${review.comment}</p>
                                    <!--<a href="#" class="card-link">Card link</a>-->  
                                    <!--<td><a href="<c:url value="/myReservations/${review.reviewId}/delete"/>" class="card-link">Delete</a></td>-->
                                </div>
                            </div>
                            <p/>
                        </div>
                    </c:forEach>
                </div>
            </div>




        </div>
    </body>
</html>
