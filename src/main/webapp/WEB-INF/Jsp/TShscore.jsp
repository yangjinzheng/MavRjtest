<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2017/10/20
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传成绩</title>
</head>
<body>
<table border="1" width="50%" align="center">
        <tr>
            <td>考号</td>
            <td>姓名</td>
            <td>班级</td>
            <td>语文成绩</td>
            <td>数学成绩</td>
            <td>英语成绩</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${stud}" var="bean" varStatus="status">
        <tr>
            <td>${bean.stuid}</td>
            <td>${bean.stuname}</td>
            <td>${bean.stuclass}</td>
            <td>${bean.chinscore}</td>
            <td>${bean.mathscore}</td>
            <td>${bean.engscore}</td>
            <td>
                <a href="Tupdate?id=${bean.stuid}">上传成绩</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
