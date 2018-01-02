<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2017/10/26
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>二次考试</title>
</head>
<body>
<table width="45%" align="center" border="1">
    <form action="/Baomingsub" method="get">
        <tr>
            <td>考号:</td>
            <td><input type="number" placeholder="请输入数字" name="stuid"/> </td>
        </tr>
        <tr>
            <td>课程:</td>
            <td><input type="text" name="couse" readonly="readonly " value="${stu.couse}"/> </td>
        </tr>
        <tr>
            <td>考试时间:</td>
            <td><input type="text" name="testtime" readonly="readonly" value="${stu.testtime}" ></td>
        </tr>
        <tr>
            <td>考试地点:</td>
            <td><input type="text" name="testaddre" readonly="readonly" value="${stu.testaddre}"/></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input align="center" type="submit" value="提交"/></td>
        </tr>
    </form>
</table>
</body>
</html>
