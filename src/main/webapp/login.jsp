<%--
  Created by IntelliJ IDEA.
  User: monke
  Date: 10/23/2023
  Time: 12:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login page</title>
</head>
<body>
<form action="/servletkuy1_war_exploded/LoginServlet" method="post">
    <label for="uname">user-name</label>
    <input type="text" name="username" id="uname" value="${requestScope.username}"> <br>
    <label for="pass" id="pass">Password</label>
    <input type="password" name="pass" value = ${requestScope.password}>
    <input type="submit" value="submit">


</form>

</body>
</html>
