<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2017/10/25
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加学生</title>
</head>
<body>
<table align="center" width="45%" border="1">
    <form action="/Taddstu" method="get">
        <tr>
            <td>考号：</td>
            <td><input type="number" placeholder="请输入数字" name="stuid"/></td>
        </tr>
        <tr>
            <td>姓名：</td>
            <td><input type="text" name="stuname"/> </td>
        </tr>
        <tr>
            <td>班级：</td>
            <td><input type="text" name="stuclass"/> </td>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <input type="submit" align="center" value="确认提交"/>
            </td>
        </tr>
    </form>

</table>
</body>
</html>
