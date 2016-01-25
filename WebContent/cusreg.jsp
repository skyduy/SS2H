<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>注册页面</title>
</head>
<body>
	<s:form action="cusreg" method="post">
		<table width="60%" height="76" border="0">
			<s:textfield name="customerId" label="客户编号"/>
			<s:textfield name="name" label="客户姓名"/>
			<s:textfield name="phone" label="客户电话"/>
			<s:submit value="提交" align="center"/>
		</table>
	</s:form>
</body>
</html>