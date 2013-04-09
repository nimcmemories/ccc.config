<%@page import="bean.UserBean"%>
<%@page import="bean.LoginBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	UserBean userBean = request.getAttribute("userbean")!=null?(UserBean)request.getAttribute("userbean"):null;
%>
	<form name="userupdate" action="HelloWorld" method="post">
		<input type="hidden" name="actionid" value="2" /> <input type="hidden"
			name="userid" value='<%=userBean.getId() %>' />
		<table>
			<tr>
				<td>First Name</td>
				<td>Middle Name</td>
				<td>Last Name</td>
				<td>Mobile Number</td>
			</tr>
			<tr>
				<td><input type="text" name="firstname"
					value='<%=userBean.getFirstname()%>' /></td>
				<td><input type="text" name="midname"
					value='<%=userBean.getMidname()%>' /></td>
				<td><input type="text" name="lastname"
					value='<%=userBean.getLastname()%>' /></td>
				<td><input type="text" name="mob"
					value='<%=userBean.getMob()%>' /></td>
			</tr>
		</table>
		<input type="submit" name="Update" />
	</form>
</body>
</html>