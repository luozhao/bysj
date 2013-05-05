<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>新增招标信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <a href="<%=basePath %>tender/tenm_tenList">列表页</a>  
  <hr/>
  <form action="<%=basePath %>tender/tenm_tenAdd" method="post">
   	<table border="1">
   		<tr>
   			<td>招标项目名称</td>
   			<td><input type="text" name="tender.tenTitle"/></td>
   		</tr>
   		<tr>
   			<td>招标书上传</td>
   			<td><input type="text" name="tender.tenUp"/></td>
   		</tr>
   		<tr>
   			<td>标书截止下载日期</td>
   			<td><input type="text" name="tender.tenCdown"/></td>
   		</tr>
   		<tr>
   			<td>开标时间</td>
   			<td><input type="text" name="tender.openTime"/></td>
   		</tr>
   		<tr>
   			<td>截标时间</td>
   			<td><input type="text" name="tender.closTime"/></td>
   		</tr>
   		<tr>
   			<td>开标地点</td>
   			<td><input type="text" name="tender.placeBidOpen"/></td>
   		</tr>
   		<tr>
   			<td>招标公告文件</td>
   			<td><input type="text" name="tender.tenNoticeFile"/></td>
   		</tr>
   		<tr>
   			<td>招标代理</td>
   			<td><input type="text" name="tender.bidAgent"/></td>
   		</tr>
   		<tr>
   			<td>招标公告</td>
   			<td><input type="text" name="tender.tenNotice"/></td>
   		</tr>
   		<tr>
   			<td colspan="2">
   				<input type="submit" value="提交"/>
   			</td>
   		</tr>
   	</table>
   	</form>
  </body>
</html>
