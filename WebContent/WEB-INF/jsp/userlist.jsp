<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="js/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="js/ajaxjson.js"></script>
 
</head>
<body style="text-align:center">
		<div style="text-align:center;">
			用户名:<input align="center" type="text" id="txtName" />
		</div>
			<input  type="button" id="btn" value="获取数据" /><br>
			<table border=3 width=380 align="center" valign="top">
				<tr>
					<td>
						<table border=1 cellSpacing=0 cellPadding=2 width=380 align="center" valign="top">
							<tr align="center" valign="top">
								<td>编号</td>	
								<td>姓名</td>
								<td>性别</td>
							</tr>
							<tr>
								<tbody align="center" id="content"></tbody> 
							</tr>
						</table>
					</td>
				</tr>
			</table>
</body>
</html>
