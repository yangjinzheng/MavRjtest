<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2017/10/26
  Time: 19:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询成绩</title>
</head>
<body>
<table align="center">
    <form action="/Stuselect" method="get">
        <tr>
            <td>
                <input type="number" placeholder="请输入数字" style="width: 100px" name="stuid"/>
            </td>
            <td><input type="submit" value="确定"/></td>
        </tr>
    </form>
</table>
</body>
</html>
