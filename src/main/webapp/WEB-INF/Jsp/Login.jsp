
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title>登陆</title>
  <style type="text/css">
    .p1
    {    font-family:"隶书";
      font-size:36px;
      color:#C00;
    }
    .b
    {
      background-image:url("../../loginpic/pic.jpg");
      width: 100%;
      height: 100%;
    }
    .p3
    {
      color:#C03;
      font-family:"隶书";
      font-size:24px;
    }
  </style>
  <script type="text/javascript">
      function rec(form)
      {
          var a=form.pwd.value;
          if(a)
              alert("恭喜您，登陆成功！");
      }
  </script>
</head>

<body class="b">
<div >
<table width="55%" height="50%" border="1" align="center">
  <form action="/login" name="form1" method="get">
    <tr>
      <td height="81" colspan="2" align="center"><p class="p1">欢迎登录学生成绩管理系统！</p></td>
    </tr>
    <tr>
      <td width="135" align="center"><p class="p3">用户名：</td>
      <td width="589">
        <input type="text" name="loginname" /></td>
    </tr>
    <tr>
      <td height="115" align="center"><p class="p3">密码：</td>
      <td><input type="password" name="loginpass"/></td>
    </tr>
    <tr>
      <td colspan="2" align="center"><input align="center" type="radio" name="radio" value="1"/>学生<input type="radio" name="radio" value="2"/>教师<input type="radio" name="radio" value="3"/>管理员</td>
    </tr>
    <tr>
      <td height="39" colspan="2" align="center">
        <input type="submit" name="button2" id="button2" value="登录" onclick="rec(this.form)" />
        <input type="reset" name="chongzhi" id="chongzhi" value="重置" /></td>
    </tr>
  </form>
</table>
</div>
</body>
</html>
