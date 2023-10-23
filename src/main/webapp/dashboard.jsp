<%--
  Created by IntelliJ IDEA.
  User: monke
  Date: 10/23/2023
  Time: 1:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dasboard</title>
</head>
<body>
<h1>Your user is ${requestScope.username}</h1>
<form action="post">
    <input type="submit" value="Logout">
</form>

</body>
</html>
