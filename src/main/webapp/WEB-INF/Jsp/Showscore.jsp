<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2017/10/24
  Time: 20:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改成绩</title>
</head>
<body>
<table align="center" border="1" width="50%">
    <tr>
        <td>姓名</td>
        <td>考号</td>
        <td>班级</td>
        <td>语文成绩</td>
        <td>数学成绩</td>
        <td>英语成绩</td>
    </tr>
    <tr>
        <td>${show.stuname}</td>
        <td>${show.stuid}</td>
        <td>${show.stuclass}</td>
        <td>${show.chinscore}</td>
        <td>${show.mathscore}</td>
        <td>${show.engscore}</td>
    </tr>
</table>
</body>
</html>
