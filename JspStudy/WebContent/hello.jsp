<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP 첫번째 예제</title>
</head>
<body>
<% 
     //자바코드를 사용할 수 있는 영역(Scriptlet)->지역변수선언,제어문
     String str="테스트";
     System.out.println("str=>"+str);//디버깅용
     out.println("<h1>"+"str=>"+str+"</h1>");//웹에 출력
 %>
 <%=str%>
</body>
</html>







