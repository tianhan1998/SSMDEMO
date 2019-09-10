<%--
  Created by IntelliJ IDEA.
  User: tianhan
  Date: 2019/9/10
  Time: 22:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>主页</title>
</head>
<body>
<h2>增</h2>
<form action="${pageContext.request.contextPath}/addPerson" method="post">
    <input type="text" name="Name">
    <input type="date" name="Birthday">
    <input type="submit" value="提交">
</form>
<h2>查</h2>
<a href="${pageContext.request.contextPath}/selectList"><input type="button" value="查找全部"></a>
</body>
</html>
