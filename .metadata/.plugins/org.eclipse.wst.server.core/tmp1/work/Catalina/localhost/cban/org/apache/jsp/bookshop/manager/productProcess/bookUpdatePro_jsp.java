/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.50
 * Generated at: 2018-06-21 16:48:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.bookshop.manager.productProcess;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import ch14.bookshop.master.ShopBookDBBean;
import java.sql.Timestamp;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;
import java.util.*;
import java.io.*;

public final class bookUpdatePro_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.oreilly.servlet.multipart.DefaultFileRenamePolicy");
    _jspx_imports_classes.add("java.sql.Timestamp");
    _jspx_imports_classes.add("ch14.bookshop.master.ShopBookDBBean");
    _jspx_imports_classes.add("com.oreilly.servlet.MultipartRequest");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 request.setCharacterEncoding("utf-8");
      out.write("\r\n");
      out.write("\r\n");

String realFolder = "";//웹 어플리케이션상의 절대 경로
String filename ="";
MultipartRequest imageUp = null;

String saveFolder = "/imageFile";//파일이 업로드되는 폴더
String encType = "utf-8"; //엔코딩타입
int maxSize = 2*1024*1024;  //최대 업로될 파일크기 5Mb

//현재 jsp페이지의 웹 어플리케이션상의 절대 경로를 구한다
ServletContext context = getServletContext();
realFolder = context.getRealPath(saveFolder);  

try{
   
   //전송을 담당할 콤포넌트를 생성하고 파일을 전송한다.
   //전송할 파일명을 가지고 있는 객체, 서버상의 절대경로,최대 업로드될 파일크기, 문자코드, 기본 보안 적용
   imageUp = new MultipartRequest(request,realFolder,
		   maxSize,encType,new DefaultFileRenamePolicy());
   
   //전송한 파일 정보를 가져와 출력한다
   Enumeration<?> files = imageUp.getFileNames();
   
   //파일 정보가 있다면
   while(files.hasMoreElements()){
    //input 태그의 속성이 file인 태그의 name 속성값 :파라미터이름
      String name = (String)files.nextElement();
   
   //서버에 저장된 파일 이름
      filename = imageUp.getFilesystemName(name);
   }
}catch(IOException ioe){
 System.out.println(ioe);
}catch(Exception ex){
 System.out.println(ex);
}

      out.write("\r\n");
      out.write("\r\n");
      ch14.bookshop.master.ShopBookDataBean book = null;
      book = (ch14.bookshop.master.ShopBookDataBean) _jspx_page_context.getAttribute("book", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (book == null){
        book = new ch14.bookshop.master.ShopBookDataBean();
        _jspx_page_context.setAttribute("book", book, javax.servlet.jsp.PageContext.PAGE_SCOPE);
        out.write('\r');
        out.write('\n');
      }
      out.write("\r\n");
      out.write("\r\n");

 int book_id= Integer.parseInt( imageUp.getParameter("book_id"));
 String book_kind = imageUp.getParameter("book_kind");
 String book_title = imageUp.getParameter("book_title");
 String book_price = imageUp.getParameter("book_price");
 String book_count = imageUp.getParameter("book_count");
 String author = imageUp.getParameter("author");
 String publishing_com = imageUp.getParameter("publishing_com");
 String book_content = imageUp.getParameter("book_content");
 String discount_rate = imageUp.getParameter("discount_rate");

 String year = imageUp.getParameter("publishing_year");
 String month = (imageUp.getParameter("publishing_month").length()==1)?
		 "0"+ imageUp.getParameter("publishing_month"): 
			 imageUp.getParameter("publishing_month");
 String day =  (imageUp.getParameter("publishing_day").length()==1)?
		 "0"+ imageUp.getParameter("publishing_day"): 
			 imageUp.getParameter("publishing_day");

 book.setBook_kind(book_kind);
 book.setBook_title(book_title);
 book.setBook_price(Integer.parseInt(book_price));
 book.setBook_count(Short.parseShort(book_count));
 book.setAuthor(author);
 book.setPublishing_com(publishing_com);
 book.setPublishing_date(year+"-"+month+"-"+day);
 book.setBook_image(filename);
 book.setBook_content(book_content);
 book.setDiscount_rate(Byte.parseByte(discount_rate));
 book.setReg_date(new Timestamp(System.currentTimeMillis()));

ShopBookDBBean bookProcess = ShopBookDBBean.getInstance();
bookProcess.updateBook(book, book_id); 

response.sendRedirect("bookList.jsp?book_kind="+book_kind);


    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
