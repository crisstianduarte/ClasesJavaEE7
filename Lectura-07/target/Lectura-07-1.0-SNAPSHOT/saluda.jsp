<%-- 
    Document   : saluda
    Created on : 12/11/2016, 11:48:29 AM
    Author     : INTECAP1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="saluda" class="co.edu.intecap.lectura07.SaludaBean" scope="session" />
        <%--<jsp:setProperty name="saluda" property="nombre" value="${param['Nombre']}" />
        <jsp:setProperty name="saluda" property="color" value="${param['Color']}"/>--%>
        <jsp:setProperty name="saluda" property="*"/>
        
        <div style="border-radius: 5px;border:1px solid ${saluda.color}; color:${saluda.color};  width: 30vw;text-align: center;margin: auto; margin-top: 100px;padding: 0 0 20px 0;box-shadow: 5px,5px,5px,5px;">
            <h1>FORMULARIO</h1>
            <%--<h3>Hola <jsp:getProperty name="saluda" property="nombre" /></h3>--%>
            <h3>Hola ${saluda.nombre}</h3>
        </div>

    </body>
</html>
