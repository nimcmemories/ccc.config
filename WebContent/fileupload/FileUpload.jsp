<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="upload" method="POST" enctype="multipart/form-data"
		action="../HelloWorld">
		<input type="hidden" name="fileupload" value="fileupload" /> <input
			type="file" name="uploadfile" /> <input type="submit" name="upload"
			value="Upload" />
	</form>
</body>
</html>