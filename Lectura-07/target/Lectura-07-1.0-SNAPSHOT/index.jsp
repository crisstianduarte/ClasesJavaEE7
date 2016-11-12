<%-- 
    Document   : index
    Created on : 12/11/2016, 11:40:11 AM
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
        <form action="saluda.jsp">
            <div style="border-radius: 5px;border:1px solid black; width: 30vw;text-align: center;margin: auto; margin-top: 100px;padding: 0 0 20px 0;box-shadow: 5px,5px,5px,5px;">
            <h1>FORMULARIO</h1>
            Nombre: <input style="width: 140px;" type="text" name="nombre" /><br/><br/>
            Color Favorito: 
            <select name="color" style="width: 100px;" >
                <option>- Seleccione -</option>
                <option>Black</option>
                <option>Red</option>
                <option>Blue</option>
                <option>Gray</option>
                <option>Yellow</option>
            </select><br><br>
            <input type="submit" value="Enviar" name="BtnEnviar" />
            </div>
            </form>
    </body>
</html>
