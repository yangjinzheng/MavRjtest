<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2017/10/21
  Time: 10:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改成绩</title>
</head>
<body>
<table align="center">
    <form action="/xgscorecl"method="get">
       <tr>
           <td><input type="number" placeholder="请输入数字" name="stuid"/> </td>
           <td><input type="submit" value="查询"/> </td>
       </tr>
    </form>
</table>
</body>
</html>
