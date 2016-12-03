<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

</head>
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="${pageContext.request.contextPath}/docreate">
		<table>
			
			<tr>
				<td>과목 코드 :</td>
				<td><input name="code" type="text" /></td>
			</tr>
			<tr>
				<td>과목명 :</td>
				<td><input name="subject" type="text" /></td>
			</tr>
			<tr>
				<td>이수 구분 :</td>
				<td><input name="division" type="text" /></td>
			</tr>
			<tr>
				<td>이수 학점 :</td>
				<td><input name="grade" type="text" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input value="Create course" type="submit" /></td>
			</tr>
			
		</table>
	</form>
</body>
</html>