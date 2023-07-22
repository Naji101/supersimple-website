<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>site page !</h1>
<form action="http://localhost:8080/SimpleLogin/loginServlet" method="post">
  <!-- Hidden field for login action -->
  <input type="hidden" name="action" value="site">
<input type="hidden" name="username" value="<%= session.getAttribute("username") %>">
<input type="hidden" name="password" value="<%= session.getAttribute("password") %>">
  <input type="submit" value="Submit">
</form>


</body>
</html>
