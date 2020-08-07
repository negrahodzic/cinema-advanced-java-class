<%-- 
    Document   : menu
    Created on : Aug 6, 2020, 4:48:54 PM
    Author     : remmi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
    </head>
    <body>

        <div class="container">

            <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
                <!-- Brand -->
                <a class="navbar-brand" href="#">Logo</a>

                <!-- Links -->
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="/NJT/app/searchMovies">Search movies</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="/NJT/app/searchProjections">Search projections</a>
                    </li>
      
                    <li class="nav-item">
                        <a class="nav-link" href="/NJT/app/myReservations">My reservations</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
                            My profile
                        </a>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="/NJT/app/editProfile">Edit profile</a>
                            <a class="dropdown-item" href="/NJT/app/logout">Logout</a>
                        </div>
                    </li>
                </ul>
            </nav>    

            <!-- Login as:${sessionScope.loginUser.username} -->

        </div>
    </body>
</html>



