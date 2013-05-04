<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>
</head>

<frameset cols="*" rows="136, *" id="<%=basePath%>jsp/frame/frame_main"  border="0">
    <frame src="<%=basePath%>jsp/frame/header.html" noresize="noresize" name="header">
    
    <frameset cols="240, *">
    	<frame src="<%=basePath%>jsp/frame/menu.html" name="menu" />
    	<frame src="<%=basePath%>jsp/frame/main.html" name="main">
    </frameset>
</frameset>

<noframes><body>
</body>
</noframes></html>
