<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>招标投标系统登录页</title>
<style type="text/css">
#all {margin-left:auto; margin-right:auto; text-align: center;width: 540px;}
body {text-align:center;}
#main {background:url(<%=basePath%>jsp/frame/images/login_mid.gif); height:240px; text-align:center;}
#title {height:66px;margin-top: 120px;}
#login { margin-top: 32px; width: 420px; margin-left: auto; margin-right:auto;}
#btm_left {background:url(<%=basePath%>jsp/frame/images/login_btm_left.gif) no-repeat; width:21px; float:left;}
#btm_mid {background:url(<%=basePath%>jsp/frame/images/login_btm_mid.gif); width:498px; float:left;}
#btm_right {background:url(<%=basePath%>jsp/frame/images/login_btm_right.gif) no-repeat; width:21px; float:left;}
</style>
<script type="text/javascript" language="javascript">
function reset_form()
{
	document.getElementById('username').value = '';
	document.getElementById('password').value = '';
	return false;
}
					 
</script>
</head>

<body>
<div id="all">
    <div id="title"><img src="<%=basePath%>jsp/frame/images/login_title.gif" /></div>
    <div id="main">
    	<form action="<%=basePath %>user/login" method="post" id="login_form">
        <table id="login">
        	<tr>
            	<td>U S E R N A M E  </td>
                <td><input type="text" name="user.uname" id="username" size="32" style="background:url(<%=basePath%>jsp/frame/images/username_bg.gif) left no-repeat #FFF; border:1px #ccc solid;height: 20px; font-family:Arial, Helvetica, sans-serif; font-size:14px; font-weight: 800; margin:0; padding-left: 24px;" /></td>
            </tr>
            <tr><td></td><td></td></tr>
            <tr><td></td><td></td></tr>
            <tr>
            	<td>P A S S W O R D  </td>
                <td><input type="password" name="user.upwd" id="password" size="32" style="background:url(<%=basePath%>jsp/frame/images/password_bg.gif) left no-repeat #FFF; border: 1px #ccc solid; height: 20px; font-family:Arial, Helvetica, sans-serif; font-size:14px; font-weight: 800; margin:0; padding-left: 24px;" /></td>
            </tr>
            <tr>
            	<td></td>
            	<td style="text-align: left; padding-top: 32px;">
                	<input type="image" src="<%=basePath%>jsp/frame/images/login.gif" name="submit" onclick="javascript:document.getElementById('login_form').submit();" />&nbsp;&nbsp;&nbsp;
                    <input type="image" src="<%=basePath%>jsp/frame/images/cancel.gif" name="cancel" onclick="reset_form();" />
                </td>
            </tr>
        </table>
    </div>
    <div id="btm">
        <div id="btm_left"></div>
        <div id="btm_mid"></div>
        <div id="btm_right"></div>
    </div>
</div>
</body>
</html>
