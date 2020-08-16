
<%-- 
    Document   : searchMovies
    Created on : Aug 6, 2020, 6:09:51 PM
    Author     : remmi
--%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search movies</title>

    </head>
    <body>

        <div class="container">
            <h1>Search movies</h1>
            Search movie title:
            <input type="text" name="searchMovieTitle" value="" />
            Movie genre:
            <select name="movieGenre">
                <option>Comedy</option>
                <option>Crime</option>
                <option>Thriller</option>
            </select>
            <p/>

            <div class="row">
                <c:forEach var="movie" items="${movies}" varStatus="loop">
                    <div class="col-md-3">
                        <div class="card" style="width: 14rem;">
                            <img src="<c:url value="star.png"/>" class="card-img-top" alt="Here goes image" style="height: 8rem;">
                            <div class="card-body">
                                <h5 class="card-title">${movie.title}</h5>
                                <h6 class="card-subtitle mb-2 text-muted">${movie.duration} min, <span class="badge badge-dark">${movie.genre.genreName}</span></h6>
                                <p class="card-text">${movie.description}
                                    <a href="<c:url value="/searchMovies/seeReviews"/>" class="card-link">Reviews</a>
                                </p>
                                <div class="text-center">
                                    <a href="<c:url value="/searchMovies/seeProjections"/>" class="btn btn-outline-primary">See projections</a>
                                </div>
                            </div>
                        </div>
                        <p/>
                    </div>
                </c:forEach>
            </div>
        </div>
<!--
<table class="table table-hover">
                <thead>
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">City code</th>
                        <th scope="col">City name</th>
                        <th scope="col">Action</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach
                        items="${cities}"
                        var="city"
                        varStatus="loop">
                        <tr>
                            <td>${loop.index+1}</td>
                            <td>${city.number}</td>
                            <td>${city.name}</td>
                            <td>
                                <ul class="navbar-nav mr-auto d-flex justify-content-end">
                                    <div class="dropdown">
                                        <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                            action
                                        </button>
                                        <div class="dropdown-menu" aria-labelledby="dropdownMenuButton">
                                            <a class="dropdown-item" href="<c:url value = "/city/${city.number}/delete/">

                                                </c:url>">Delete</a>

                                            <a class="dropdown-item" href="<c:url value = "/city/${city.number}/view/">

                                                </c:url>">View</a>
                                        </div>
                                    </div>
                                </ul>
                            </td>
                        </tr>
                    </c:forEach>


                </tbody>
            </table>

-->
    </body>
</html>




<!--            <table border="0">
                <thead>
                    <tr>
                        <th>Title</th>
                        <th>Description</th>
                        <th>Length</th>
                        <th>Genre</th>
                        <th>Reviews</th>
                        <th>See projections</th>
                    </tr>
                </thead>
                <tbody>
<c:forEach var="movie" items="${applicationScope.movies}">
    <tr>
        <td>${movie.title}</td>
        <td>${movie.description}</td>
        <td>${movie.length}</td>
        <td>${movie.genre}</</td>
        <td><a href="/NJT/app/reviews">Reviews</a></td>
        <td><a href="/NJT/app/searchProjections">See projections</a></td>
    </tr>
</c:forEach>
<c:forEach var="movie" items="movies">
</c:forEach>
</tbody>
</table>-->