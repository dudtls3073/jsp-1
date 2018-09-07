<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ch14.bookshop.shopping.CustomerDBBean"%>

<% request.setCharacterEncoding("utf-8");%>

<%
    String id = request.getParameter("id");
	String passwd  = request.getParameter("passwd");
	String saveId = request.getParameter("saveId"); //checkbox
	Cookie idCookie = null;
	
	CustomerDBBean manager = CustomerDBBean.getInstance();
    int check= manager.userCheck(id,passwd);

	if(check==1){
		if(saveId != null) { //체크박스 체크상태
			idCookie = new Cookie("id", id);
			idCookie.setMaxAge(60*60*24);
		}
		else {
			idCookie = new Cookie("id", "");
			idCookie.setMaxAge(0);
		}
		response.addCookie(idCookie);
		session.setAttribute("id",id);
		response.sendRedirect("shopMain.jsp");
	}else if(check==0){%>
    <script> 
	  alert("비밀번호가 맞지 않습니다.");
      history.go(-1);
	</script>
<%}else{ %>
	<script>
	  alert("아이디가 맞지 않습니다.");
	  history.go(-1);
	</script>
<%}%>