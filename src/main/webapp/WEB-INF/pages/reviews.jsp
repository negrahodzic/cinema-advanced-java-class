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
                bottom: 60px;
                font-size: 17px;
            }

            #snackbar.show {
                visibility: visible;
                -webkit-animation: fadein 0.5s, fadeout 0.5s 2.5s;
                animation: fadein 0.5s, fadeout 0.5s 2.5s;
            }

            @-webkit-keyframes fadein {
                from {bottom: 0; opacity: 0;} 
                to {bottom: 60px; opacity: 1;}
            }

            @keyframes fadein {
                from {bottom: 0; opacity: 0;}
                to {bottom: 60px; opacity: 1;}
            }

            @-webkit-keyframes fadeout {
                from {bottom: 30px; opacity: 1;} 
                to {bottom: 0; opacity: 0;}
            }

            @keyframes fadeout {
                from {bottom: 60px; opacity: 1;}
                to {bottom: 0; opacity: 0;}
            }
        </style>
    </head>
    <body>
        <div class="container">
            <c:forEach var="review" items="${movieDto.reviews}"> 
                <c:choose>
                    <c:when test="${review.user.username == loggedUser.username}">   
                        <c:set var="grade" scope="request" value="${review.grade}"/>
                        <c:set var="comment" scope="request" value="${review.comment}"/>
                    </c:when>    
                    <c:otherwise>
                    </c:otherwise>
                </c:choose>
            </c:forEach>
            <br>
            <div class="jumbotron jumbotron-fluid">
                <div class="row">
                    <div class="col-md-9">
                        <div class="container" style="padding-left: 40px; ">
                            <h1 class="display-4">Reviews: ${movieDto.title}  </h1>
                            </h1> 
                            <h6 class="card-subtitle mb-2 text-muted">${movieDto.duration} min, <span class="badge badge-dark">${movieDto.genre.genreName}</span></h6>
                            <p class="lead">${movieDto.description}</p>
                        </div>
                    </div>
                    <div class="col-md-3 text-center align-items-center">
                        <br><br>
                        <c:if test="${not empty loggedUser}">
                            <button type="button" class="btn btn-outline-primary" data-toggle="modal" data-target="#exampleModal" data-grade=" " data-comment=" ">Add review</button>
                        </c:if>
                    </div>                   
                </div>

                <div class="row" style="padding: 30px;">
                    <c:forEach var="review" items="${movieDto.reviews}"> 
                        <div class="col-md-4">
                            <div class="card" style="width: 20rem;">
                                <div class="card-body">
                                    <div class="row">
                                        <div class="col-md-9">
                                            <h5 class="card-title">Grade: ${review.grade}</h5>
                                        </div>
                                        <div class="col-md-3" style="margin-top: 0; padding-top: 0;">
                                            <c:if test = "${review.user.username eq loggedUser.username && not empty loggedUser}">
                                                <button type="button" class="btn btn-link" data-toggle="modal" data-target="#exampleModal" style="padding-top: 0;" >Edit</button>
                                            </c:if>
                                        </div>
                                    </div>
                                    <h6 class="card-subtitle mb-2 text-muted">by ${review.user.username}</h6>
                                    <p class="card-text">${review.comment}</p>
                                </div>
                            </div>
                            <p/>
                        </div>
                    </c:forEach>
                </div>
            </div>

            <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h5 class="modal-title" id="exampleModalLabel">${movieDto.title}</h5>
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                        </div>
                        <div class="modal-body">
                            <div class="row ">
                                <div class="col-md-12" style="padding: 20px;">
                                    <form action="<c:url value="/reviews/${movieDto.movieId}/save"/>" method="post">
                                        <div class="form-group">
                                            <label>Grade</label>
                                            <div> 
                                                <input type="number" id="grade" name="grade" class="form-control" value="<c:out value = "${grade}"/>"/> 
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label>Comment</label>
                                            <div> 
                                                <textarea type="text" id="comment" name="comment" class="form-control"/><c:out value = "${comment}"/></textarea>
                                            </div>
                                        </div>
                                        <p/>
                                        <div class="text-right">
                                            <br>
                                            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                                            <input type="submit" id="addReview" value="Add review" class="btn btn-outline-primary" onclick="myFunction()"/>
                                        </div>
                                        <p/>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>                     
                </div>
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
