<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>

<form action="CounterServlet" method="GET">
    inc: <input type="text" name="inc" value="1">
    <input type="submit" value="CounterServlet GET inc">
</form>

<form action="CounterServlet" method="GET">
     dec: <input type="text" name="dec" value="1">
    <input type="submit" value="CounterServlet GET dec">
</form>

<br>

    <form action="CounterServlet" method="POST">
        <br>inc: <input type="text" name="inc" value="1">
        <input type="submit" value="CounterServlet POST inc">
    </form>


    <form action="CounterServlet" method="POST">
        dec: <input type="text" name="dec" value="1">
        <input type="submit" value="CounterServlet POST dec">
    </form>


</body>
</html>