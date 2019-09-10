<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: tianhan
  Date: 2019/9/10
  Time: 22:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>showList</title>
</head>
<c:forEach items="${List}" var="temp">
    <table border="1">
        <tr>
            <th>id</th>
            <th>姓名</th>
            <th>操作</th>
        </tr>
        <tr>
            <td>${temp.id}</td>
            <td>${temp.name}</td>
            <td><a href="${pageContext.request.contextPath}/findById/${temp.id}">显示具体</a>
                <a href="${pageContext.request.contextPath}/deletePerson/${temp.id}">删除</a>
            </td>
        </tr>
    </table>
</c:forEach>
</html>
