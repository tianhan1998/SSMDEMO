<%--
  Created by IntelliJ IDEA.
  User: tianhan
  Date: 2019/9/10
  Time: 22:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>findOne</title>
</head>
<body>
<table border="1">
    <tr>
        <th>id</th>
        <th>姓名</th>
        <th>生日</th>
        <th>操作</th>
    </tr>
    <tr>
        <td>${Person.id}</td>
        <td>${Person.name}</td>
        <td>${Person.birthday}</td>
        <td><a href='${pageContext.request.contextPath}/updateWho/${Person.id}'>修改</a></td>
    </tr>
</table>
</body>
</html>
