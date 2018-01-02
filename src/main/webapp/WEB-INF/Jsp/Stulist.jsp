<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2017/10/26
  Time: 19:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询成绩</title>
</head>
<body>
<table align="center" width="45%" border="1">
    <tr>
        <td>考号</td>
        <td>姓名</td>
        <td>班级</td>
        <td>语文成绩</td>
        <td>数学成绩</td>
        <td>英语成绩</td>
    </tr>
    <tr>
        <td>${select.stuid}</td>
        <td>${select.stuname}</td>
        <td>${select.stuclass}</td>
        <td>${select.chinscore}</td>
        <td>${select.mathscore}</td>
        <td>${select.engscore}</td>
    </tr>
</table>
</body>
</html>
