<%-- 
    Document   : pais
    Created on : 26/11/2016, 09:20:15 AM
    Author     : capacitaciones
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:if test="${param['pais-seleccionado'] eq 'COLOMBIA'}">
            <c:out value="Esta en colombia" />
        </c:if>
        <c:if test="${param['pais-seleccionado'] eq 'BRASIL'}">
            <c:out value="Esta en brasil" />
        </c:if>
    </body>
</html>
