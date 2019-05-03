<%-- 
    Document   : index
    Author     : pluts
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Person</title>
    </head>
    <body>
        <div>
            <h1>Create new Person</h1>
            <form action="MakeServlet">
            <!--<form action="KtMakeServlet">-->
                <p> 
                    <label for="firstName"> First Name: </label>
                    <input type="text" name="firstName">
                </p>
                <p> 
                    <label for="lastName"> Last Name: </label>
                    <input type="text" name="lastName">
                </p>
                <p> 
                    <input type="submit" value="Send!" name="person"> 
                </p>
            </form>
        </div>
    </body>
</html>