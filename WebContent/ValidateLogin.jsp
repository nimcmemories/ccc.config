<%@page import="org.apache.catalina.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript">
	
</script>

<%
		if(request == null || request.getSession().getAttribute("userbean")==null){
			response.sendRedirect("sign-in.html");
			return;
		}
	%>
</head>
<body>

</body>
</html>