<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2017/10/22
  Time: 19:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询成绩</title>
</head>
<body>
<table align="center">
    <form action="/Tselectcl" method="get">
    <tr>
        <td>
   <select name="select" style="width: 100px">
       <option value="1">语文</option>
       <option value="2">数学</option>
       <option value="3">英语</option>
   </select>
        </td>
    </tr>
    <tr>
        <td>
    <input type="submit" value="提交"/>
        </td>
    </tr>
</form>
</table>
</body>
</html>
