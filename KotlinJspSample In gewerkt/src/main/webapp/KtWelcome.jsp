<%-- 
    Document   : KtWelcome
    Author     : pluts
--%>

<%@page import="com.axxes.sample.beans.KotlinPerson"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Kotlin!</title>
    </head>
    <body>
        <div>
            <%KotlinPerson person = (KotlinPerson)request.getAttribute("person");%>
            <p>
                Welkom to Kotlin <%=person.toString()%>!
            </p>
            
            <p><a href="index.jsp">Greet me again!</a></p>
        </div>
    </body>
</html>