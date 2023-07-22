<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
</head>
<body>
    <h1>Welcome!</h1>
    <%-- Retrieve username and password from session --%>
    <p>Your username is: <strong><%= session.getAttribute("username") %></strong></p>
    <p>Your password is: <strong><%= session.getAttribute("password") %></strong></p>
</body>
</html>
