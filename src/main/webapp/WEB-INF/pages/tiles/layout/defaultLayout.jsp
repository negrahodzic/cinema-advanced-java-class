<%-- 
    Document   : defaultLayout
    Created on : Aug 11, 2020, 6:49:32 PM
    Author     : remmi
--%>

<!--<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%> 

<%@page isELIgnored="false" %>-->
<%@taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="ISO-8859-1">
        <title>
            <tiles:getAsString name="title"></tiles:getAsString>
            </title>
            <link rel="stylesheet" href="${pageContext.request.contextPath}/webjars/bootstrap/4.5.0/css/bootstrap.min.css">
    </head>
    <body>
        <br> <br> 
        <section id="menu">
            <tiles:insertAttribute name="menu"/>
        </section>

        <section id="site-content">
            <tiles:insertAttribute name="body"/>
        </section>

        <footer id="footer">
            <tiles:insertAttribute name="footer"/>
        </footer>

        <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/jquery/3.5.1/jquery.min.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    </body>
</html>
