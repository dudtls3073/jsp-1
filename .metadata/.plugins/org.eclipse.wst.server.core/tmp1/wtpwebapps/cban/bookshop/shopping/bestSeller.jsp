<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "ch14.bookshop.master.ShopBookDBBean" %>
<%@ page import = "ch14.bookshop.master.ShopBookDataBean" %>
<%@ page import = "ch14.bookshop.shopping.CommentDBBean" %>
<%@ page import = "ch14.bookshop.shopping.CommentDataBean" %>
<%@ page import = "java.util.List" %>
<%@ page import = "java.text.NumberFormat" %>
    
<%
	request.setCharacterEncoding("utf-8");
	String title = "Book Shopping Mall";
	String book_kind = "best";
	
	 List<ShopBookDataBean> bookLists = null;
	 ShopBookDataBean bookList = null;
	 ShopBookDBBean bookProcess = ShopBookDBBean.getInstance();
	 bookLists = bookProcess.getBooks(book_kind);
	 
	 CommentDBBean dbPro = CommentDBBean.getInstance();
%>

<jsp:include page="../module/header.jsp" flush="false">
	<jsp:param name="title" value="<%=title %>"/>
</jsp:include>

<div class="container">
<div class="row">
<div class="col-md-8 blog-main">
<h3 class="pb-3 mb-4 font-italic border-bottom">Best Seller</h3>

<%
	for(int i=0;i<bookLists.size();i++){
		bookList = (ShopBookDataBean)bookLists.get(i);
		int count = dbPro.getCommentCount(bookList.getBook_id());
		double avgstar = dbPro.avgStar(bookList.getBook_id());
		String star_img = "0";
		if (avgstar >= 0 && avgstar < 1)
			star_img = "0";
		else if (avgstar >= 1 && avgstar < 1.5) 
			star_img = "1";
		else if (avgstar >= 1.5 && avgstar < 2)
			star_img = "1_5";
		else if (avgstar >= 2 && avgstar < 2.5)
			star_img = "2";
		else if (avgstar >= 2.5 && avgstar < 3) 
			star_img = "2_5";
		else if (avgstar >= 3 && avgstar < 3.5)
			star_img = "3";
		else if (avgstar >= 3.5 && avgstar < 4)
			star_img = "3_5";
		else if (avgstar >= 4 && avgstar < 4.5)
			star_img = "4";
		else if (avgstar >= 4.5 && avgstar < 5)
			star_img = "4_5";
		else 
			star_img = "5";
%>

<table class="table table-borderless"> 
<tr> 
	<td rowspan="4">
        <a href="bookContent.jsp?book_id=<%=bookList.getBook_id()%>">
       <img src="/cban/imageFile/<%=bookList.getBook_image()%>" border="0" width="60" height="90"></a>
</td> 
    	<td><b><a href="bookContent.jsp?book_id=<%=bookList.getBook_id()%>">
       <%=bookList.getBook_title() %></a></b>
       </td> 
    <td rowspan="4">
      <%if(bookList.getBook_count()==0){ %>
            <b>일시품절</b>
      <%}else{ %>
            &nbsp;
      <%} %>
    </td>
  </tr>        
  <tr> 
     <td><%=bookList.getAuthor()%>저 | <%=bookList.getPublishing_com()%> | <%=bookList.getPublishing_date() %></td> 
  </tr>
  <tr> 
     <td><%=NumberFormat.getInstance().format(bookList.getBook_price())%>원 -> <b><font color="red">
       <%=NumberFormat.getInstance().format((int)(bookList.getBook_price()*((double)(100-bookList.getDiscount_rate())/100)))%>원</font></b>
       (<%=NumberFormat.getInstance().format(bookList.getDiscount_rate()) %>% 할인)
      </td> 
  </tr> 
  <tr>
  	<td>리뷰 (<%=count %>)개 | 평균 별점 <img src="/cban/imageFile/rating<%=star_img%>.png" width="100"> (<%=avgstar %>)</td>
  </tr>
</table>
<hr>

<%
	}
%>

</div> <!-- /.blog-main -->
<jsp:include page="../module/side.jsp" flush="false" /> <!-- aside -->
</div> <!-- /.row -->

</div> <!-- /.container -->


<jsp:include page="../module/footer.jsp" flush="false"/>