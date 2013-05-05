<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'bidinfolist.jsp' starting page</title>

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
		<table border="1">
			<tr>
				<td>
					序号
				</td>
				<td>
					招标项目名称
				</td>
				<td>
					招标书上传
				</td>
				<td>
					标书截止下载日期
				</td>
				<td>
					开标时间
				</td>
				<td>
					截标时间
				</td>
				<td>
					开标地点
				</td>
				<td>
					招标公告文件
				</td>
				<td>
					招标代理
				</td>
				<td>
					招标公告
				</td>
			</tr>

			<c:forEach items="${requestScope.listTender}" var="key"
				varStatus="id" begin="0">
				<tr>
					<td>
						${ id.index + 1}
					</td>
					<td>
						${ key.tenTitle}
					</td>
					<td>
						${ key.tenUp}
					</td>
					<td>
						${ key.tenCdown}
					</td>
					<td>
						${ key.openTime}
					</td>
					<td>
						${ key.closTime}
					</td>
					<td>
						${ key.placeBidOpen}
					</td>
					<td>
						${ key.tenNoticeFile}
					</td>
					<td>
						${ key.bidAgent}
					</td>
					<td>
						${ key.tenNotice}
					</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>
