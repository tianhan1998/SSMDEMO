<%--
  Created by IntelliJ IDEA.
  User: tianhan
  Date: 2019/9/11
  Time: 1:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/updatePerson" method="post">
    <input type="text" name="Name" placeholder="${Person.name}">
    <input type="date" name="Birthday" placeholder="${Person.birthday}">
    <input type="hidden" name="id" value="${Person.id}">
    <input type="submit" value="提交修改">
</form>
</body>
</html>
