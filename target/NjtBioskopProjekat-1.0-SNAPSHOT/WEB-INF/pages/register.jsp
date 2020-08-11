<%-- 
    Document   : register
    Created on : Aug 5, 2020, 8:29:20 PM
    Author     : Negra
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>This is register!</title>
        
    </head>
    <body>
        <div class="container" style="height: 60px; text-align: center; margin-top:  10px;">
            <h3>You are one step away from being our member! Please register here.</h3>
        </div>
        <div class="container">
            <div class="row ">
                <div class="col-md-3">
                </div>

                <div class="col-md-6 border border-primary rounded" style="padding: 20px;">
                    <form action="<c:url value="/register/save"/>" method="post">
                        <div class="form-group">
                            <label>First name</label>
                            <div> 
                                <input type="text" id="firstname" name="firstname" class="form-control"/> 
                            </div>
                        </div>
                        <div class="form-group">
                            <label>Last name</label>
                            <div> 
                                <input type="text" id="lastname" name="lastname" class="form-control"/> 
                            </div>
                        </div>
                        <div class="form-group">
                            <label>Email</label>
                            <div> 
                                <input type="text" id="email" name="email" class="form-control"/> 
                            </div>
                        </div>
                        <div class="form-group">
                            <label>Username</label>
                            <div> 
                                <input type="text" id="username" name="username" class="form-control"/> 
                            </div>
                        </div>
                        <div class="form-group">
                            <label>Password</label>
                            <div> 
                                <input type="password" id="password" name="password" class="form-control"/> 
                            </div>
                        </div>
                        <p/>
                        <div class="text-center">
                        <input type="submit" id="Register" value="Register" class="btn btn-outline-primary"/>
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
