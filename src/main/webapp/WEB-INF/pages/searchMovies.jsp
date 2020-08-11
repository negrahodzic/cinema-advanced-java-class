
<%-- 
    Document   : searchMovies
    Created on : Aug 6, 2020, 6:09:51 PM
    Author     : remmi
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

            <div class="row">
                <c:forEach var="movie" items="${applicationScope.movies}">
                    <div class="col-md-3">
                        <div class="card" style="width: 14rem;">
                            <img src="<c:url value="star.png"/>" class="card-img-top" alt="Here goes image" style="height: 8rem;">
                            <div class="card-body">
                                <h5 class="card-title">${movie.title}</h5>
                                <h6 class="card-subtitle mb-2 text-muted">${movie.length} min, <span class="badge badge-dark">${movie.genre}</span></h6>
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

        
    </body>
</html>
