<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
<body>

<script type="text/javascript">
   //가로,세로를 입력했는지를 체크
   function goBox(){
	   select = document.getElementsByTagName('select');
	  
	   if(select[0].value == 0){
		   alert("만들고자 하는 표의 가로행을 클릭하십시요");
		   return ;
	   }//document.BoxForm.tr_cnt.options.selectedIndex==0
	   
	   else if(select[1].value ==0){
		   alert("만들고자 하는 표의 세로(열)을  선택해 주십시오") ;
		   return ;
		   
	   }//document.BoxForm.td_cnt.options.selectedIndex==0
	  
	   document.BoxForm.submit();
   }//goBox()
</script>

<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>표만들기</title>
</head>
<body>
 <form name="BoxForm" method="post" action="box_proc.jsp">
 표만들기 설정<br>
 가로(행)
  <select name="tr_cnt">
      <option value="0">선택</option>
      <option value="1">1</option>
      <option value="2">2</option>
      <option value="3">3</option>
      <option value="4">4</option>
      <option value="5">5</option>
      <option value="6">6</option>
      <option value="7">7</option>
      <option value="8">8</option>
      <option value="9">9</option>
  </select><br>
  
 세로(열)
  <select name="td_cnt">
      <option value="0">선택</option>
      <option value="1">1</option>
      <option value="2">2</option>
      <option value="3">3</option>
      <option value="4">4</option>
      <option value="5">5</option>
      <option value="6">6</option>
      <option value="7">7</option>
      <option value="8">8</option>
      <option value="9">9</option>
  </select><br>
  <a href="JavaScript:goBox()">표만들기</a>
 </form>
</body>
</html>
</body>
</html>