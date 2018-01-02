<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="keywords" content="jquery,ui,easy,easyui,web">
    <meta name="description" content="easyui help you build your web page easily!">
    <title>学生成绩管理系统</title>
    <link rel="stylesheet" type="text/css" href="ui/themes/ui-pepper-grinder/easyui.css">
    <link rel="stylesheet" type="text/css" href="ui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="ui/demo/demo.css">
    <script type="text/javascript" src="ui/jquery.min.js"></script>
    <script type="text/javascript" src="ui/jquery.easyui.min.js"></script>
    <script>
        function addTab(title, url){
            if ($('#tt').tabs('exists', title)){
                $('#tt').tabs('select', title);
            } else {
                var content = '<iframe scrolling="auto" frameborder="0"  src="'+url+'" style="width:100%;height:100%;"></iframe>';
                $('#tt').tabs('add',{
                    title:title,
                    content:content,
                    closable:true
                });
            }
        }
    </script>
</head>
<body>
<div>
    <table align="center">
        <tr>
            <td width="70%" align="center">${lname}已登录</td>
            <td width="30%" align="right"><a href="Tuichu">退出登录</a></td>
        </tr>
    </table>
</div>
<div class="easyui-layout" style="width:100%;height:100%;">
<div region="west" split="true" title="功能区" style="width:150px;">
        <div>
            <a href="#" class="easyui-linkbutton" onclick="addTab('上传成绩','TShscore')">上传成绩</a><br/>
        </div>
        <div>
        <a href="#" class="easyui-linkbutton" onclick="addTab('查询成绩','Tselect')">查询成绩</a><br/>
        </div>
        <div>
        <a href="#" class="easyui-linkbutton" onclick="addTab('安排二次考试','/Tsecond')">安排二次考试</a><br/>
        </div>
        <div>
        <a href="#" class="easyui-linkbutton" onclick="addTab('修改成绩','Txgscore')">修改成绩</a><br/>
        </div>
    </div>
    <div id="content" region="center" title="工作区" style="padding:5px;">
        <div id="tt" class="easyui-tabs" style="width:100%;height:100%;">
            <div title="Home">
            </div>
        </div>
    </div>
</div>
</body>
</html>