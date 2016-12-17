<%-- 
    Document   : pais
    Created on : 26/11/2016, 09:09:28 AM
    Author     : Cesar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <c:choose>
            <c:when test="${param['pais-seleccionado'] eq 'COLOMBIA'}">
                <img src="co.png" alt="Colombia"/>
            </c:when>
            <c:when test="${param['pais-seleccionado'] eq 'BRASIL'}">
                <img src="br.png" alt="Brasil"/>
            </c:when>
            <c:when test="${param['pais-seleccionado'] eq 'VENEZUELA'}">
                <img src="ve.png" alt="Venezuela"/>
            </c:when>
            <c:when test="${param['pais-seleccionado'] eq 'ECUADOR'}">
                <img src="ec.png" alt="Ecuador"/>
            </c:when>
            <c:when test="${param['pais-seleccionado'] eq 'PANAMA'}">
                <img src="pa.png" alt="Panama"/>
            </c:when>
        </c:choose>
        
    </body>
</html>
