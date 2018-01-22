<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/view/common/header.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<br>
전인덱스 파일입니다 <br>
무슨짓을 하건 저만보입니다.<br>
	<%= "니가보낸 test값은" + request.getParameter("test") + "맞지?"%>
	<br>	
	니가보낸 test값은 ${param.test}맞지?<br>
	${list}
	<br>
	<c:forEach items="${menuList}" var="m">
	${m.mNum} ${m.mUrl}${m.mName}${m.mDesc}<br>
	</c:forEach>

		
</body>
</html>