<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	index jsp ${admin.name}
<%-- 	<form action="${pageContext.request.contextPath}/admin/upload" method="post"
		enctype="multipart/form-data">
		<input type="file" name="file" /> <input type="submit">
	</form> --%>
	<form action="${pageContext.request.contextPath}/admin/login" method="post">
		<input type="text" name="name" />
		<input type="text" name="pwd" />
		<input type="submit" />
	</form>
</body>
</html>