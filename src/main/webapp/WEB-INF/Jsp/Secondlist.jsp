<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2017/10/23
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>二次考试</title>
</head>
<body>
<table align="center" width="40%" border="1">
    <tr>
        <td>考试名称</td>
        <td>考试时间</td>
        <td>考试地点</td>
        <td>考试人数</td>
        <td>操作</td>
    </tr>
    <c:forEach items="${second}" var="bean">
        <tr>
            <td>${bean.testname}</td>
            <td>${bean.testtime}</td>
            <td>${bean.testaddre}</td>
            <td>${bean.testnum}</td>
            <td><a href="/delsec?testname=${bean.testname}">取消</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
