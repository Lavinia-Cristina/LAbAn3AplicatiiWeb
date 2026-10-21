<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<a href="CounterServlet?inc=1">CounterServlet GET</a>
<a href="CounterServlet?dec=1">CounterServlet DECREMENT GET</a>
<form action="CounterServlet" method="POST">
    <br>inc: <input type="text" name="inc" value="1">
    <br>dec: <input type="text" name="dec" value="1">
    <br><input type="submit" value="CounterServlet POST">
</form>
</body>
</html>