<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
 
<%@page import="java.util.*"%>
<%request.setCharacterEncoding("UTF-8");%>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<p> <a href="${pageContext.request.contextPath}/semesterinquiry">① 학기별 이수 학점 조회</a>
	<p> <a href="${pageContext.request.contextPath}/divisiongrade">② 이수 구분별 학점 조회</a>
	<p> <a href="${pageContext.request.contextPath}/createcourse">③ 수강 신청하기</a>
	<p> <a href="${pageContext.request.contextPath}/checkcreatedcourse">④ 수강 신청 조회 메뉴</a>
</body>
</html>
