<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2017/10/26
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>二次考试</title>
</head>
<body>
<table width="45%" align="center" border="1">
    <tr>
        <td>考号</td>
        <td>姓名</td>
        <td>已报课程</td>
        <td>考试时间</td>
        <td>考试地点</td>
    </tr>
    <c:forEach items="${list}" var="bean">
        <tr>
            <td>${bean.stuid}</td>
            <td>${bean.stuname}</td>
            <td>${bean.couse}</td>
            <td>${bean.testtime}</td>
            <td>${bean.testaddre}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
