<%-- 
    Document   : Welcome
    Author     : pluts
--%>

<%@page import="com.axxes.sample.beans.Person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <div>
            <%Person person = (Person)request.getAttribute("person");%>
            <p>
                Welkom <%=person.toString()%>!
            </p>
            
            <p><a href="index.jsp">Greet me again!</a></p>
        </div>
    </body>
</html>