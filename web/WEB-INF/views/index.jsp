<%--
  Created by IntelliJ IDEA.
  User: duc
  Date: 23/05/2019
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="app" method="post">
    Input currency: <input type="text" name="currency" value="${currency}">
    <br/>
    Input rate: <input type="text" name="rate" value="${rate}">
    <br/>
    <input type="submit" value="Submit">
    <p>${result}</p>
</form>
</body>
</html>
