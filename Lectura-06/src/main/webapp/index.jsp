<%-- 
    Document   : index
    Created on : 12/11/2016, 08:04:54 AM
    Author     : Cristian Duarte
--%>
<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="error.html" %>
<!-- Importaciones -->
<%@page import="java.util.Date" %>
<%@page import="java.text.SimpleDateFormat" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!private Date fecha;%>
        
        <%! 
            public String convertirfecha() {
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                return sdf.format(fecha);
            }
        %>
        <h1>La fecha actual es: </h1>
        <% fecha = new Date(); %>
        <%= convertirfecha() %><br><br>
        <h1>EXPRESSION LANGUAGE:</h1>
        <h3>1. Cadenas:</h3>
        ${'Hola'}${'Mundo'}<br>
        
        <h3>2. Operadores Aritmeticos:</h3>
        
        5+8 = ${5+8}<br>
        8-9 = ${8-9}<br>
        7*2 =${7*2}<br>
        10/4 =${10/4}<br>
        10/4 =${10 div 4}<br>
        85% 2 =${85% 2}<br>
        85% 2 =${85 mod 2}<br>
        3 + "8.0" =${3 + "8.0"}<br>
        <h3>3. Operadores Logicos:</h3>
        true and false = ${true and false}<br>
        false or true = ${false or true}<br>
        not true = ${not true}<br><br>
        
        8 = 8   = ${8 == 8}<br>
        8 = 8   = ${8 eq 8}<br><br>        
        10>5    = ${10 > 5}<br>
        10>5    = ${10 gt 5}<br><br>        
        3>=3    = ${3 >= 3}<br>
        3>=3    = ${3 ge 3}<br><br>        
        4<5     = ${4 < 5}<br>
        4<5     = ${4 lt 5}<br><br>        
        4<=5     = ${4 <= 5}<br>
        4<=5     = ${4 le 5}<br><br>
        
        <h3>4. Operador empty:</h3>
        
        [${Cristian}]
        <h3>Operador:</h3>
        ${empty Cristian}
        
        <h3>5. Operador []:</h3>
        
        <div style="padding-bottom: 8vh"></div>
        <%@include file="WEB-INF/jspf/footer.jspf" %>
    </body>
</html>
