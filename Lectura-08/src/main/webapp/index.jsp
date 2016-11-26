<%-- 
    Document   : Index
    Created on : 26/11/2016, 08:49:56 AM
    Author     : capacitaciones
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:useBean id="paisesbean" class="co.edu.intecap.lectura08.PaisesBean" scope="application"/>
    </head>
    <body>
        <form action="pais.jsp" method="GET">
            <h1>Hello World!</h1>
            <c:out value="Selecciona un pais" />
            <select name="pais-seleccionado">
                <c:forEach items="${paisesbean.paises}" var="pais">
                    <option label="${pais}">
                        <c:out value="${pais}"/>
                    </option>
                </c:forEach>
            </select><br/><br/>
            <input type="submit" value="Seleccionar" />
        </form>
    </body>
</html>
