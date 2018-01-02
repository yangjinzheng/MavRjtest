<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2017/10/24
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改成绩</title>
</head>
<body>
<table align="center" width="45%" border="1">
  <form action="/upscore" method="get">
      <tr>
          <td>姓名：</td>
          <td><input type="text" name="stuname" readonly="readonly " value="${infor.stuname}"/> </td>
      </tr>
      <tr>
          <td>考号：</td>
          <td><input type="text"  name="stuid" readonly="readonly " value="${infor.stuid}"/> </td>
      </tr>
      <tr>
          <td>班级：</td>
          <td><input type="text" readonly="readonly " value="${infor.stuclass}" name="stuclass"/> </td>
      </tr>
      <tr>
          <td>语文成绩：</td>
          <td><input type="number" step="0.01" placeholder="请输入数字" name="chinscore" value="${infor.chinscore}"/> </td>
      </tr>
      <tr>
          <td>数学成绩：</td>
          <td><input type="number"step="0.01" placeholder="请输入数字" name="mathscore" value="${infor.mathscore}"/> </td>
      </tr>
      <tr>
          <td>英语成绩：</td>
          <td><input type="number" step="0.01" placeholder="请输入数字" name="engscore" value="${infor.engscore}"/> </td>
      </tr>
      <tr>
          <td colspan="2" align="center"><input type="submit" value="确认提交"/></td>
      </tr>
  </form>
</table>
</body>
</html>
