<%-- 
    Document   : index
    Created on : 26/11/2016, 08:42:22 AM
    Author     : Cesar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" 
              content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <jsp:useBean id="paisesBean" 
                     class="co.edu.intecap.lecture08.PaisesBean" 
                     scope="application"/>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:out value="Selecciona un pais"/>      
        <form method="GET" action="pais.jsp">
            <select name="pais-seleccionado">
                <c:forEach items="${paisesBean.paises}" var="pais">
                    <option label="${pais}">
                        <c:out value="${pais}"/>
                    </option>
                </c:forEach>
            </select>
            <input type="submit" value="Seleccionar"/>
        </form>
    </body>
</html>
