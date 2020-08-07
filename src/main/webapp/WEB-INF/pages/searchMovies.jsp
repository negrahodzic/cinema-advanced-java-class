<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%-- 
    Document   : searchMovies
    Created on : Aug 6, 2020, 6:09:51 PM
    Author     : remmi
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search movies</title>
        <link rel="stylesheet" href="/NJT/webjars/bootstrap/4.5.0/css/bootstrap.min.css">
    </head>
    <body>
        <%@include file="/WEB-INF/templates/menu.jsp" %>
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
            <table border="0">
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
            </table>

        </div>

        <script type="text/javascript" src="/NJT/webjars/jquery/3.5.1/jquery.min.js"></script>
        <script type="text/javascript" src="/NJT/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>

    </body>
</html>
