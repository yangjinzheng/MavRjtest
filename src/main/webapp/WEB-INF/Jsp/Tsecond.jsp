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
    <title>二次考试</title>
</head>
<body>
    <table border="1" align="center" width="40%">
        <form action="/Tsecondcl" method="get" >
            <tr>
                <td>考试名称：</td>
                <td><input type="text" name="testname"/></td>
            </tr>
            <tr>
                <td>考试时间：</td>
                <td><input type="text" name="testtime"/> </td>
            </tr>
            <tr>
                <td>考试地点：</td>
                <td><input type="text" name="testaddre"/> </td>
            </tr>
            <tr>
                <td>考试人数：</td>
                <td><input type="number" placeholder="请输入数字" name="testnum"/> </td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input align="center" type="submit" value="确认提交"/>
                </td>
            </tr>
        </form>
    </table>
</body>
</html>
