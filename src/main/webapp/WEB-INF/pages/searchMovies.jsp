
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
                    <div class="col-md-4">
                        <div class="card" style="width: 20rem;">
                            <img src="<c:url value="star.png"/>" class="card-img-top" alt="Here goes image" style="height: 8rem;">
                            <div class="card-body">
                                <h5 class="card-title">${movie.title}</h5>
                                <h6 class="card-subtitle mb-2 text-muted">${movie.duration} min, 
                                    &nbsp;<span class="badge badge-dark">${movie.genre.genreName}</span>
                                    &nbsp;<a href="<c:url value="/searchMovies/${movie.movieId}/seeReviews"/>" class="card-link">Reviews</a>
                                </h6>
                                <p class="card-text">${movie.description}</p>
                                <div class="text-center">
                                    <a href="<c:url value="/searchMovies/${movie.movieId}/seeProjections"/>" class="btn btn-outline-primary">See projections</a>
                                </div>
                            </div>
                        </div>
                        <p/>
                    </div>
                </c:forEach>
            </div>
        </div>
