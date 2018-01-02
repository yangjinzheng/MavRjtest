<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2017/10/22
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询成绩</title>
</head>
<body>
<table align="center" width="40%" border="1">
    <tr>
        <td>考号</td>
        <td>姓名</td>
        <td>班级</td>
        <td>${showname}</td>
    </tr>
    <c:forEach items="${showselect}" var="bean">
        <tr>
            <td>${bean.sid}</td>
            <td>${bean.sname}</td>
            <td>${bean.sclass}</td>
            <td>${bean.sscore}</td>
        </tr>

    </c:forEach>
</table>
</body>
</html>
