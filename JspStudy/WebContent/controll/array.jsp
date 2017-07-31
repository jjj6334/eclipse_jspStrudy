<%@page import="com.sun.org.apache.xpath.internal.compiler.Keywords"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<%!
	String keyword[] = {"Expression","ScriptLet", "Declaration","comment"};

%>
</head>
<body>

<%-- <%
	for(int i=0 ; i < keyword.length;i++)
		out.println("<table border = "+1+">"+
						"<tr>"+
							"<td>"+i+"</td>"+
							"<td>"+keyword[i]+"</td>"+
						"</tr>"
							);
%>	

 --%>
 
<%
	for(int i=0 ; i < keyword.length;i++){
%>	
	<table border ="1" width="200">
		<tr>
			<td width="30"><%=i%></td>
			<td><%=keyword[i] %></td>
		</tr>
	
	</table>
<%
	}
%>
		


</body>
</html>