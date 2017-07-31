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
	int option1 =Integer.parseInt(request.getParameter("tr_cnt"));
	int option2 =Integer.parseInt(request.getParameter("td_cnt"));

%>
	<table border = '1' width='200' height='80'>
		<% for(int i=0; i < option1 ; i++ ){%>
			<tr>
		<% for(int j = 0; j< option2 ; j++){%>
					<td></td>
		<%}%>
			</tr><% }%>
	</table>
	
	<a href="JavaScript:history.go(-1)">다시만들기</a>
</body>
</html>