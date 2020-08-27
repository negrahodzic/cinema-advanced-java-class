<%-- 
    Document   : addReview
    Created on : Aug 20, 2020, 11:29:18 PM
    Author     : Negra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add review</title>
    </head>
    <body>
        
        <div class="container">
            <br>
            <div class="row ">
                <div class="col-md-3">
                </div>

                <div class="col-md-6" style="padding: 20px;">
                    <h3>Add review: ${movieDto.title}</h3> 
                    <br> 
                    <form action="<c:url value="/reviews/${movieDto.movieId}/save"/>" method="post">
                        <div class="form-group">
                            <label>Grade</label>
                            <div> 
                                <input type="number" id="grade" name="grade" value = "" class="form-control"/> 
                            </div>
                        </div>
                        <div class="form-group">
                            <label>Comment</label>
                            <div> 
                                <input type="text" id="comment" name="comment" value = "" class="form-control"/> 
                            </div>
                        </div>
                        <p/>
                        <div class="text-center">
                        <input type="submit" id="addReview" value="Add review" class="btn btn-outline-primary"/>
                        </div>
                        <p/>
                    </form>

                </div>
                <div class="col-md-3">
                </div>
            </div>
        </div>    
    </body>
</html>
