<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2017/10/25
  Time: 19:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员界面</title>
</head>
<body>
<table width="45%" align="center" border="1">
    <tr>
        <td colspan="4"><a href="addstu">添加学生信息</a></td>
    </tr>
    <tr>
        <td>考号</td>
        <td>姓名</td>
        <td>班级</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${showlist}" var="bean">
        <tr>
            <td>${bean.stuid}</td>
            <td>${bean.stuname}</td>
            <td>${bean.stuclass}</td>
            <td><a href="/delete?id=${bean.stuid}">删除</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
