<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%--
  Created by IntelliJ IDEA.
  User: raven
  Date: 8/12/13
  Time: 3:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User register</title>
</head>
<body>
<form method="POST" action="register">
    <label>User name:</label>
    <input name="username" type="text" path="username"/>
    <label>Password:</label>
    <input name="password" type="password" path="password"/>
    <button type="submit">sign up</button>
</form>
</body>
</html>