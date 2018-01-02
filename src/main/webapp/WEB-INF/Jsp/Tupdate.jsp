<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2017/10/21
  Time: 20:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成绩上传</title>
</head>
<body>
<table border="1">
<form method="get" action="/Tupdatemk">
    <tr>
        <td>考号:</td>
        <td><input name="stuId" type="text" readonly="readonly " value="${studone.stuid}"/></td>
    </tr>
    <tr>
        <td>姓名:</td>
        <td><input name="stuName" type="text" readonly="readonly " value="${studone.stuname}"/> </td>
    </tr>
    <tr>
        <td>语文成绩:</td>
        <td><input type="number" step="0.01" placeholder="请输入数字" name="Chinscore"/></td>
    </tr>
    <tr>
        <td>数学成绩:</td>
        <td><input type="number" step="0.01" placeholder="请输入数字" name="Mathscore"/></td>
    </tr>
    <tr>
        <td>英语成绩:</td>
        <td><input type="number" step="0.01" placeholder="请输入数字" name="Engscore"/></td>
    </tr>
    <tr>
        <td colspan="2" align="center"><input type="submit" value="确认提交"/> </td>
    </tr>
</form>
</table>
</body>
</html>
