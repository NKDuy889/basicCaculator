<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 3/2/2021
  Time: 4:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <input type="text" name="1"><br>
    <input type="text" name="2"><br>
    <button type="submit" name="count" value="+">+</button>
    <button type="submit" name="count" value="-">-</button>
    <button type="submit" name="count" value="x">x</button>
    <button type="submit" name="count" value="/">/</button>
    <br>
    <h3>Result = ${result}</h3>
</form>
</body>
</html>
